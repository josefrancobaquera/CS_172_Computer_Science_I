// Written by: Jose Franco Baquera
// CS 172 
// May 4, 2017
// Lab Assignment #10 
// CarTest.java
// Section M02
// Purpose of the program: The following application will test the object class Car by calling each method 
// in the class Car.java and printing the results.    
// Input: No input from the user is needed.
// Output: Will print the year, make, and model of each object class that is created and modified. 
// NOTE: All the makes, models, and years were gathered from the website wwww.ranker.com

public class CartTest {

   public static void main ( String args [] ) {   
   
      // Create several Car object classes in order to test the methods in the class Car.java
   
      Car car1 = new Car ( "Ford", "Mustang", 2015 );
      Car car2 = new Car ( "BMW", "M5", 1986 );
      Car car3 = new Car ( "Austin", "Montego", 1984 ); 
      
      // Test each mutator and accessor methods.
      
      System.out.println( "Here is car1 toString result BEFORE any modifications using the mutator methods: " + car1.toString( ) );
      System.out.println( "Here is car2 toString result BEFORE any modifications using the mutator methods: " + car2.toString( ) );
      System.out.println( "Here is car3 toString result BEFORE any modifications using the mutator methods: " + car3.toString( ) );
      
      System.out.println( "Modify car1 to test the methods." );
      
      car1.setMake( "Austin" );
      System.out.println( "The new make of car1 is: " + car1.getMake( ) );
      car1.setModel( "Nash-Metropolitan" );
      System.out.println( "The new model of car1 is: " + car1.getModel( ) );
      car1.setYear( 1954 );
      System.out.println( "The new year of car1 is: " + car1.getYear( ) );
      System.out.println( "Here is car1 toString result AFTER the modifications: " + car1.toString( ) );
      
      System.out.println( "Modify car2 to test the methods." );
      
      car2.setMake( "Ford" );
      System.out.println( "The new make of car2 is: " + car2.getMake( ) );
      car2.setModel( "Fiesta" );
      System.out.println( "The new model of car2 is: " + car2.getModel( ) );
      car2.setYear( 2010 );
      System.out.println( "The new year of car2 is: " + car2.getYear( ) );
      System.out.println( "Here is car2 toString result AFTER the modifications: " + car2.toString( ) );
      
      System.out.println( "Modify car3 to test the methods." );
      
      car3.setMake( "BMW" );
      System.out.println( "The new make of car3 is: " + car3.getMake( ) );
      car3.setModel( "Z8" );
      System.out.println( "The new model of car3 is: " + car3.getModel( ) );
      car3.setYear( 2003 );
      System.out.println( "The new year of car3 is: " + car2.getYear( ) );
      System.out.println( "Here is car3 toString result AFTER the modifications: " + car3.toString( ) );
     
   } // end main
   
} // end class  