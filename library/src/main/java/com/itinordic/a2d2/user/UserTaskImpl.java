/**
 * Created by regnatpopulus on 02/04/2018.
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

package com.itinordic.a2d2.user;

import androidx.annotation.NonNull;
import com.itinordic.a2d2.a2d2Component;
import javax.inject.Inject;

import io.reactivex.Flowable;
import retrofit2.Response;

import static okhttp3.Credentials.basic;

public class UserTaskImpl implements UserTask {
    @Inject
    UserService userService;

    private a2d2Component a2d2component;

    private UserTaskImpl(a2d2Component a2d2component) {

        a2d2component.userComponent().build().inject(this);

    }

    public Flowable<Response<User>> authenticate(String username, String password) {

        if (username == null) {
            throw new IllegalStateException("The username must be set first");
        }

        if (password == null) {
            throw new IllegalArgumentException("The password must be set first");
        }

        return userService.authenticate(basic(username, password));
    }

    @Override
    public Flowable<Response<User>> getCurrentUser() {
        return userService.getCurrentUser();
    }

    //builder that returns a new UserTask instance when it is passed a URL
    public static class Builder {
        private a2d2Component component;

        public Builder() {
            // empty constructor
        }

        @NonNull
        public Builder a2d2Component(@NonNull a2d2Component component) {
            this.component = component;
            return this;
        }
        
        public UserTaskImpl build() {

            if (component == null) {
                throw new IllegalStateException("a2d2 component is null");
            }

            return new UserTaskImpl(component);
        }


    }
}
