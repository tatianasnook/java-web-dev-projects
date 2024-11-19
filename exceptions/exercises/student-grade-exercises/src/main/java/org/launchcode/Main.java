package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        System.out.println(Divide(100, 2));
        System.out.println(Divide(10, 0));

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for (Map.Entry<String, String> student : studentFiles.entrySet()) {
            System.out.println(student.getKey() + ": " + CheckFileExtension(student.getValue()));
        }
    }

    public static int Divide(int x, int y) {
        try {
            if (y == 0) {
                throw new ArithmeticException("Division by 0 is not allowed");
            }
            return x / y;
        } catch (ArithmeticException e) {
//            System.out.println("Error: " + e.getMessage());
//            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
            return 0;
        }
    }

    public static int CheckFileExtension(String fileName) {
        try {
            if (fileName == null || fileName.isEmpty()) {
                throw new FileExtensionException("No submitted file or file name is empty.");
            } else if (fileName.endsWith(".java")) {
                return 1;
            } else {
                return 0;
            }
        } catch (FileExtensionException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
