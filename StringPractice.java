// CS 172
// StringPractice.java
// Lab: Section M02
// Written by: Jose Franco Baquera
// February 9, 2017
// Pupose of the program: The program is designed to 
// allow users to input a String of words (with or without spaces)
// and print out a series of meaningful messages. 
// Input: User is allowed to input a String with or without spaces
// Output: The program will output the String's length,
// first word, uppercase, lowercase, n's changed to m's,
// location of the first 'a', last character, and first 8 
// characters if it is longer than 8 characters  

import java.util.Scanner;

public class StringPractice {
   public static void main (String args []){
   
   // Declare the Scanner and a String varible    
   
   Scanner scnr = new Scanner (System.in);
   String string1;
   
   // Print a prompt to the user and assign the String 
   // inputted to the varible string1
   
   System.out.println( "Enter a String of words."); 
   string1 = scnr.nextLine();
    
   // Prints the length of the string
   
   System.out.println( "The length of the String is " + string1.length() + ".");
   
   // If string doesn't have spaces, print all the string. If
   // the string has one or more spaces, only print up to the 
   // character before the space.
   
   if ( string1.indexOf(" ") == -1){  
      System.out.println( "The first word of the String is \"" + string1 + "\"." );
   }  
   else {
      System.out.println( "The first word of the String is \"" + string1.substring(0, string1.indexOf(" ")) + "\".");
   }
   
   // Prints the entire String in both uppercase and lowercase
   
   System.out.println( "The entire String in all uppercase is \"" + string1.toUpperCase() + "\"." ); 
   System.out.println( "The entire String in all lowercase is \"" + string1.toLowerCase() + "\"." );
    
   // If the String doesn't have n's, print a warning. If String
   // has n's, change all of them to m's and print the entire String
   
   if ( string1.indexOf("n") == -1){
      System.out.println( "There are no 'n' characters to swtich to 'm', so String remains \"" + string1 + "\"."); 
   }   
   else {
      System.out.println ( "All the 'n' characters changed to 'm' is: \"" + string1.replace( "n", "m") + "\".");
   }
   
   // If the String has no 'a' characters, print a warning message. If it does, print
   // the first location.
   
   if ( string1.indexOf("a") == -1){
      System.out.println( "There are no 'a' characters in the String." );
   }
   else {
      System.out.println ( "The location of the first 'a' in the String is " + string1.indexOf('a') + ".");
   }
   
   // Prints the last character of the String.
   
   System.out.println ( "The last character of the Sring is " + string1.charAt(( string1.length() - 1 )) + ".");
   
   // If the String is longer than 8, print only the first 8 characters. If not,
   // print the entire original String. 
   
   if ( string1.length() > 8){
      System.out.println( "The first 8 characters of the String are: \"" + string1.substring(0,8) + "\".");
   }
   else {
      System.out.println( "String is 8 or less characters long. The string remains unchanged: \"" + string1 + "\".");
   }
   
   } // end main
   
} // end class

