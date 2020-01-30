// Written by: Jose Franco Baquera
// CS 172 
// May 4, 2017
// Lab Assignment #10 
// Crayon.java
// Section M02
// Purpose of the applet: The purpose of the following object class is to make it able for other classes to create 
// a Cryon object class with the following data: width, heigth, color, and the coordinates of the bottom-left corner. 
// Input: No input from the user is needed.
// Output: No output in the applet. The crayons are drawn by calling the draw method from the BoxOfCrayons.java   

import java.awt.*;
import javax.swing.JApplet;

public class Crayon {

   // Instance variables. 
   
   // Width and heigth are integers because pixels only work in integers.
   
   private int width;
   private int height;
   
   // Color is an object class.
      
   private Color color;
   
   // Coordinates are in integers and represent the bottom-left cornor of the crayon; are integers because they work in pixels.
   
   private int xCoordinate;
   private int yCoordinate;
  
   // Write defualt constructor that sets width to 20, height to 100, color to black, and bottom-left cornor to (0, 100).
   
   public Crayon ( ) {
   
      width = 20;
      height = 100;
      color = Color.black; 
      xCoordinate = 0;
      yCoordinate = 100; 
   
   } // end of default constructor
   
   // Constructor that accepts 5 parameters, corresponding to width, height, color, and the x/y coordinates. 
      
   public Crayon ( int w, int h, Color c, int blx, int bly ) {
   
      width = w;
      height = h;
      color = c;
      xCoordinate = blx;
      yCoordinate = bly;  
   
   } // end contructor 
   
   // Include accessors for the private variables width, height, color, and the x/y coordinates in order for 
   // them to be accessible from other classes. 
      
   public int getWidth ( ) {
   
      return width;
   
   } // end getWidth 
   
   public int getHeight ( ) {
   
      return height;
   
   } // end getHeight
   
   public Color getColor ( ) {
   
      return color;
      
   } // end getColor
   
   public int getXCoordinate ( ) {
   
      return xCoordinate;
   
   } // end getxCoordinate
   
   public int getYCoordinate ( ) {
   
      return yCoordinate;
   
   } // end getyCoordinate
   
   // Include mutators for the private variables width, height, color, and the x/y coordinates in order for 
   // them to be able to be changed from other classes. 
   
   public void setWidth ( int w ) {
   
      width = w;
      
   } // end setWidth
   
   public void setHeight ( int h ) {
   
      height = h;   
   
   } // end setHeight  
   
   public void setColor ( Color c ) {
   
      color = c;
   
   } // end setColor
   
   public void setXCoordinate ( int blx ) {
      
      xCoordinate = blx;
   
   } // end setxCoordinate
   
   public void setYCoordinate ( int bly ) {
   
      yCoordinate = bly;
      
   } // end setyCoordinate
   
   // Include a draw method that accepts a Graphics object as its parameter. The draw method should draw a crayon with the
   // given parameters. First, draw a rectangle and then a polygon on top of the rectangle to represent the "tip" of the
   // crayon.
   
   public void draw ( Graphics g ) {
   
      g.setColor( color );
      
      g.fillRect( xCoordinate, yCoordinate - (int) ( 0.8 * height ), width, (int) (0.8 * height) );
      
      int xCoords [] = { xCoordinate + (int) (0.01 * width), xCoordinate + (int) (0.20 * width),
                        xCoordinate + (int)  (0.80 *width), xCoordinate + (int) ( 0.99 * width ) };
      
      int yCoords [] = { yCoordinate - (int)( 0.80 * height), yCoordinate - height, yCoordinate - height, yCoordinate - (int)(0.80 * height) };  
      
      g.fillPolygon( xCoords, yCoords, 4 );        
    
   } // end draw method
   
} // end class