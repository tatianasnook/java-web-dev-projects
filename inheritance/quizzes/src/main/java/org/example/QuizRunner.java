package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class QuizRunner {
    public static void main(String[] args) {
        MultipleChoice firstQuestion = new MultipleChoice("Question 1 What is grass color?",
                "", 5, "green",
                "a. red, b. blue, c. green, d. orange");

        firstQuestion.displayQuestion();
        firstQuestion.getUserAnswer();
        firstQuestion.checkAnswer();

    }
}