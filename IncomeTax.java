// CS 172
// IncomeTax.java
// Lab: Section M02
// Written by: Jose Franco Baquera
// February 9, 2017
// Pupose of the program: The program is designed to 
// allow users to input a the annual income of a person, then 
// calulate the tax rate and the amount he or she needs to pay. If 
// zero or a negative amount is entered, an Error message will print. 
// Input: User is allowed to input the annual salary of a person (int. only)
// Output: The program will output the annual salary inputted, the tax rate,
// and the tax to pay. An error message will print if the user 
// inputs a value less than or equal to zero.   

import java.util.Scanner;

public class IncomeTax {
   public static void main (String args []) {
   
   // Declare two int variables (annualSalary and taxToPay), one 
   // double variable (taxRate), and a Scanner.
   
   Scanner scnr = new Scanner(System.in);
   int annualSalary = 0;
   double taxRate = 0.0;
   int taxToPay = 0;
   
   // Print a prompt to the user and assign the inputed value to
   // the variable annualSalary
   
   System.out.println( "Enter annual salary: ");
   annualSalary = scnr.nextInt();
   
   // Determine which tax rate will be used from the annual salary using a tiered approach.
   // If the user inputted a number that is less than or equal to zero, then an error message
   // will be printed.
   
   if (annualSalary <= 0){
      System.out.println( "ERROR: SALARY ENTERED IS LESS THAN OR EQUAL TO ZERO.");
      return;
   }
   else if (annualSalary <= 20000){
      taxRate = 0.10;
   }
   else if (annualSalary <= 50000){
      taxRate = 0.20;
   }
   else if (annualSalary <= 100000){
      taxRate = 0.30;
   }
   else { 
      taxRate = 0.40;
   }   
  
   // Truncate tax to an integer amount and print a small summary.
   
   taxToPay = (int) (annualSalary * taxRate); 
   System.out.println( "Annual Salary: " + annualSalary);
   System.out.println( "Tax rate: " + taxRate);
   System.out.println( "Tax to pay: " +taxToPay);
   
   return;
   
   } //end class
   
 } // end main
   
   
   



