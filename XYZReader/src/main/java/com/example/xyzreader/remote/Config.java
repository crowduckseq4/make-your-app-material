package com.example.xyzreader.remote;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;
    // TODO remove TAG
    private static String TAG = Config.class.toString();

    static {
        URL url = null;
        try {
            url = new URL("https://go.udacity.com/xyz-reader-json" );
        } catch (MalformedURLException ignored) {
            // TODO: throw a real error (don't know if it's right)
            throw new AssertionError(ignored);
        }

        BASE_URL = url;
    }
}
