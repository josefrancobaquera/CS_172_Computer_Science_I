// ********************************************************
// Perimter.java
// CS 172 - section M02
// Written by: Jose Franco Baquera
// Date Written: January 26, 2017
// 
// Prints the perimeter of a rectangle with a given length
// and width
// ********************************************************

public class Perimeter {
   public static void main (String[] args) {
   
      double length = 4.5, width = 5.0; // Assigns 4.5 to the variable length and 5.0 to the variable width
      double perimeter = 2 * length + 2 * width; // Calculates the perimeter with the given values of length and width
      System.out.println( "The length is " + length +
         " and the width is " + width + "."); // Prints out the value of both the varible length and width
      System.out.println( "The perimeter is " + perimeter + "."); // Prints out the value of the perimeter
      
   } // end main
} // end class
