// CS 172
// Averages.java
// Lab: Section M02
// Written by: Jose Franco Baquera
// March 2, 2017
// Pupose of the program: The program allows the user to input a name of 
// a student and calulates the student's average grade for a specified number 
// of exams. If the user inputs "quit", the program will quit.  
// Input: The student's name, the desired number of exams, and all of
// their exam scores.
// Output: The student's name and his or her average score. 

import java.util.Scanner;

public class Averages {

   public static void main (String args []) {
   
      // Declare varibles, including a sentinel for quit. Average must be a float
      // while the inputted numbers must be an integer
   
      final String SENTINEL = "quit";
      int score, n; 
      int sum = 0;
      float average;
      String sentence1;
      Scanner scnr = new Scanner (System.in);
   
      // Write a while sentinel loop in the format provided to us in class. 
      // First ask the number of exams and the name of the student from the 
      // user.
   
      System.out.println( "Enter the total number of exams." );
   
      n = scnr.nextInt();
      
      scnr.nextLine();
      
      System.out.println( "Enter student's name. Enter quit to stop." ); 
   
      sentence1 = scnr.nextLine();
   
      // While loop that will execute only if the user does not input the word quit. Loop will add all the 
      // exam scores inputed by the user, then find their average, and print it along with the student's name.
      // Make sure to update sum to zero after printing this information since the sum will be different for 
      // other students. 
      
      while ( ! sentence1.equals( SENTINEL) ) {
   
         System.out.println( "Enter exam scores in the form of ## ## ## ... etc." );
  
         for ( int i = 0; i < n; i = i +1) {
      
            score = scnr.nextInt( );
         
            sum = sum + score; 
      
         } // end for
         
         // Concatinate since average is a float, not an int. 
      
         average = (float) sum / n;
         
         System.out.println( sentence1 + " " + average );
           
         scnr.nextLine();
      
         System.out.println( "Enter another student's name. Enter quit to stop" );
      
         sum = 0; 
      
         sentence1 = scnr.nextLine();      
  
      } // end while
   
   } // end main
   
} // end class