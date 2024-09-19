package org.launchcode;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book " +
                "her sister was reading, but it had no pictures or conversations in it," +
                "‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter any search term for first sentence of Alice’s Adventures in Wonderland?");
        String searchTerm = input.nextLine();


        if (firstSentence.toLowerCase().contains(searchTerm.toLowerCase())) {
            System.out.println("Your search term was found: True");

            Integer index = firstSentence.indexOf(searchTerm);
            Integer length = searchTerm.length();
            System.out.println("Index of your search term is " + index);
            System.out.println("And the length of your search term is " + length + "characters long.");

            String modifiedSentence = firstSentence.replace(searchTerm, "");
            System.out.println(modifiedSentence);
        } else {
            System.out.println("Your search term was not found: False");
        }
    }
}
