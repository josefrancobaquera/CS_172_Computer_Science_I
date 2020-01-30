// ComputingChange.java
// CS 172 - section M02
// written by Jose Franco Baquera
// date written February 2, 2017
// Purpose: This program calculates the number of bills needed to give change.
// Input: amount of change to give in dollars
// Output: number of bills (twenties, tens, fives, and ones)

import java.util.Scanner;            

public class ComputingChange {
   public static void main (String [] args) {
      
      // Declare the varibales for each amount of dollar bill as well
      // as a scanner and a varibale that will store the amount that
      // the user inputs.  
      
      Scanner scan = new Scanner(System.in);
       
      int amountToChange = 0;  
      int numFives = 0; 
      int numOnes = 0; 
      int numTwenties = 0; 
      int numTens = 0;  
      
      // Print a prompt to the user and assign the inputted number to 
      // the variable amountToChange
      
      System.out.println( "Enter the amount of dollars you want change for:"); 
      amountToChange = scan.nextInt();  
      
      // The number of each specific bill is calulated by deviding the inputted number by the 
      // desired bill amount, thus giving the number of bills for that particular amount.
      // We then update the amountToChange by taking the modulus of the amount before hand.
      // Repeat this process.
      
      numTwenties = amountToChange / 20;
      amountToChange = amountToChange % 20;
      numTens = amountToChange / 10;
      amountToChange = amountToChange % 10;
      numFives = amountToChange / 5;
      amountToChange = amountToChange % 5;
      numOnes = amountToChange % 5;
      
      // Print the number of each bill needed to the user
                  
      System.out.print( "numTwenties: ");
      System.out.println(numTwenties);
      System.out.print( "numTens: ");  
      System.out.println(numTens); 
      System.out.print( "numFives: "); 
      System.out.println(numFives); 
      System.out.print( "numOnes: "); 
      System.out.println(numOnes); 
      
      return;
      
   } // end main

} //end class