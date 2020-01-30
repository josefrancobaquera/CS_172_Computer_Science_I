// Written by Jose Franco Baquera
// CS 172 
// April 6, 2017
// Lab Assignment #7
// Lab7Methods.java
// Section M02
// Pupose of the program: The following program is a list of methods without a main method
// to call them. The printOddNumbers method will print all the odd numbers between 
// 1 and the parameter integer. The countNumbers method will count the number of times a parameter integer 
// shows up in the parameter array list. The formatName method will rearrenge the "first last" from the 
// parameter String into "last, first". The hasLower method will determine wether or not a parameter String has 
// a lowercase letter. The gradeTable method will count the number of A's, B's, C's, D's, and F's in an parameter 
// array.
// Input: No input from the user
// Output: The printOddNumbers will print the odd numbers, but has a void return. The 
// countNumbers method will return a int. The formatName method will return a String. The hasLower will 
// return a boolean. The gradeTable method will return an array.

public class Lab7Methods {

   public static void printOddNumbers ( int max ) {
   
      // prints the odd numbers less than or equal to max
      
      int n = 1, count = 0;
      
      while ( n <= max ) {
      
         System.out.printf( "%5d", n ); // prints the number in field of 5
         
         // 1 is the first odd number. Keep increminting by 2 to get next odd numbers.
         
         n = n + 2;
         count++;
         
         // For every ten numbers printed, move to next line         
         
         System.out.print( ( count % 10 == 0 ) ? "\n" : "" );     
      
      } // end while
   
   } // end method printOddNumbers
   
   public static int countNumbers ( int data [], int num ) {
   
      // Initialize count to zero.
      
      int count = 0;
      
      // Use for loop that will check every element of the array. If the
      // number in that specific index is equal to parameter integer, increase
      // count variable
      
      for ( int i = 0; i < data.length; i = i + 1 ) {
      
         if ( data[ i ] == num )
            
            count = count + 1;
      
      } // end for loop
   
      // return count variable
      
      return count;
   
   } // end method countNumbers
   
   public static String formatName ( String name ) {
   
      // Initialize a space location and several other Strings that will allow
      // us to concatinate.
      
      int spaceLocation = 0;
      String lastName = "";
      String firstName = "";
      String lastFirstName = "";
      
      // Use a for loop that will find the location of the space in the String name.
      
      for ( int i = 0; i < name.length( ); i = i + 1 ) {
      
         if ( name.charAt( i ) == ' ' )
         
            spaceLocation = i;
            
      } // end for
      
      // Use a substring that will assign all the characters from 0 up to (not including)
      // the space character into firstName. This is the first name. 
      
      firstName = name.substring( 0, spaceLocation );
      
      // Use a substring that will assign all the characters from AFTER the space char 
      // until the end of the String into lastName. This is the last name.
      
      lastName = name.substring( spaceLocation + 1, name.length( ) );
      
      // Use concatination to rearrenge the first and last names, as well as to add a comma
      // and a space.       
      
      lastFirstName = lastName + ", " + firstName;
   
      // Return the rearrenged String.
      
      return lastFirstName ;       
      
   } // end method formatName  
   
   public static boolean hasLower (String text ) {
   
      // Use a for loop that will look at every individual element and see wether or not its a 
      // lower-case letter. If it is, return true and the method ends. If not, move to next element
      // and check. 
      
      for ( int i = 0; i < text.length( ); i = i + 1 ) {
      
         if ( text.charAt(i) <= 'z' && text.charAt(i) >= 'a' )
         
            return true; 
      
      } // end for  
      
      // Return false if the for loop did not find any lower-case characters
      
      return false; 
   
   } // end method hasLower
   
   public static int [] gradeTable ( float scores [] ) {
   
      // Assume there are zero of each grade until seen otherwise
      
      int array [] = {0, 0, 0, 0, 0};
      
      // Use a for loop that will check each indivdual element in the scores array list
      
      for ( int m = 0; m < scores.length; m = m + 1) {
      
         // If the element is between 90 and 100, add one to the 0 element
         
         if ( scores[m] <= 100 && scores[m] >= 90 )
            
            array[0] = array[0] + 1;
            
         // If the element is between 80 and 89, add one to the 1st element
                     
         else if ( scores[m] < 90 && scores[m] >= 80 )
         
            array[1] = array[1] + 1;
            
         // If the element is between 70 and 79, add one to the 2nd element
         
         else if ( scores[m] < 80 && scores[m] >= 70 )
         
            array[2] = array[2] + 1;
            
         // If the element is between 69 and 60, add one to the 3rd element
         
         else if ( scores[m] < 70 && scores[m] >= 60 )
         
            array[3] = array[3] + 1;
            
         // Anything else add one to the 4th element
         
         else 
            
            array[4] = array[4] + 1;
            
      } // end for
      
      // Return an array
      
      return array;      
   
   } // end method gradeTable
   
} // end class