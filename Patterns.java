// CS 172
// Patterns.java
// Lab: Section M02
// Written by: Jose Franco Baquera
// March 5, 2017
// Pupose of the program: The program will generate four 
// seperate patterns.   
// Input: The user will enter the number of lines for 
// each pattern (i.e. four times).
// Output: Four seperate patterns that are directly related
// to the input.

import java.util.Scanner;

public class Patterns {

   public static void main (String args []) {
   
      // Declare variables
   
      int numLines;
      Scanner scan = new Scanner (System.in);
   
      // This is Pattern A)
      
      // First, get input from user. 
   
      System.out.println( "Enter the number of lines for pattern A)." );
      numLines = scan.nextInt( );
     
      // Nested for loops that will output the first pattern. Outer loop will keep track the
      // number of lines needed to print while the inner loop will print the stars. Before 
      // while loop ends, make sure to print a next line statement. 
      
      System.out.println( "Pattern A:" );
   
      for ( int i = 1; i <= numLines; i = i + 1) {
   
         for ( int k = 1; k <= i; k = k + 1) {
      
            System.out.print("*"); 
        
         } // end inner for
      
         System.out.println( "" );
                 
      } // end outer for
   
      // This is Pattern B)
      
      // First, get input from user.
      
      System.out.println( "Enter the number of lines for pattern B)." );
      numLines = scan.nextInt( );
    
      // Nested for loops that will output the second pattern. Outer loop will keep track of the
      // number of lines needed to print while the inner loop will print the stars. Before 
      // while loop ends, make sure to print a next line statement.
      
      System.out.println( "Pattern B:" );
      
      for ( int i = numLines; i >= 1; i = i - 1) {
   
         for ( int k = 1; k <= i; k = k + 1) {
      
            System.out.print("*"); 
         
         } // end inner for
      
         System.out.println( "" );
            
      } // end outer for
      
      // This is Pattern C)
   
      // First, get input from user. 
   
      System.out.println( "Enter the number of lines for pattern C)." );
      numLines = scan.nextInt();
      
      // Nested for loops that will output the third pattern. Outer loop will keep track of the
      // number of lines needed to print. The first inner loop will print the number of spaces while 
      // the second inner loop will print the stars. The first line will have no spaces. Before 
      // while loop ends, make sure to print a next line statement.
      
      System.out.println( "Pattern C:" );
      
      for ( int i = numLines; i >= 1; i = i - 1) {
   
         for ( int k = numLines; k > i; k = k - 1) {
      
            System.out.print( " " );
         
         } // end inner for 1      
      
         for ( int a = 1; a <= i; a = a + 1) {
      
            System.out.print("*"); 
         
         } // end inner for 2
      
         System.out.println( "" );
   
      } // end outer for
      
      // This is Pattern D)
      
      //First, get input from user.
   
      System.out.println( "Enter the number of lines for pattern D)." );
      numLines = scan.nextInt();
   
      // Nested for loops that will output the fourth pattern. Outer loop will keep track of the
      // number of lines needed to print. The first inner loop will print the number of spaces while 
      // the second inner loop will print the stars. The first line will have numLines - 1 spaces. 
      // Before while loop ends, make sure to print a next line statement.
      
      System.out.println( "Pattern D:" );
      
      for ( int i = 1; i <= numLines; i = i + 1) {
   
         for ( int k = numLines; k > i; k = k - 1) {
      
            System.out.print( " " );
         
         } // end inner for 1      
      
         for ( int a = 1; a <= i; a = a + 1) {
      
            System.out.print("*"); 
        
         } // end inner for 2
      
         System.out.println( "" );
                 
      } // end outer for
      
   } // end main
   
} // end class 