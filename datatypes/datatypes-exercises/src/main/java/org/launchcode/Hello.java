package org.launchcode;

import java.util.Arrays;

public class Hello {
    public static void main(String[] args) {
        int[] someOtherInts = {1, 1, 2, 3, 5, 8};

        System.out.println("Hello, World!");
        System.out.println(someOtherInts[4]);
        System.out.print(Arrays.toString(someOtherInts));
    }
}
