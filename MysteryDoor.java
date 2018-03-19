/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Zach
 */
public class MysteryDoor {
  
    public static void main(String[] args) {
        // create a scanner object for the user 
        Scanner keyboardScanner = new Scanner(System.in);
        // selection and switch
        
        int userSelection;
        
        System.out.println("WELCOME TO MY CHAMBER OF SECRETS");
        System.out.println("| 1 |    | 2 |    | 3 |");
        System.out.println("CHOOSE A DOOR AND RECEIVE RICHES OR MISFORTUNE  (・｀ω´・)");
       
        userSelection = keyboardScanner.nextInt();
        //read as an number (1,2,or 3) for the user to use on the keyboard
        switch(userSelection){
            case 1:
                printStatement(); // goes to generate a statement
                break;
            case 2:
                generateLotto(); // goes to generate a number
                break;
            case 3:
                ifElse(); // goes to if / else
                break;
        } 
    } // close main and switch
   
//generates a statement
    public static void printStatement(){
        System.out.println("YEET! YOU WON A MANGO  ｡^‿^｡  ");
    } //closes printstatement
    
    
    // Generates a random number 
    public static void generateLotto(){
        System.out.println("You got");
        Random r = new Random();
        BigInteger bigInt = new BigInteger(30, r);
        // generates the number and shows text
        System.out.println(bigInt + " Cats ");
        System.out.println("Congrats you're a parent to many Cats (^･ｪ･^) ");
    } // close method regarding Lucky number
    
    
    public static void ifElse(){
        Scanner input = new Scanner(System.in);
         System.out.println("Do you like monkeys?? Yes or No???");
         String a = input.next();
        // if yes.
        if(a.equals("no")){
            System.out.println("Lets count");
            int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
    System.out.println("You got to watch me count to 10. You have been punished. Monkeys4life"); 
            
       // ifno
        } else {
            System.out.println("Do DA monkey dance! (ﾉ･ｪ･)ﾉ");
        }
        
        
    // counter to count to 10 ends
    }
}
