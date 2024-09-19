package org.launchcode;

import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args) {
        int area;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        Integer length = input.nextInt();
        System.out.println("Enter the width of the rectangle:");
        Integer width = input.nextInt();
        area = length * width;

        System.out.println("The area of the rectangle is: " + area);
    }
}
