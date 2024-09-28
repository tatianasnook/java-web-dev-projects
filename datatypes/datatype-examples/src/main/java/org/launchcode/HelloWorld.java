package org.launchcode;

import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        String str = "Rutabaga";
        String str1 = "Rutabaga";
        String[] letters = str.split("");

        System.out.println(Arrays.toString(letters));
        System.out.println(str.equals(str1));
    }
}
