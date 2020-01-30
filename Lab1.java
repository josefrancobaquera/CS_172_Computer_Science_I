// ********************************************************
// Lab1.java
// CS 172 - section M02
// Written by: Jose Franco Baquera
// Date Written: January 26, 2017
// This program calculates the volume of a cylinder.
// Input: height and diameter
// Output: volume
// ********************************************************
import java.util.Scanner; // Imports Scanner
public class Lab1 {
   public static void main (String[] args) {
         
      Scanner scan = new Scanner(System.in); // Inizializes Scanner
      
      double height, diameter, volume; // Declares the varibles height, diameter, and volume
     
      System.out.println( "Type in height." ); // Prints a prompt to the user
      height = scan.nextDouble(); // Assigns the inputted number to the variable height
      
      System.out.println( "Type in diameter." ); // Prints a prompt to the user
      diameter = scan.nextDouble(); // Assigns the inputted number to the variable diameter
      
      volume = Math.PI * height * (diameter/2) * (diameter/2); // Calculates the volume of the cylinder
      
      System.out.println( "The diameter is " + diameter +
         " and the height is " + height + "."); // Prints the inputted diameter and height
      System.out.println( "The volume of the cylinder is " + volume + "."); // Prints the calulated volume of the cylinder
      
   } // end main
} // end class
