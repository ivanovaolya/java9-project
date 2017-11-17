package com.education;

import java.util.logging.Logger;

import com.education.domain.Message;

/**
 * @author ivanovaolyaa
 * @version 11/17/2017
 */
public class Application {

    private static final Logger LOG = Logger.getLogger("Application");

    public static void main(String[] args) {
        final Message message = new Message("Hello World with Java 9!");
        LOG.info(message.getMessage());
    }

}
