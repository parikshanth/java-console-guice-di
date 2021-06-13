package com.demo.parik;

import com.demo.parik.test.ITestApp;
import com.google.inject.Guice;

import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        var injector = Guice.createInjector(new DiHelper());

        var singleThreadExecutor = Executors.newSingleThreadExecutor();
        var app = injector.getInstance(ITestApp.class);
        singleThreadExecutor.execute(() -> {
            app.start();
        });


        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            app.stop();
            singleThreadExecutor.shutdown();
        }));
    }
}
