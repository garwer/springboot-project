package com.linjw.project;

import org.apache.log4j.Logger;
import org.junit.Test;


public class testJunit {
    Logger logger = Logger.getLogger(testJunit.class);
    @Test
    public void test1() {
        logger.info("666");
    }
}
