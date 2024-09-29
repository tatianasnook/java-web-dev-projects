package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String myString = "If the product of two terms is zero then common sense says at least one of the two terms" +
//                "has to be zero to start with. So if you move all the terms over to one side, you can put the" +
//                "quadratics into a form that can be factored allowing that side of the equation to equal zero." +
//                "Once you’ve done that, it’s pretty straightforward from there.";
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a sting to count: ");
        String myString = input.nextLine().toLowerCase();

        char[] charactersInString = myString.toCharArray();

        HashMap<Character, Integer> characterCount = new HashMap<>();

        for(char letter: charactersInString){
            if(Character.isLetter(letter)){
                if(characterCount.containsKey(letter)) {
                    characterCount.put(letter, characterCount.get(letter) + 1);
                } else {
                    characterCount.put(letter, 1);
                }
            }
        }

        for(Map.Entry<Character, Integer> charCount : characterCount.entrySet()) {
            System.out.println(charCount.getKey() + ": " + charCount.getValue());
        }
    }
}

