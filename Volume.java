// ********************************************************
// Volume.java
// CS 172 - section M02
// Written by: Jose Franco Baquera
// Date Written: January 26, 2017
// 
// Prints the volume of a cylinder with a given height 
// and radius
// ********************************************************
public class Volume {
   public static void main (String[] args) {
   
      double height = 4.5, diameter = 5.0; // Assigns 4.5 to the variable height and 5.0 to the variable diameter
      double volume = Math.PI * height * (diameter/2) * (diameter/2); // Calculates the volume with the given values of height and diameter
      System.out.println( "The diameter is " + diameter +
         " and the height is " + height + "."); // Prints out the value of both the varible diameter and height
      System.out.println( "The volume is " + volume + "."); // Prints the value of the calculated volume
      
   } // end main
} // end class
