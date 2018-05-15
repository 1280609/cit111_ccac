/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogbreeds;

import java.util.Scanner;

/**
 *
 * @author Zach
 */
public class actualpooches {
    public static void main(String[] args) {
        //variables
        
        Scanner keyboardScanner = new Scanner(System.in);
        int userSelection;
        
        System.out.println("----------Choose a doggy ----------");
        System.out.println("1 -Small");
        System.out.println("2 -Medium");
        System.out.println("3 -Large");
        System.out.println("Enter a number and press enter");
        
        // read in an integer from the user through the keyboard
        userSelection = keyboardScanner.nextInt();             
        
        switch(userSelection){
            case 1:
                smalldog(); 
                break;
            case 2:
                mediumdog();
                break;
            case 3:
                largedog(); 
                break;
            default:
                System.out.println("Press 1, 2, or 3.");
        } // close switch
            
    } // close main
    
    public static void smalldog(){
        dogs pooch1;
        pooch1 = new dogs();
        pooch1.name ="Snowball";
        pooch1.breed = "papillon";
        pooch1.age = 3;
        pooch1.color = "white";
        
    System.out.println 
        ("Hi! my name is "+pooch1.name+" I'm a "+pooch1.age+" year old "+pooch1.breed);
        
                
    }

    public static void mediumdog(){
        dogs pooch2;
        pooch2 = new dogs();
        pooch2.name ="Noodle";
        pooch2.breed = "Jack Russell";
        pooch2.age = 2;
        pooch2.color = "white with brown spots";
       System.out.println  
        ("Hi! My name is "+pooch2.name+" I'm a "+pooch2.age+" year old "+pooch2.breed);
        
    }
        
    public static void largedog(){   
        dogs pooch3;
        pooch3 = new dogs();
        pooch3.name ="Taz";
        pooch3.breed = "German Shepherd";
        pooch3.age = 1;
        pooch3.color = "brown and black mix";
        System.out.println  
        ("Hi! My name is "+pooch3.name+" I'm a "+pooch3.age+" year old "+pooch3.breed);
        } // close if statement 
    }  
        
        
        
        
        
        
        
        
        
        
        
         
     }
        
    }
    
}
