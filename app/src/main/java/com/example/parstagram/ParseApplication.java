package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Dd327CgMkdDb9Ch0bjho1YjITDObeCqf8xpyBVWf")
                .clientKey("GZxpgMoTdni6Wv3Ohq68yM4X9BdqTY8wxGIo0GOV")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }



}
