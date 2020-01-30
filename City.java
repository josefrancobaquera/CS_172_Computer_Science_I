// Written by: Jose Franco Baquera
// CS 172 
// April 13, 2017
// Lab Assignment #8 
// City.java
// Section M02
// Purpose of the program/applet: The following applet consists of one user-defined method and one paint method. 
// The purpose of the applet is for the paint method to call the user defined method and drawing 5 buildings (no overllaping, in the same
// eye-level), with different random colors (except white, gray, or black) and different sizes, as well as a road. 
// Input: No output form the user.
// Output: Five buildings, all drawn in the same line, with different sizes and random colors, as well as a road with yellow passing lane marks. 

import java.awt.*;
import javax.swing.JApplet;

public class City extends JApplet {
   
   public void drawBuilding ( Graphics g, int x, int y, int width, int height ) { 
      
      // Draw the building with the random color already inizilized in the paint method and the paramters. 
      
      g.fillRect( x, y, width, height );
      
      // Draw 4 "proportional" white windows.
         
      g.setColor( Color.white );      
      g.fillRect ( x + ( ( width * 3 ) / 12 ), y + ( height / 6 ), 15, 15 );
      g.fillRect ( x + ( ( width * 5 ) / 8 ), y + ( height / 6 ), 15, 15 );
      g.fillRect ( x + ( ( width * 3 ) / 12 ), y + ( (height * 3 ) / 6 ), 15, 15 );
      g.fillRect ( x + ( ( width * 5 ) / 8 ), y + ( (height * 3 ) / 6 ), 15, 15 );
      
      // Draw a proportional light grey door.
      
      g.setColor ( Color.lightGray );
      g.fillRect ( x + ( ( width * 19 ) / 48 ), ( y + height - 30 ), 25, 30 );
            
      // Draw the outline of the building in black. 
     
      g.setColor( Color.black );
      g.drawRect( x, y, width, height );
   
   } // end drawBuilding method
   
   public void paint ( Graphics g ) {
      
      // Inizialize the three variables in order to make it possible for random colors. Assign the 
      // x/y coordiantes, width, and height of the buildings using an array. 
      
      int red, green, blue;
      int xCoord [] = { 8, 83, 143, 262, 317 };
      int yCoord [] = { 50, 30, 70, 0, 55 };
      int rectWidth [] = { 75, 60, 120, 55, 80 };
      int rectHeight [] = { 100, 120, 80, 150, 95 };    
      
      // Use a for loop that will iterate five times (i.e. drawing five buildings) and will select
      // a random color as well. 
     
      for ( int i = 0; i <= 4; i = i + 1 ) {
      
         // The random colors should not be white, gray, or black. Therefore, RGB should never be
         // ( 0, 0, 0 ), ( 255, 255, 255 ), or ( 128, 128, 128 ). Modify the max and min so the color is never 
         // black or white, and use if statement so neither of the RGB are 128.
      
         red = ( int ) ( Math.random ( ) * ( 254 - 1 + 1) + 1 );
         
         while ( red == 128 )
            
            red = ( int ) ( Math.random ( ) * ( 254 - 1 + 1) + 1 );
            
         green = ( int ) ( Math.random ( ) * ( 254 - 1 + 1) + 1 );
         
         while ( green == 128 )
         
            green = ( int ) ( Math.random ( ) * ( 254 - 1 + 1) + 1 );
         
         blue = ( int ) ( Math.random ( ) * ( 254 - 1 + 1) + 1 );
         
         while ( blue == 128 ) 
         
            blue = ( int ) ( Math.random ( ) * ( 254 - 1 + 1) + 1 );
            
         // Set the color to the random RGB and call the drawBuilding using the array list.
                
         g.setColor( new Color ( red, green, blue ) );
         drawBuilding ( g, xCoord[i], yCoord[i], rectWidth[i], rectHeight[i] );
      
      } // end for
      
      // Draw a gray street along the front of the building. First, set the color gray and draw a rectangle,
      // starting from the first building until the end of the last building.

      g.setColor( Color.gray );
      g.fillRect( 8, 151, 390, 50 );
      
      // Draw some yellow rectangles in-between the street in order to make it seem like "not passing lanes."
      // Use for loop to draw many of these yellow rectangles.  
      
      g.setColor( Color.yellow );
      int countSpace = 12;
      
      for ( int k = 1; k <= 26; k = k + 1 ) {
      
         g.fillRect( countSpace, 172, 10, 5 );
         
         countSpace = countSpace + 15;    
      
      } // end for
      
   } // end paint method
   
} // end for 