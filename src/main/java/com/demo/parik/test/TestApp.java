package com.demo.parik.test;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.concurrent.TimeUnit;

public class TestApp implements ITestApp{

    private static final Logger logger = LoggerFactory.getLogger(TestApp.class);

    private boolean loop = false;

    public TestApp() {
        logger.info("Staring Test App");
        loop = true;
    }

    @Override
    public void start() {
        try {
            while (loop) {
                logger.info("Running Test App");
                TimeUnit.SECONDS.sleep(1);
            }
        }
        catch (Exception ex) {
            logger.error("",ex);
        }
    }

    @Override
    public void stop() {
        loop = false;
        logger.info("Stopping Test App");
    }
}
