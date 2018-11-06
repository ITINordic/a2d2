/**
 * Created by regnatpopulus on 21/04/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source name must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package com.itinordic.a2d2.security;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyProperties;

import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.UnrecoverableEntryException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.security.auth.x500.X500Principal;

import static java.security.KeyStore.*;

public class BasicRSASecurityProviderImpl implements BasicRSASecurityProvider {

    private final KeyPairGenerator kpg;
    private final Calendar start;
    private final Calendar end;
    private final Context context;

    public BasicRSASecurityProviderImpl(Context context) throws NoSuchProviderException, NoSuchAlgorithmException {

        start = new GregorianCalendar();
        end = new GregorianCalendar();
        end.add(Calendar.YEAR, 3);
        this.context = context;
        kpg = KeyPairGenerator.getInstance(
                KeyProperties.KEY_ALGORITHM_RSA, "AndroidKeyStore");
    }

    public KeyPair initGenerator(String alias)
            throws InvalidAlgorithmParameterException {

        //Check if entry already exists, if true, delete
        try {
            //get keystore
            KeyStore keyStore = null;
            keyStore = getInstance("AndroidKeyStore");
            keyStore.load(null);

            if (keyStore.getEntry(alias,null) !=null)
            {
                keyStore.deleteEntry(alias);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (CertificateException e) {
            e.printStackTrace();
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnrecoverableEntryException e) {
            e.printStackTrace();
        } catch (KeyStoreException e) {
            e.printStackTrace();
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            kpg.initialize(new KeyGenParameterSpec.Builder(
                    alias,
                    KeyProperties.PURPOSE_ENCRYPT | KeyProperties.PURPOSE_DECRYPT)
                    .setBlockModes(KeyProperties.BLOCK_MODE_ECB)
                    .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_RSA_PKCS1)
                    .setCertificateNotBefore(start.getTime())
                    .setCertificateNotAfter(end.getTime())
                    .setCertificateSerialNumber(BigInteger.ONE)
                    .setCertificateSubject(new X500Principal("CN=" + alias))
                    .build());
        } else {
            kpg.initialize(new KeyPairGeneratorSpec.Builder(context)
                    .setAlias(alias)
                    .setSerialNumber(BigInteger.ONE)
                    .setSubject(new X500Principal("CN=" + alias))
                    .setStartDate(start.getTime())
                    .setEndDate(end.getTime())
                    .build());
                }

                return kpg.generateKeyPair();
        }

    public byte[] encryptData(String data, String alias) throws NoSuchProviderException,
            NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException,
            BadPaddingException, KeyStoreException, IOException, CertificateException, UnrecoverableEntryException {

        //get public key
        KeyStore keyStore = getInstance("AndroidKeyStore");
        keyStore.load(null);

        //get keystore entry using alias
        Entry entry = keyStore.getEntry(alias,null);

        //Encrypt
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");

        cipher.init(Cipher.ENCRYPT_MODE, ((PrivateKeyEntry) entry).getCertificate().getPublicKey());

        return cipher.doFinal(data.getBytes());
    }

    public byte[] decryptData(byte[] data, String alias) throws NoSuchProviderException,
            NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException,
            BadPaddingException, KeyStoreException, IOException, CertificateException, UnrecoverableEntryException {

        //get keystore
        KeyStore keyStore = getInstance("AndroidKeyStore");
        keyStore.load(null);

        //get keystore entry using alias
        Entry entry = keyStore.getEntry(alias,null);
  
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");

        cipher.init(Cipher.DECRYPT_MODE, ((PrivateKeyEntry) entry).getPrivateKey());

        return cipher.doFinal(data);

    }

}
