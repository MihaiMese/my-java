package com.github.mihaimese.primitives;

public class PrimitivesTester {

    public static void main(String[] args) {
        int myInt1 = 123;
        int myInt2 = 2_000_000_000;
        byte myByte1 = 127;
        short myShort1 = 32_000;
        boolean myBool1 = true;

        System.out.println(myShort1);


        Integer myInteger1 = myInt1;
        System.out.println(myInteger1);
        System.out.println(Integer.valueOf(myInt1));
        System.out.println(Integer.max(1,2));

        Integer int3 = 5;
        int int4 = int3;
    }
}
