// Written by: Jose Franco Baquera
// CS 172 
// April 13, 2017
// Lab Assignment #8 
// Sky.java
// Section M02
// Purpose of the program/applet: The following applet consists of one user-defined method and a paint method. 
// The method will initizlie some variables, then use a for loop to draw ten stars. Inside the for loop, 
// the star size, y and x coordinate, and color will be generated randomly in each iteration of the loop. The for loop
// will call the fillStar method ten times and draw ten stars randomly.  
// Input: No output form the user.
// Output: Ten randomly sized and colored stars in random locations, fully in the applet window. 

import java.awt.*;
import javax.swing.JApplet;

public class Sky extends JApplet {
   
   // Define a method that will paint the star.
   
   public void fillStar ( Graphics g, int x, int y, int size ) {
   
      // Inizilize the x coordinated, making sure to "caste" since doube values need to be integers (i.e. pixels are allawys integers).
      
      int xcoords [] = { x, (int) ( x + ( 0.20 * size ) ), (int) ( x + ( 0.50 * size ) ), (int) ( x + ( 0.30 * size ) ),
                       (int) ( x + ( 0.50 * size ) ), x, (int) ( x - ( 0.50 * size ) ), (int) ( x - ( 0.30 * size ) ),
                       (int) ( x - ( 0.50 * size ) ), (int) ( x - ( 0.20 * size ) ) };     
       
      int ycoords [] = { y, (int) ( y + ( 0.30 * size ) ), (int) ( y + ( 0.30 * size ) ), (int) ( y + ( 0.60 * size ) ),
                       (int) ( y + ( 1.0 * size ) ), (int) ( y + ( 0.70 * size ) ), (int) ( y + ( 1.0 * size ) ),
                       (int) ( y + ( 0.60 * size ) ), (int) ( y + ( 0.30 * size ) ), (int) ( y + ( 0.30 * size ) ) };
                       
      // Draw the star through a polygon call, with 10 vertices.
                       
      g.fillPolygon( xcoords, ycoords, 10 ); 
         
   } // end fillStar method
   
   public void paint ( Graphics g ) {
   
      // Inizialize some variables in order to make it possible to make random colors, sizes, and x/y coordinates. 
      
      int starSize, randxCoord, randyCoord;
      int red, green, blue;
                
      for ( int i = 1; i <= 10; i = i + 1 ) {
      
         // Generate the star size between 100 to 40 pixels.
      
         starSize = (int) ( Math.random() * ( 100 - 40 + 1) + 40 );
         
         // Generate random x and y coordinates, all while making sure that the stars do not "hang off" the edge and 
         // are FULLY visible.
         
         randxCoord = (int) ( Math.random() * ( 330 - 51 + 1 ) + 51 );
         randyCoord = (int) ( Math.random() * ( 300 - 0 + 1) + 0);
         
         // Find a random color and set it as the color.
         
         red = ( int ) ( Math.random ( ) * ( 255 - 0 + 1 ) + 0 );            
         green = ( int ) ( Math.random ( ) * ( 255 - 0 + 1 ) + 0 );         
         blue = ( int ) ( Math.random ( ) * ( 255 - 0 + 1 ) + 0 );            
         g.setColor( new Color ( red, green, blue ) );
         
         // Call the fillStar method.
         
         fillStar( g, randxCoord, randyCoord, starSize ); 
         
      } // end for
      
   } // end paint method
   
} // end class 