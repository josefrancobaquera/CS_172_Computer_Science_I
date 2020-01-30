// CS 172
// Lab4.java
// Lab: Section M02
// Written by: Jose Franco Baquera
// February 23, 2017
// Pupose of the program: The program is designed to print (using 
// both a while and for loop)all the odd numbers between 1-99, the 
// lowest integer of the ten inputed by the user, and the number 
// of vowels in the String of words inputed by the user  
// Input: User is allowed to input a a total number of ten integers
// and a String of words with or without spaces
// Output: The program will output all the odd numbers between
// 1-99, the lowest intger, and the amount of each vowel in the String 
// of words   

import java.util.Scanner;

public class Lab4 {

   public static void main (String args []) {
   
      //
      // Problem 1 - a for loop that will print the odd numbers from 1 to 99
      // 
      
      System.out.println( "\nThis is the output from problem 1 - for loop - odd numbers between 1 and 99\n" );
      
      for ( int a = 1; a < 100; a = a + 2 ) {
      
         System.out.println(a);
      
      } // end for loop  
         
      System.out.println(""); // Prints a blank line for readiablity
      
      //
      // Problem 1 - a while loop that will print the odd numbers from 1 to 99
      //
      
      System.out.println( "\nThis is the output from problem 1 - while loop - odd numbers between 1 and 99\n");
      
      int b = 1;
      
      while ( b < 100) {
      
         System.out.println(b);
         
         b = b + 2;
         
      } // end while loop
      
      System.out.println(""); // Prints a blank line for readiablity
      
      //
      // Problem 2 - a for loop that will input 10 integer values from the user and
      // keep track of the smallest number. After the for loop ends, this number will
      // be printed
      //
      
      System.out.println( "\nThis is the output from problem 2 - for loop - smallest integer entered\n" );
      
      Scanner scnr = new Scanner(System.in);
      int num1, lowestNum;
      
      System.out.println("Enter ten integer values.");
      
      lowestNum = scnr.nextInt();
   
      for ( int i = 2; i <= 10; i = i + 1 ) {
      
         num1 = scnr.nextInt();
         
         if ( lowestNum > num1 ) {
         
            lowestNum = num1;
         
         } // end if
         
      } // end for loop
      
      System.out.println( "The lowest value is " + lowestNum + ".");
      
      System.out.println(""); // Prints a blank line for readiablity
          
      //
      // Problem 2 - a while loop will input 10 integer values from the user and
      // keep track of the smallest number. After the for loop ends, this number will
      // be printed
      //
   
      System.out.println( "\nThis is the output from problem 2 - while loop - smallest integered entered\n" );
      
      int num2, lowestNum1;
      int x = 2;
      
      System.out.println("Enter ten integer values.");
      
      lowestNum1 = scnr.nextInt();
      
      while ( x <= 10 ){
      
         num2 = scnr.nextInt();
      
         if ( lowestNum1 > num2 ){
         
         lowestNum1 = num2;
         
         } // end if
         
         x = x + 1;
         
      } // end while loop 
      
      System.out.println( "The lowest value is " + lowestNum1 + ".");
      
      System.out.println(""); // Prints a blank line for readiablity
      
      scnr.nextLine();
      
      //
      // Problem 3 - a for loop that will input a String from the user and will
      // count how many vowels are found in the String and display the number of times
      // each vowel is found. In this case, case does not matter.
      //
      
      System.out.println( "\nThis is the output from problem 3 - for loop - number of vowels in Sring\n" );
      
      String sentence1;
      int v1 = 0;
      int v2 = 0;
      int v3 = 0;
      int v4 = 0;
      int v5 = 0;
      
      System.out.println("Enter a String of words");
      
      sentence1 = scnr.nextLine();
            
      for (int i = 0; i <= ( sentence1.length() - 1); i = i + 1){
      
         if (sentence1.charAt(i) == 'a' || sentence1.charAt(i) == 'A' )
            
            v1 = v1 + 1;
            
         else if (sentence1.charAt(i) == 'e' || sentence1.charAt(i) == 'E')
         
            v2 = v2 + 1;
            
         else if (sentence1.charAt(i) == 'i' || sentence1.charAt(i) == 'I')
            
            v3 = v3 + 1;
         
         else if (sentence1.charAt(i) == 'o' || sentence1.charAt(i) == 'O')
         
            v4 = v4 + 1;
            
         else if (sentence1.charAt(i) == 'u' || sentence1.charAt(i) == 'U')
         
            v5 = v5 + 1;
            
      } // end for
      
      System.out.println("The number of vowels of each one is:");
      System.out.println("a's " + v1);
      System.out.println("e's " + v2);
      System.out.println("i's " + v3);
      System.out.println("o's " + v4);
      System.out.println("u's " + v5);
      
      System.out.println(""); // Prints a blank line for readiablity
      
      //
      // Problem 3 - a while loop that will input a String from the user and will
      // count how many vowels are found in the String and display the number of times
      // each vowel is found. In this case, case does not matter.
      //
      
      System.out.println( "\nThis is the output from problem 3 - while loop - number of vowels in String\n" );
      
      int y = 0;
      sentence1 = "";
      v1 = 0;
      v2 = 0;
      v3 = 0;
      v4 = 0;
      v5 = 0;
      
      System.out.println("Enter a String of words");
      sentence1 = scnr.nextLine();
      
      while ( y <= (sentence1.length() - 1)) {
      
         if (sentence1.charAt(y) == 'a' || sentence1.charAt(y) == 'A' )
            
            v1 = v1 + 1;
            
         else if (sentence1.charAt(y) == 'e' || sentence1.charAt(y) == 'E')
         
            v2 = v2 + 1;
            
         else if (sentence1.charAt(y) == 'i' || sentence1.charAt(y) == 'I')
            
            v3 = v3 + 1;
         
         else if (sentence1.charAt(y) == 'o' || sentence1.charAt(y) == 'O')
         
            v4 = v4 + 1;
            
         else if (sentence1.charAt(y) == 'u' || sentence1.charAt(y) == 'U')
         
            v5 = v5 + 1;
            
         y = y + 1;
      
      } // end while 
      
      System.out.println("The number of vowels of each one is:");
      System.out.println("a's " + v1);
      System.out.println("e's " + v2);
      System.out.println("i's " + v3);
      System.out.println("o's " + v4);
      System.out.println("u's " + v5);

   } // end main
   
} // end class