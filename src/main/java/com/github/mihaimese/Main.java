package com.github.mihaimese;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("This works as intended");
        log.warn("This is a warning sample");
        log.error("This exemplifies an error");
    }
}
