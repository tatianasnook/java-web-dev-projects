package org.launchcode;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your name:");
        String name = input.nextLine();

        System.out.println("Hello " + name);

        System.out.println("How old are you?");
        int age = input.nextInt();
        input.close();

        System.out.println(name + "is" + age);
        int ageIn2049 = getLaterAge(age);
        System.out.println("In 2049 " + name + " will be " +  ageIn2049);

        System.out.println("Half of your age is " + divideAge(age));
    }

    public static int getLaterAge(int age) {
        return age + 25;
    }

    public static double divideAge(int age) {
        return age / 2;
    }
}
