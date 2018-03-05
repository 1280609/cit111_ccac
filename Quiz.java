/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;
import java.util.Random;


/**
 *Program tests user on math questions
 * @author Zach
 */
public class Quiz {
    
    private static final int HIGHEST_VALUE = 18;
    private static final int MAX_ATTEMPTS = 3;
    private static final int QUESTIONS = 3;
    private static final int HIGHSCORE = 3;

    private static int score = 0;

    private static int currentQuestion = 1;

    public static void main(String[] args) {
        System.out.println("Welcome to secret test of MATH! (´･ω･`) ");
        while (currentQuestion <= QUESTIONS) {
            askAQuestion(); //call method to ask a question
            currentQuestion++; //add the question
        }
        /*
        see if student answered correctly
         */
        if (score > (QUESTIONS * HIGHSCORE)) {
            System.out.println("NICE! You got: " + score + "out of " + (QUESTIONS * (HIGHSCORE + 1)) + "points! (≧ω≦)");
        } else {
            System.out.println("OOPS! Guess you'll have to hit the books! ☉_☉ ");
        }

    } //close method
/*
    
     */
    private static void askAQuestion() {
        Random aRand = new Random();
        Random bRand = new Random();

        int a = aRand.nextInt(HIGHEST_VALUE) + 1;
        int b = bRand.nextInt(HIGHEST_VALUE) + 1;

        int answerInput;
        int answerAttempts = 0;

        int questionScore = MAX_ATTEMPTS + 1;

        Scanner userInputScanner = new Scanner(System.in);

        while (answerAttempts < MAX_ATTEMPTS) {

            System.out.print(currentQuestion + ". What is " + a + " + " + b + "?");
            try {
                answerInput = userInputScanner.nextInt();
            } catch (Exception e) {
                answerInput = 0;
            }
            if ((a + b) == answerInput) {
                System.out.println("SWEET!! " + questionScore + " points! ｡^‿^｡ ");
                break;
            } else {
                System.out.println("WRONG. (/;◇;)/ ");
                questionScore--;
                answerAttempts++;
                System.out.println("Uh OH! You only have " + (MAX_ATTEMPTS - answerAttempts) + " more trys. (´・＿・`) ");
            } //close if else
            if (answerAttempts == MAX_ATTEMPTS) {
                System.out.println("DARN! You're out of tries! ┐(‘～`;)┌ ");
            }

        }//close for
        score = score + questionScore;
    } // close askQuestion method
} //close class

    