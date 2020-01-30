// Written by: Jose Franco Baquera
// CS 172 
// May 4, 2017
// Lab Assignment #10 
// Car.java
// Section M02
// Purpose of the program: The following object class program will have instance data that represents the make,
// model, and year of a car. The program will have a contructor, accessors, and mutators for all three instance 
// varibles. The program will also use the toString method that will return a one-line description of the car. 
// The purpose of the program is to make it possible for other classes to create a Car class object.   
// Input: No input from the user is needed.
// Output: No print statements are in this class.   

public class Car { 

   // Create private instance variables.
   
   private String make;
   private String model;
   private int year;
   
   // No default contructor is needed, but a general constructor is needed. The constructor will have three parameters
   // and will inizialize the instance variables.
   
   public Car ( String mk, String mo, int yr ) {
   
      make = mk;
      model = mo;
      year = yr;   
   
   } // end constructor 
   
   // Include accessors for the private variables make, model, and year in order for them to be accesible from 
   // other classes. 
   
   public String getMake ( ) {
   
      return make;
      
   } // end getMake 
   
   public String getModel ( ) {
      
      return model;
   
   } // end getModel 
   
   public int getYear ( ) {
      
      return year;
   
   } // end getYear
   
   // Include mutators for the private variables make, model, and year in order for them to be able to be changed 
   // from other classes. 
   
   public void setMake ( String mk ) {
   
      make = mk; 
   
   } // end setMake
   
   public void setModel ( String mo ) {
   
      model = mo;
      
   } // end setModel
   
   public void setYear ( int yr ) {
   
      year = yr;   
   
   } // end set Year
   
   // We need a toString method that will return a one-line description of the car. The returned string should be
   // in the folowing order: "year make model". Concatination is needed. 
   
   public String toString ( ) {
   
      String description;
      
      description = year + " " + make + " " + model;
      
      return description;
   
   } // end toString
   
} // end class Car