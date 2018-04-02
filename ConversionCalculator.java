/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import java.util.Scanner;

/**
 *
 * @author Zach
 */
public class ConversionCalculator{
    
    
   
    public static void main(String[] args) {
        
        System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *   ");
        System.out.println(" * * * * * * *(☞◑ω◑)☞ MAGICAL CONVERTER 3000 (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ ");
        System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *   ");
        
        // create a scanner object to gather user input
        Scanner scan = new Scanner(System.in);
        
        // input the number of ounces you would like to convert
        System.out.println("Enter the number of Fluid ounces you would like to convert into Liters:");
        double userFluidounces = scan.nextDouble();
        
        // call alcFluidOuncestoLiters() with the input of Floz
        double returnedLiters = calcFluidOuncestoLiters (userFluidounces);
        
        // print the inputs and the outputs
        System.out.println("There are " + returnedLiters + " Liters in " + userFluidounces + " ounces.");
        System.out.println("*************************************");
        
        
        
        // input the number you want to convert into gallons
        System.out.println("Enter the number of liters you would like to convert into gallons:");
        double userLiters = scan.nextDouble();
        
        // call calcLiterstogallons() with the input of Liters
        double returnedGallons = calcLiterstogallons(userLiters);
        
        // print the inputs and the outputs
        System.out.println("There are " + returnedGallons + " gallons in " + userLiters + " Liters.");
        System.out.println("*************************************");
        
        
        
        // input the number you want to convert into pints
        System.out.println("Enter the number of gallons you would like to convert into pints:");
        double userGallons = scan.nextDouble();
        
        // call calcGallonstoPints for the input of gallons
        double returnedPints = calcGallonstoPints(userGallons);
        
        // print the inputs and the outputs
        System.out.println("There are " + returnedPints + " pints in " + userGallons + " gallons.");
        
    } // close main method
    

    
    public static double calcFluidOuncestoLiters(double floz){
        // calculates floz to L
        double liters = (floz* 0.0295735);
        return liters;
    } // close method
    

    public static double calcLiterstogallons(double L){
        // calculates L to gallons
        double gallons = (L * 0.264172);
        return gallons;
    } // close method
    

    public static double calcGallonstoPints(double gallons){
        // calculates gallons to pints
        double pints = ( gallons * 8);
        return pints;
    } // close method
} // close class
    

