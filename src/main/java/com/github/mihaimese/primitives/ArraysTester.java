package com.github.mihaimese.primitives;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysTester {

    private static final Logger log = LoggerFactory.getLogger(ArraysTester.class);

    public static void main(String[] args) {
        method1();
        method2();
    }

    private static void method1() {
        List<String> one = new ArrayList<>();
        one.add("A");
        one.add("B");
        one.add("C");

        log.info("list one: {}", one);
        one.remove("B");
        log.info("list one: {}", one);

        String[] arr = {"A", "B", "C"};
        List<String> two = List.of(arr);

        log.info("list two: {}", two);
    }

    private static void method2() {
        List<Integer> items = Arrays.asList(9, 7, 5, 3);
        log.info("items: {}", items);
        Collections.sort(items);
        log.info("sorted items: {}", items);
        log.info("binary search for 3: {}", Collections.binarySearch(items, 3));
        log.info("binary search for 2: {}", Collections.binarySearch(items, 2));
    }
}
