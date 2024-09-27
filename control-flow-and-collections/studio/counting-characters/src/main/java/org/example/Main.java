package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = myString.toCharArray();
//        System.out.println(Arrays.toString(charactersInString));

        HashMap<Character, Integer> characterCount = new HashMap<>();

        for(char character: charactersInString){
            if(!characterCount.containsKey(character)) {
                characterCount.put(character, 1);
            }
            else {
                characterCount.put(character, characterCount.get(character) + 1);
            }

        }
        System.out.println(characterCount);
    }
}

