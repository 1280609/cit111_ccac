/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects1;


/**
 *
 * @author Zach
 */
public class FoodLand {
    public static void main(String[]args){
        final int firstBiteSize=30;
        
        //create handle variable for Donut objects
        Donut firstDonut;
        Noodles firstNoodles;
        Pizza   firstPizza;
        //create new instancces of these food items and putting them on
        //handles variables
        firstDonut= new Donut();
        firstNoodles=new Noodles();
        firstPizza= new Pizza();
        // access three variables name property, which is type String, and 
        // store three names in this particular Donut object's memory bin
        firstDonut.name = "Joey's donuts";
        firstNoodles.name= "Mario's noodles";
        firstPizza.name= "Pete's pizza";
        
       
        System.out.println("When first created, " + firstDonut.name + "'s\n" 
                + "percent remaining is " + firstDonut.getPercRemaining());
        
        printDivider();
        
        System.out.println("Calling simulateEating and passing in\n" +
                "a bite size of " + firstBiteSize);
        printDivider();
        
       
        firstDonut.simulateEating(firstBiteSize);
        
        System.out.println("After being eaten, " + firstDonut.name + "'s\n" 
                + "percent remaining is " + firstDonut.getPercRemaining());
        
        
        System.out.println("***********************************");
        
        //make the same thing for object "Noodles"
        System.out.println("When first created, " + firstNoodles.name + "'s\n" 
                + "percent remaining is " + firstNoodles.getPercRemaining());
        // convenience method for printing a row of dots to the screen
        printDivider();
        
        System.out.println("Calling simulateEating and passing in\n" +
                "a bite size of " + firstBiteSize);
        printDivider();
        
      
        firstNoodles.simulateEating(firstBiteSize);
        
        System.out.println("After being eaten, " + firstNoodles.name + "'s\n" 
                + "percent remaining is " + firstNoodles.getPercRemaining());
        //
         System.out.println("***********************************");
        
        //make the same thing for object "Pizza"
        System.out.println("When first created, " + firstPizza.name + "'s\n" 
                + "percent remaining is " + firstPizza.getPercRemaining());
        // convenience method for printing a row of dots to the screen
        printDivider();
        
        System.out.println("Calling simulateEating and passing in\n" +
                "a bite size of " + firstBiteSize);
        printDivider();
        
      
        firstPizza.simulateEating(firstBiteSize);
        
        System.out.println("After being eaten, " + firstPizza.name + "'s\n" 
                + "percent remaining is " + firstPizza.getPercRemaining());
    } // close main
    
    private static void printDivider(){
        System.out.println(".....................................");
        
    }

   
} // close Foodland

        

