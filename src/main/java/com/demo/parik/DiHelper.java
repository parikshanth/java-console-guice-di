package com.demo.parik;

import com.demo.parik.test.ITestApp;
import com.demo.parik.test.TestApp;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class DiHelper extends AbstractModule {

    @Override
    protected void configure() {

        bind(ITestApp.class).to(TestApp.class).in(Singleton.class);
    }
}
