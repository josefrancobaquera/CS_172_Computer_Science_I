// Written by Jose Franco Baquera
// CS 172 
// March 9, 2017
// Lab Assignment #6 
// Lab6.java
// Section M02
// Pupose of the program: Problem 1 of the program allows the user to input one letter of the 
// alphabet (lowercase or uppercase). Then, the prgram will find all of the array locations
// that contain that letter and print them out. Problem 2 of the program will create 100
// integers in an array with random numbers between 1 to 1000. Then, the average, max, and min 
// will be found.   
// Input: One letter from the user.
// Output: The array elements that contain that letter, the 100 random numbers and their
// corresponding average, min, and max values. 

import java.util.Scanner;

public class Lab6 {
   
   public static void main (String args []) {
   
      //
      // Problem #1
      //
   
      System.out.println( "Problem 1" );
      
      // Declare char varibles for Problem #1. Since there are no char methods, use strings and charAt. Also use boolean repeat 
      // and initilize it to false in order to only print the number ONCE if the letter was found. We also need another boolean
      // that will allow the program to print "No elemts contain that letter." Assume false to make the programming easier.  
      
      String input;
      char letter;
      boolean repeat = true;
      boolean letterFound = false;
      Scanner scan = new Scanner (System.in);
      
      // The following boolean is unnessary for the prgram to work, but allows us to print a meaningful message
      // to the user.  
      
      boolean prompt = false; 
      
      // Initialize 20 String references with the numbers 1 - 20, all lowercase.
      
      String lowerNum[] = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", 
      "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty" };
      
      // Get input from user. Make sure that the input is lowercase by using toLowerCase on the whole
      // String. Since there are no scan methods for char characters, we use a String method 
      // and get the first char of it.
      
      System.out.println( "Enter ONE letter." );
      
      input = scan.next();
      
      letter = input.toLowerCase().charAt(0);      
      
      // Print error message if the user inputed a character that is not a letter. Use while loop that will 
      // keep the user from entering a non-letter  
      
      while ( !(letter >= 'a' && letter <= 'z') ) {
         
         System.out.println( "ERROR: Inputed character is not a letter. Please try again" );
         input = scan.next().toLowerCase();
         letter = input.charAt(0);  
                
      } //  end while
         
      // If the input was a letter, use nested loops that will search for the letter in each of the 
      // elements. Make sure to update the boolean repeat so the element is only printed ONCE. If this
      // loops executes, then at least one element contained the inputted letter. Update boolean letterFound.
         
         for ( int i = 0; i < lowerNum.length; i = i + 1) {
      
            for ( int j = 0; j < lowerNum[i].length(); j = j + 1) {
         
               if ( (lowerNum[i].charAt(j) == letter) && repeat ) {
            
                  if ( ! prompt ) {               
                  
                     System.out.println( "The following elements contain the letter " + letter + ".");
                     prompt = true;
                  
                  }
               
                  // Compare each index of the element to the letter. If found, print the element and update 
                  // boolean repeat in order to print the element ONCE. 
                  
                  System.out.println( lowerNum[i]);
                  letterFound = true;
                  repeat = false;
               
               } // end if
           
            } //  end inner for
         
            repeat = true;     
      
         } // end outer for
      
      // Write if statement that will print that no elements were found if
      // letterFound never became true. 
      
      if ( !letterFound )
            
         System.out.println( "No elements contain the letter " + letter + "." );
         
      //
      // Problem #2
      //
            
      System.out.println( "Problem 2" );
      
      // Create an array of 100 integer values.
      
      int ranNum [] = new int [100];
      
      // Declare a counting variable that will allow to print 10 numbers per line
    
      int count = 0;
      
      // Use for loop that will allow the program to print all the elements in the array,
      // starting with 0 and ending in 99.
      
      for ( int i = 0; i < ranNum.length; i = i + 1) {
      
         ranNum[i] = (int) ( Math.random() * (1000) + 1);
         
         System.out.printf( "%4d", ranNum[i] );
         
         count = count + 1;
         
         // If count modulus 10 equals zero, then move on to next line
         
         if ( count % 10 == 0)
            
            System.out.println();
            
      } // end for 
      
      // Declare the sum and average variable, but sum must be int while average a float
      
      int sum = 0;
      float average;
      
      for ( int i = 0; i < ranNum.length; i = i + 1) {
      
         sum = sum + ranNum[i];     
      
      } // end for
      
      // Remeber to cast average since sum and ranNum.length are borth integers.      
     
      average = (float) sum / ranNum.length;
      
      System.out.println( "The average of the random numbers is: " + average);
      
      int minVal, maxVal; 
      
      // Assume first number is the minimum value in array. Compare to 
      // next value and update minVal if applicable. Repeat.     
      
      minVal = ranNum[0];
      
      for ( int i = 1; i < ranNum.length; i = i + 1) {
      
         if ( ranNum[i] < minVal ) 
            
            minVal = ranNum[i];     
      
      } // end for
      
      System.out.println( "The mininum value in the array is: " + minVal);
      
      // Assume first number is the maximum value in the array. Compare to 
      // next value and update maxVal if applicable. Repeat.
      
      maxVal = ranNum[0];
      
      for ( int i = 1; i < ranNum.length; i = i + 1 ) {
         
         if ( ranNum[i] > maxVal ) 
         
            maxVal = ranNum[i];  
      
      } // end for
      
      System.out.println( "The maximum value in the array is: " + maxVal );
      
   } // end main
   
} // end class