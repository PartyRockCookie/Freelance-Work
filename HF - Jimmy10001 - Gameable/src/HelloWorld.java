/**
 * @author Willie Ausrotas <wausrotas@gmail.com>
 */

import java.applet.Applet;   // Imports the Applet class
import java.awt.Graphics;    // Imports the Graphics class, used to draw lines, circles, squares, text, etc

/** 
  * The HelloWorld class implements an applet that simply displays "Hello World!". 
  */ 
  
// Our HelloWorld class extends  the Applet class, giving it access to all the methods of Applet.
public class HelloWorld extends Applet {         
    
    // The paint method draws anything that is in our applet on the applet screen.  
    // It takes a graphics object (g), that is used to draw
        
    public void paint(Graphics g) 
    {     
        // drawString is a method of the Graphics class.  It takes a string, and two integer parameters 
        // as x and y coordinates.  These coordinates correspond to Quadrant I of a traditional coordinate
        // plane, so they are always positive.         
        g.drawString("My name is Kevan!", 50, 10); 
        g.drawString("I love coding in Java!", 25, 200);
        printCommonLogTable(g);
        
    }
    
	public static void printCommonLogTable(Graphics g) {
		double num = 0;
		g.drawString("Value of N:       Result:", 10, 35);
		
		int y = 45;
		while (num <= 10) {
			g.drawString((num + "              " + Math.log10(num)), 10, y);
			num += 2;
			y+=10;
		}
	}
}