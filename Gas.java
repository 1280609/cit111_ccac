/*
*Program to figure out if user can arrive to service station
*with entered vaules by user based on miles remaining and gas 
* remaining
*/
package week4;

/**
 *
 * @author ZachMariskanish
 */
import java.util.Scanner;

public class Gas {
    public static void main(String[] args) {
        // declare double-type variables
        double gasRemaining;
        double milesRemaining;
        double milesperGallon=28.00;
        
        //Title
        System.out.println("***Will I make it??***");
        
         // create a Scanner
        Scanner userInputScanner = new Scanner(System.in);
        
        // prompt the user for gas left
        System.out.println("Enter the amount of gallons of gas remaining and press enter:");
        
        // use the Scanner object to read a double value from the console
        gasRemaining = userInputScanner.nextDouble();
        
        
        //prompt the user miles left
        System.out.println("Enter the miles remaining and press enter:");
        
        // use the Scanner object to read a double value from the console
        milesRemaining = userInputScanner.nextDouble();
        
        //prompt user for Miles per gallon
        System.out.println("Enter Miles per Gallon");
        
        milesperGallon = userInputScanner.nextDouble();
        
        //see whether user input is true or false
        if(milesRemaining>(gasRemaining*milesperGallon)){
            System.out.println("Uh Oh! You'll soon be marooned. You've been fooled!");
            System.out.println("You will be running on E"+(milesRemaining-(gasRemaining*milesperGallon))+" miles from the next service station.");
            System.out.println("In order to reach the next service staion you would need to get "+(milesRemaining/gasRemaining)+" miles per gallon.");
        }
        else{
            //if it is false
            System.out.println("You'll make it to the next station, Nice!");
            System.out.println("You will have "+((gasRemaining*milesperGallon)-milesRemaining)+" miles of gas when you reach the service station.");
        
        
        
    } 
} 
        
    }
    
    
    

