package com.guga.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogStashExample {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogStashExample.class);

    public static void main(String[] args) {
        LOGGER.info("Hi there!! ");
        LOGGER.warn("Wait a minute, I'm don't know you");
        try {
            LOGGER.info(String.format("Another number %n", 2 / 0));
        } catch (Exception ex) {
            LOGGER.error("Error trying find the string length ", ex);
        }
        LOGGER.info("End of examples..see the file json-format.log");
    }
}
