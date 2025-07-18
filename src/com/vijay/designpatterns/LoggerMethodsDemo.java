package com.vijay.designpatterns;

import java.util.logging.*;

public class LoggerMethodsDemo {

    private static final Logger logger = Logger.getLogger(LoggerMethodsDemo.class.getName());

    public static void main(String[] args) {

        // Set log level to ALL (to see all logs)
        logger.setLevel(Level.ALL);

        // ConsoleHandler to display logs in console
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        logger.addHandler(handler);

        // Disable parent handlers (optional to avoid duplicate logs)
        logger.setUseParentHandlers(false);

        // Log messages at various levels
        logger.severe("🔴 SEVERE: Critical error!");
        logger.warning("🟠 WARNING: Something might be wrong.");
        logger.info("🟢 INFO: Just an update.");
        logger.config("🔵 CONFIG: Configuration loaded.");
        logger.fine("⚪ FINE: Debug info 1.");
        logger.finer("⚪ FINER: Debug info 2.");
        logger.finest("⚪ FINEST: Debug info 3.");
    }
}
