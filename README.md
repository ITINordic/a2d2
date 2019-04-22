# a2d2 is a lightweight Android API for DHIS2 Tracker metadata

This API contains an object model for core DHIS2 web based tasks through its REST API and other extras to make it cool and fun. It also implements an OAuth2 process to ensure security. This is still in beta release.

To use it one would need to have some knowledge of asynchronous coding using RXJava, dependency injection using Dagger, JSON 'standard', Retrofit and DHIS2. While some components are not fully abstracted, we aim for a good architecture which works and can be continuously improved, and best, which can be understandable and is small. Consequently, we will concentrate on having only generic features to be within this API so it can be reused across as many projects.

# How to set up your project to use the library

You can simply create an instance of the library in your project by passing an your instance of an okhttpclient and url of your instance to the a2d2  Builder class. E.g

a2d2API api = new a2d2.Builder()
                .serverUrl(HttpUrl.parse(resourceProvider.getString(R.string.primary_url)))
                .okHttpClient(okHttpClient)
                .build();
                
From that point on you will be able to access the dhis2 api using the methods defined in the API. For instance, to log in you would simply call 

api.userTaskBuilder().authenticate(username, password);

You will get the User object from the api which you can store in a local database. We do not recommend storage of the password and rather we encourage password based authentication only at initial login in, from which point we have created other 'Task' objects to initialise and retrieve access tokens. We are in beta state with limited documentation. Currently there is an OAuth2 client that can be created at login, and should be used for subsequent calls. We understand DHIS2 supports the sharing of a single client across devices and this should be improved shortly.

Using this API, it is possible to retrieve metadata on programs and events and also to retrieve tracked entity instances. It is easily extensible and is open source. We have not versioned the api calls and it is currently working with 2.30, and 2.31. We have also not seen an incompatibility issues with 2.29. Either way, the simple architecture makes it possibe for others to use.

This is the first in a series of libraries which we hope will be useful to the community. We currently continue to actively develop the library. On how we implement it in our projects, we encourage a dependency injection framework such as dagger.

Happy coding!
