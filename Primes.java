// CS 172
// Primes.java
// Lab: Section M02
// Written by: Jose Franco Baquera
// March 2, 2017
// Pupose of the program: The program will print all the prime numbers
// (starting with 2) that are less than 1000.  
// Input: There is no input from the user in this program. 
// Output: All prime numbers starting from 2 up to < 1000. The 
// program will output ten prime numbers per line. 

public class Primes {

   public static void main (String args []) {
   
      // Declare variables. Since we will start at 2, and 2 is a prime number,
      // we will assume that boolean is true.
   
      boolean isPrime = true; 
      int count = 0;
   
      // Print meaningful message to user.
   
      System.out.println( "These are all the prime numbers starting at 2 until < 1000." );  
   
      // Need nested for loops. Will check numbers 2 to < 1000. Since 2 is prime, 
      // assume boolean is true.Check up to square root of the number in question.  
   
      for ( int i = 2; i < 1000; i = i +1 ) {
      
         for ( double j = 2; j <= Math.sqrt(i); j = j + 1) {
         
            if ( i % j == 0 && isPrime == true )
            
               isPrime = false; 
         
         } // end inner for
               
         // If statement that will print the number i only if isPrime is true.
         // Nested if statment that will move to the next line for every ten numbers printed.
         
         if ( isPrime ) {
         
            System.out.print( i + " ");
            
            count = count + 1;
            
            if ( count % 10 == 0)
            
               System.out.println();
         
         }
         
         // Update isPrime and assume next number will be prime.
            
         isPrime = true;
     
      } // end outer for  
   
   } // end main
   
} // end class