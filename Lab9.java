// Written by: Jose Franco Baquera
// CS 172 
// April 27, 2017
// Lab Assignment #9 
// Lab9.java
// Section M02
// Purpose of the program: The following program will have four recursive methods and a main method that will test
// each one of them. The purpose of the program is to print letters foward, letters backwards, a triangle made out of 
// asterisks, and powers of ten, all using recursive methods and method calls form the main method.  
// Input: No input from the user is needed.
// Output: All the letters of the alphabet up to the paramter value, all the letters of the alphabet up the parameter value 
// backwards, a triangle made out of asterisks, and the value of powers of tens given a parameter.  

public class Lab9 {

   public static void printLettersForward ( char c ) {
         
      // Error Case:
      // The error case here is to check if the parameter is a letter of the alphabet or not. If its not a letter,
      // do not print anything. Must check for BOTH uppercase or lowercase.
            
      if ( !( c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' ) )
      
         return;
         
      // Base case:
      // A base case is not needed in this method because the error case will catch c when it is no longer a character,
      // thus stopping the recursive method.
      
      // Recursive Step:
      // If char c is not equal to 'A' or 'a', call printLettersFoward again by sending it one letter lower than c. 
      // Since the parameter must be a char, we need a cast. We note that once char c is no longer a letter, the error
      // case will serve as a base case and stop the recursive step. 
               
      if ( c != 'A' || c != 'a' ) {
      
         printLettersForward( (char) (c - 1 ) );
         
         System.out.print(c);
      
      } // end if 
   
   } // end printLettersForward method 
   
   public static void printLettersBackwards ( char c ) {
   
      // Error Case:
      // The error case here is to check if the parameter is a letter of the alphabet or not. If its not a letter,
      // do not print anything. Must check for BOTH uppercase or lowercase.
      
      if ( !( c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' ) ) 
      
         return;
         
      // Base case:
      // A base case is not needed in this method because the error case will catch c when it is no londer a character,
      // thus stopping the recursive method.
      
      // Recursive Step:
      // Since char c is a letter because the error case did not execute, print it out, then call the method again
      // by sending it one letter lower than c. Since the parameter must be a char, we need a cast. We note that once 
      // char c is no longer a letter, the error case will serve as a base case and stop the recursive step.
      
      System.out.print(c);
            
      if ( c != 'A' || c != 'a' ) {
      
         printLettersBackwards( (char) (c - 1 ) );
      
      } // end if   
   
   } // end printLettersBackwards method
   
   public static void triangle ( int n ) {
   
      // Error Case:
      // The error case here is to check if the parameter is grater than zero. If the parameter is zero, the method ends and does not
      // print anything. Negative numbers don't make sense here, so if the parameter is a negative integer, the 
      // method will end and will not print anything. 
            
      if ( n <= 0 ) {
      
         return;
         
      } // end if
      
      // Base case:
      // A base case is not needed in this method because the error case will catch when n is zero, thus stopping the recursive method.
      
      // Recursive Step:
      // First call the triangle method with n - 1 paramter again since the triangle goes in acending order, not decending. Use a for 
      // loop that will print all the asterisks needed up to n. End with a print statement so that each line of asterisks is printed 
      // in different lines      
      
      triangle ( n - 1 );
      
      for ( int star = 1; star <= n; star = star + 1 ) {
      
         System.out.print ( "*" );  
             
      } // end for
      
      System.out.println();  
      
   } // end triangle method
   
   public static double powerOfTen ( int n ) {
            
      // Error Case:
      // No error case is needed since the problem states that the parameter can be any integer, so positive, negative, and zero
      // integers are allowed in the method.  
      
      // Base case:
      // The base case here is when n equals zero. Any number to the power of 0 equals one, so return one if n equals zero. 
      
      if ( n == 0) {
      
         return 1;
         
      } // end if
      
      // Recursive Step
      // We need, in essence, two recursive steps since positive integers differ from negative integers. If 
      // the parameter is positive, return the recurisive step for positive numbers. If the parameter is 
      // negative, return the recursive step for negative numbers. A negative number means 1 divided by 
      // ten to the power of n, so that's why the return is 0.1 (i.e. a decimal). It is important to note 
      // that we do not need an else staement since the return staements within the if statements 
      // will stop the entire method. 
      
      if ( n > 0 ) {
      
         return 10 * powerOfTen( n - 1 );
      
      }  // end if
      
      return 0.1 * powerOfTen ( n + 1);
   
   } // end powerOfTen method 
   
   public static void main ( String args [] ) {
   
      // Testing the printLettersFoward method.
      
      System.out.println( "Testing the printLettersFoward method." );
      
      System.out.println( "Here is the output for printLettersForward('A'). This will prove that no Base Case is needed." );      
      printLettersForward( 'A' );
      System.out.println( );
      
      System.out.println( "Here is the output for printLettersForward('a'). This will prove that no Base Case is needed." );
      printLettersForward( 'a' );
      System.out.println( );
      
      System.out.println( "Here is the output for printLettersForward('Z'). This checks the end of the possible uppercase letters." );
      printLettersForward( 'Z' );
      System.out.println( );
      
      System.out.println( "Here is the output for printLettersForward('z'). This checks the end of the possible lowercase letters." );
      printLettersForward( 'z' );
      System.out.println( );
      
      System.out.println( "Here is the output for printLettersForward('R'). This checks if the recursive step for uppercase works." );
      printLettersForward( 'R' );
      System.out.println( );
      
      System.out.println( "Here is the output for printLettersForward('r'). This checks if the recursive step for lowercase works." );
      printLettersForward( 'r' );
      System.out.println( );
            
      System.out.println( "Here is the output for printLettersForward('5'). This checks if the error case works." );
      printLettersForward( '5' );
      System.out.println( );
      
      System.out.println( "Here is the output for printLettersForward('&'). This checks if the error case works." );
      printLettersForward( '&' );
      System.out.println( );
      
      // Testing the printLettersBackwards recursive method.
      
      System.out.println( "Testing the printLettersBackwards method." );
      
      System.out.println( "Here is the output for printLettersBackwards('A'). This will prove that no base case is needed." );      
      printLettersBackwards( 'A' );
      System.out.println( );
      
      System.out.println( "Here is the output for printLettersBackwards('a'). This will prove that no base is needed." );
      printLettersBackwards( 'a' );
      System.out.println( );
      
      System.out.println( "Here is the output for printLettersBackwards('Z'). This checks the end of the possible uppercase letters." );
      printLettersBackwards( 'Z' );
      System.out.println( );
      
      System.out.println( "Here is the output for printLettersBackwards('z'). This checks the end of the possible lowercase letters." );
      printLettersBackwards( 'z' );
      System.out.println( );
      
      System.out.println( "Here is the output for printLettersBackwards('R'). This checks if the recursive step for uppercase works." );
      printLettersBackwards( 'R' );
      System.out.println( );
      
      System.out.println( "Here is the output for printLettersBackwards('r'). This checks if the recursive step for lowercase works." );
      printLettersBackwards( 'r' );
      System.out.println( );
            
      System.out.println( "Here is the output for printLettersBackwards('5'). This checks if the error case works." );
      printLettersBackwards( '5' );
      System.out.println( );
      
      System.out.println( "Here is the output for printLettersBackwards('&'). This checks if the error case works." );
      printLettersBackwards( '&' );
      System.out.println( );
      
      // Testing the triangle recursive method.
      
      System.out.println( "Testing the triangle method." );
      
      System.out.println( "Here is the output for triangle(-5). This checks if the error case works." );      
      triangle( -5 );
      System.out.println( );
                  
      System.out.println( "Here is the output for triangle(0). This checks that if the recursive step works and that no base case is needed." );
      triangle( 0 );
      System.out.println( );
      
      System.out.println( "Here is the output for triangle(5). This checks if the recursive step works." );
      triangle( 5 );
      System.out.println( );
      
      System.out.println( "Here is the output for triangle(10). This checks if the recursive step works." );
      triangle( 10 );
      System.out.println( );
            
      // Testing the powerOfTen recursive method.
      
      System.out.println( "Testing the powerOfTen method." );
      
      System.out.println( "Here is the output for powerOfTen(0). This will check if the base case works." );
      System.out.println( powerOfTen(0) );
      
      System.out.println( "Here is the output for powerOfTen(-3). This will check the recursive step with negative parameters." );      
      System.out.println( powerOfTen(-3) );
      
      System.out.println( "Here is the output for powerOfTen(3). This will check the recursive step with positive parameters." );  
      System.out.println( powerOfTen(3) );

   } // end main method  

} // end class 