// Written by: Jose Franco Baquera
// CS 172 
// April 6, 2017
// Lab Assignment #7 
// Lab7Test.java
// Section M02
// Pupose of the program: The following program consists of one main method and no other methods. However,
// this program will have multiple method calls to Lab7Methods.java (i.e. in the same folder but different class).
// The purpose of this is to check wether or not the methods in the other class are correct.    
// Input: No output form the user.
// Output: All the odd numbers between 1 and 100, the number of times a specific number shows in an array list, the 
// rearrenge "First Last" to "Last, First" name, true if a String has a lower-case and false if it doesn't, and 
// an array of how many A', B's, C's, D's, and F's in an array of grades.

public class Lab7Test {

   public static void main (String args [ ]) {
   
      // *********Testing "Pre-Problem"*********
      
      System.out.println( "Testing printOddNumbers with an integer of 100." );
      System.out.println( "The result is:" );
      
      Lab7Methods.printOddNumbers( 100 );
      
      // *********Test countNumbers Method*********
      
      int arrayTest1 [] = {-1, 0, 0, 0, 98, 10, -9};
      int arrayTest2 [] = {666, 0, 0, 69, 69, 15};
      int arrayTest3 [] = {69, 2, 5};
      
      // Test with a zero int parameter
      
      System.out.println( "Testing countNumbers with an array containing the integers -1, 0, 0, 0, 98, 10, -9 and counting the number of 0's in the array." );
      System.out.println( "The result is " + Lab7Methods.countNumbers(arrayTest1, 0) + ".");
      
      // Test with two elements having the same number of two different numbers
      
      System.out.println( "Testing countNumbers with an array containing the integers 666, 0, 0, 69, 69, 15 and counting the number of 69's in the array." );
      System.out.println( "The result is " + Lab7Methods.countNumbers(arrayTest2, 69) + ".");
      
      // Test with a parameter number that has zero counts in the array list
     
      System.out.println( "Testing countNumbers with an array containing the integers 69, 2, 5 and counting the number of 1's in the array." );
      System.out.println( "The result is " + Lab7Methods.countNumbers(arrayTest3, 1) + ".");
     
      // *********Test formatName Method*********
      
      String stringTest1 = "Jose Franco";
      String stringTest2 = "JENNIFER LOPEZ";
      String stringTest3 = "johonny depp";
     
      // Test with "regular name"
      
      System.out.println( "Testing formatName with a Sring \"Jose Franco\"." );
      System.out.println( "The result is " + Lab7Methods.formatName(stringTest1) );
      
      // Test with a all upper-case name
      
      System.out.println( "Testing formatName with a Sring \"JENNIFER LOPEZ\"." );
      System.out.println( "The result is " + Lab7Methods.formatName(stringTest2) );
     
      // Test will a all lower-case name
      
      System.out.println( "Testing formatName with a Sring \"johonny depp\"." );
      System.out.println( "The result is " + Lab7Methods.formatName(stringTest3) );
      
      // *********Test hasLower Method*********
      
      String stringTest4 = "ABCDEf";
      String stringTest5 = "aBCDEF";
      String stringTest6 = "AbCdEf";
      String stringTest7 = "ABCDEF";
      String stringTest8 = "abcdef";
      
      // Test with one last lower-case
      
      System.out.println( "Testing hasLower with a Sring \"ABCDEf\"." );
      System.out.println( "The result is " + Lab7Methods.hasLower(stringTest4) );
      
      // Test with one first lower-case
      
      System.out.println( "Testing hasLower with a Sring \"aBCDEF\"." );
      System.out.println( "The result is " + Lab7Methods.hasLower(stringTest5) );
      
      // Test with upper-to-lower-case
      
      System.out.println( "Testing hasLower with a Sring \"AbCdEf\"." );
      System.out.println( "The result is " + Lab7Methods.hasLower(stringTest6) );
      
      // Test with all upper-case
      
      System.out.println( "Testing hasLower with a Sring \"ABCDEF\"." );
      System.out.println( "The result is " + Lab7Methods.hasLower(stringTest7) );
      
      // Test with all lower-case
      
      System.out.println( "Testing hasLower with a Sring \"abcdef\"." );
      System.out.println( "The result is " + Lab7Methods.hasLower(stringTest8) );
       
      // *********Test gradeTable Method*********
      
      float arrayTest4 [] = { 69.10f, 70.00f, 99.58f };
      float arrayTest5 [] = { 13.69f, 25.90f, 96.10f, 100.00f, 72.39f };
      float arrayTest6 [] = { 89.91f, 71.30f, 62.39f, 57.89f, 89.98f, 15.69f, 78.12f };
      float arrayTest7 [] = { 96.60f, 96.60f, 96.60f, 96.60f, 96.60f };
      float arrayTest8 [] = { 90.00f, 89.99f, 79.99f, 69.99f, 59.99f };
      
      // Test with three grades
      
      int gradeTest1 [] = Lab7Methods.gradeTable ( arrayTest4 );
      System.out.println( "Testing gradeTable with 69.10, 70.00, and 99.58." );
      System.out.println( "The result is \n" + gradeTest1[0] + " number of A's\n" + gradeTest1[1] + " number of B's\n" + gradeTest1[2] 
      + " number of C's\n" + gradeTest1[3] + " number of D's\n" + gradeTest1[4] + " number of F's" );
      
      // Test with five grades ( the same number as letter grades)
      
      int gradeTest2 [] = Lab7Methods.gradeTable ( arrayTest5 );
      System.out.println( "Testing gradeTable with 13.69, 25.90, 96.10, 100.00, and 72.39." );
      System.out.println( "The result is \n" + gradeTest2[0] + " number of A's\n" + gradeTest2[1] + " number of B's\n" + gradeTest2[2] 
      + " number of C's\n" + gradeTest2[3] + " number of D's\n" + gradeTest2[4] + " number of F's" );      
      
      // Test with seven grades
      
      int gradeTest3 [] = Lab7Methods.gradeTable ( arrayTest6 );
      System.out.println( "Testing gradeTable with 89.91, 71.30, 62.39, 57.89, 89.98, 15.69, and 78.12." );
      System.out.println( "The result is \n" + gradeTest3[0] + " number of A's\n" + gradeTest3[1] + " number of B's\n" + gradeTest3[2] 
      + " number of C's\n" + gradeTest3[3] + " number of D's\n" + gradeTest3[4] + " number of F's" ); 
      
      // Test five repeated grades
      
      int gradeTest4 [] = Lab7Methods.gradeTable ( arrayTest7 );
      System.out.println( "Testing gradeTable with 96.60, 96.60, 96.60, 96.60, and 96.60." );
      System.out.println( "The result is \n" + gradeTest4[0] + " number of A's\n" + gradeTest4[1] + " number of B's\n" + gradeTest4[2] 
      + " number of C's\n" + gradeTest4[3] + " number of D's\n" + gradeTest4[4] + " number of F's" ); 
      
      // Test with one grade per letter grade at the limits 
      
      int gradeTest5 [] = Lab7Methods.gradeTable ( arrayTest8 );
      System.out.println( "Testing gradeTable with 90.00, 89.99, 79.99, 69.99, and 59.99." ); 
      System.out.println( "The result is \n" + gradeTest5[0] + " number of A's\n" + gradeTest5[1] + " number of B's\n" + gradeTest5[2] 
      + " number of C's\n" + gradeTest5[3] + " number of D's\n" + gradeTest5[4] + " number of F's" ); 

   
   } // end main method
   
} // end class
