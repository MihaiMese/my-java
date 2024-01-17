package com.github.mihaimese.primitives;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrimitivesTester {

    private static final Logger log = LoggerFactory.getLogger(PrimitivesTester.class);

    public static void main(String[] args) {
        int myInt1 = 123;
        int myInt2 = 2_000_000_000;
        byte myByte1 = 127;
        short myShort1 = 32_000;
        boolean myBool1 = true;

        log.info("myInt1 = {}", myInt1);
        log.info("myInt2 = {}", myInt2);
        log.info("myByte1 = {}", myByte1);
        log.info("myShort1 = {}", myShort1);
        log.info("myBool1 = {}", myBool1);

        Integer myInteger1 = myInt1;
        log.info("myInteger1 = {}", myInteger1);
        log.info("Integer.max(1,2) = {}", Integer.max(1,2));
    }
}
