// ChangeWithCoins.java
// CS 172 - section M02
// written by Jose Franco Baquera
// date written February 2, 2017
// Purpose: This program calculates the number of bills and coins needed to give correct change.
// Input: amount of change to give in dollars and coins
// Output: number of bills (twenties, tens, fives, and ones)and number 
// of coins (quarters, dimes, nickels, and pennies)

import java.util.Scanner;            

public class ChangeWithCoins {
   public static void main (String [] args) {
      
      // Declare int varibales for the amount of dollar bills (1's, 5's, 10's, 20's)
      // and coins (quarters, dimes, nickels, and pennies. A scanner and a double variable 
      // that will store the amount the user inputs are also needed. An additional int 
      // varible is needed in order to calulcate the number of each coins needed.  
      
      Scanner scan = new Scanner(System.in);
      
      double amountToChange = 0; 
      int numFives = 0;  
      int numOnes = 0;  
      int numTwenties = 0; 
      int numTens = 0; 
      int numQuarters = 0;
      
      int numDimes = 0; 
      int numNickels = 0; 
      int numPennies = 0; 
      
      int coins = 0; 
      
      // Print a prompt to the user and assign the inputted number to 
      // the variable amountToChange.
      
      System.out.println( "Enter the amount of money you want change for:"); 
      amountToChange = scan.nextDouble(); 
     
      // Before the value of the variable amountToChange changes, we have to
      // multiple it by 100, use modulus 100 to it, and store the final number
      // to the variable coin trhough casting it with (int). (example: if the user inputs 
      // 12.50, then 50 will be stored in the varible coins.    
     
      coins = (int) ((amountToChange*100.0)%100.0); 
      
      // The number of each specific bill is calulated by dividing the inputted number by the 
      // desired bill amount, thus giving the number of bills for that particular amount.
      // We then update the amountToChange by taking the modulus of the amount of the specific 
      // dollar amount. Repeat this process. Then, the number of each specific coin is calulated by dividing 
      // the variable coins by the decrable coin value. Then update the calue of coin. Repeat.  

      
      numTwenties = (int) amountToChange / 20;  
      amountToChange = (int) amountToChange % 20; 
      numTens = (int) amountToChange / 10; 
      amountToChange = (int) amountToChange % 10; 
      numFives = (int) amountToChange / 5; 
      amountToChange = (int) amountToChange % 5;
      numOnes = (int)amountToChange % 5;
            
      numQuarters = coins / 25; 
      coins = coins % 25;
      numDimes = coins / 10;
      coins = coins % 10;
      numNickels = coins / 5;
      coins = coins % 5;
      numPennies = coins / 1; 
      
      // Print the number of each bill and each coin needed in order to give the correct
      // number of change to the user

      System.out.print( "numTwenties: ");
      System.out.println(numTwenties);
      System.out.print( "numTens: ");  
      System.out.println(numTens); 
      System.out.print( "numFives: "); 
      System.out.println(numFives); 
      System.out.print( "numOnes: "); 
      System.out.println(numOnes); 
      
      System.out.print( "numQuarters: ");
      System.out.println(numQuarters);
      System.out.print( "numDimes: ");  
      System.out.println(numDimes); 
      System.out.print( "numNickels: "); 
      System.out.println(numNickels); 
      System.out.print( "numPennies: "); 
      System.out.println(numPennies); 
      
      return;
      
   } // end main

} //end class