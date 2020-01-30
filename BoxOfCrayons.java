// Written by: Jose Franco Baquera
// CS 172 
// May 4, 2017
// Lab Assignment #10 
// BoxOfCrayons.java
// Section M02
// Purpose of the applet: The purpose of the following applet is to create eight different crayons (using the Cryon object class)
// with random colors, xCoordinates, y coordinates, widths, and heights. All of the crayons should align along the bottom edge and should be side-by-side. 
// Input: No input from the user is needed.
// Output: Eight crayons with different sizes, but all of them aligned at the bottom and side-by-side.  

import java.awt.*;
import javax.swing.JApplet;

public class BoxOfCrayons extends JApplet { 

   public void paint ( Graphics g ) {
   
      // Draw a big white, filled rectangle so when the applet is streched, the "offset" crayons are deleted. 
   
      g.setColor( Color.white );
      g.fillRect( 0, 0, 700, 700 );
      
      // Inizialize some variables. Width and height will allways be random numbers and change, but the y and x coordinates 
      // will only be random once, with the x coordinate changing in the for loop while the y coordinate never changing. The y coordinate
      // will never change because all crayons must be alligned. 
   
      int height, width; 
      int x =(int) ( Math.random () * (80 - 20 + 1 )  + 20 );
      int y = (int) ( Math.random () * (400 - 350 + 1 )  + 350 );
      
      // Use a for loop that will draw eight crayons with random colors, heights, and width, and changing the x coordinate every time
      // in order for the crayons to be side-by-side and not overlapping. 
   
      for( int i = 0; i < 8; i = i + 1 ) {
   
         Color randomColor = new Color( (int)( Math.random()*(255) + 1 ), (int)(Math.random()*(255) + 1), (int)(Math.random()*(255) + 1) ) ;
         height = (int) ( Math.random () * (320 - 125 + 1 )  + 125 );
         width = (int) ( Math.random () * (70 - 40 + 1 )  + 40 );
          
         Crayon drawingCrayon = new Crayon ( width, height, randomColor, x, y );
      
         drawingCrayon.draw(g);
         
         x = x + width;
         
         } // end for loop
         
   } // end paint method
   
} // end class 