package com.github.mihaimese.primitives;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysTester {

    public static void main(String[] args) {
//        method1();
        method2();
    }

    private static void method1() {
        List<String> one = new ArrayList<>();
        one.add("A");
        one.add("B");
        one.add("C");

        System.out.println(one);
        one.remove("B");
        System.out.println(one);

        String[] arr = {"A", "B", "C"};
        List<String> two = List.of(arr);

        System.out.println(two);
        two.remove("B");
        System.out.println(two);
    }

    private static void method2() {
        List<Integer> items = Arrays.asList(9, 7, 5, 3);
        Collections.sort(items);
        System.out.println(Collections.binarySearch(items, 3));
        System.out.println(Collections.binarySearch(items, 2));
    }
}
