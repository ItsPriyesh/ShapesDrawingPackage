package shapes;
/*
*
* Program: Shape Drawer
* Author: Priyesh Patel
* Teacher: My. Cuyugan
* Level: Grade 12 - ICS4U
* Description: Allows user to pick from various shapes and draw them on screen. The program will custom draw these shapes based
*              on multiple user defined parameters such as width, height and colour.
*
*/

import java.awt.*;
import hsa.Console;

public class Shapes
{
    static Console c;

    // General parameters for all shapes
    static int xCoord, yCoord, widthShape, heightShape;
    static int width, height;

    // Array of X and Y points for triangle, and part of heart
    static int[] xPoints;
    static int[] yPoints;

    // Spacing in between shapes
    static int padding;

    // Color of shapes
    static int shapeColor;

    // The main block
    public static void main (String[] args)
    {
	// Define console with 20 rows and 80 columns
	c = new Console (20, 80);
	
	// Get pixel dimensions of console
	width = c.getWidth ();
	height = c.getHeight ();

	// Locate middle point
	xCoord = width / 2;
	yCoord = height / 2;

	// Set spacing to 100
	padding = 100;

	boolean enableSplash = true; //allows for programmer to easily enable or disable splash screen while testing

	// Program splash screen
	if (enableSplash == true)
	{
	    for (int j = 5 ; j > -1 ; j--)
	    {
		c.println ("\n\n\n\n\n\n\n\n\n                              Welcome to Shape Drawer");
		c.println ("                            Developed by Priyesh Patel\n");
		c.println ("                                  Starting in: " + j);
		delayer (1000);
		c.clear ();
	    }
	}

	// Get width of shapes
	c.print ("Enter a width between 10 and 90\n>> ");
	widthShape = c.readInt ();
	while (true)
	{ // Error proofing for if user enters a value too big/small
	    if (widthShape <= 90 && widthShape >= 10)
	    {
		break;
	    }
	    else
	    {
		c.clear ();
		c.print ("Your width doesn't match the requirements. Enter a width between 10 and 90.\n>> ");
		widthShape = c.readInt ();
	    }
	}
	c.clear ();

	// Get height of shapes
	c.print ("Enter a height between 10 and 200\n>> ");
	heightShape = c.readInt ();
	while (true)
	{ // Error proofing for if user enters a value too big/small
	    if (heightShape <= 200 && heightShape >= 10)
	    {
		break;
	    }
	    else
	    {
		c.clear ();
		c.print ("Your height doesn't match the requirements. Enter a height between 10 and 200.\n>> ");
		heightShape = c.readInt ();
	    }
	}
	c.clear ();

	// Ask for shape 1
	c.println ("\n(1) Circle            (2) Triangle            (3) Rectangle\n(4) Maple Leaf        (5) Star                (6) Heart\n");
	c.print ("Choose a first shape: ");
	int shapeChoice1 = c.readInt ();
	while (true)
	{ // Error proofing for if user enters a value too big/small
	    if (shapeChoice1 <= 6 && shapeChoice1 >= 1)
	    {
		break;
	    }
	    else
	    {
		c.clear ();
		c.println ("\n(1) Circle            (2) Triangle            (3) Rectangle\n(4) Maple Leaf        (5) Star                (6) Heart\n");
		c.print ("Not a valid shape. Choose a first shape: ");
		shapeChoice1 = c.readInt ();
	    }
	}
	c.clear ();

	// Ask for shape 2
	c.println ("\n(1) Circle            (2) Triangle            (3) Rectangle\n(4) Maple Leaf        (5) Star                (6) Heart\n");
	c.print ("Choose a second shape: ");
	int shapeChoice2 = c.readInt ();
	while (true)
	{ // Error proofing for if user enters a value too big/small
	    if (shapeChoice2 <= 6 && shapeChoice2 >= 1)
	    {
		break;
	    }
	    else
	    {
		c.clear ();
		c.println ("\n(1) Circle            (2) Triangle            (3) Rectangle\n(4) Maple Leaf        (5) Star                (6) Heart\n");
		c.print ("Not a valid shape. Choose a second shape: ");
		shapeChoice2 = c.readInt ();
	    }
	}
	c.clear ();

	// Ask for shape 3
	c.println ("\n(1) Circle            (2) Triangle            (3) Rectangle\n(4) Maple Leaf        (5) Star                (6) Heart\n");
	c.print ("Choose a third shape: ");
	int shapeChoice3 = c.readInt ();
	while (true)
	{ // Error proofing for if user enters a value too big/small
	    if (shapeChoice3 <= 6 && shapeChoice3 >= 1)
	    {
		break;
	    }
	    else
	    {
		c.clear ();
		c.println ("\n(1) Circle            (2) Triangle            (3) Rectangle\n(4) Maple Leaf        (5) Star                (6) Heart\n");
		c.print ("Not a valid shape. Choose a third shape: ");
		shapeChoice3 = c.readInt ();
	    }
	}
	c.clear ();

	// Ask for shapeColor
	c.println ("\n(1) Blue            (2) Red            (3) Yellow\n(4) Green           (5) Purple         (6) Black\n");
	c.print ("Pick a color for the shapes: ");
	shapeColor = c.readInt ();
	while (true)
	{ // Error proofing for if user enters a value too big/small
	    if (shapeColor <= 6 && shapeColor >= 1)
	    {
		break;
	    }
	    else
	    {
		c.clear ();
		c.println ("\n(1) Blue            (2) Red            (3) Yellow\n(4) Green           (5) Purple         (6) Black\n");
		c.print ("Not a valid color. Pick again: ");
		shapeColor = c.readInt ();
	    }
	}
	c.clear ();

	// Set color of shapes based on what user defined
	if (shapeColor == 1)
	{
	    c.setColor (Color.blue);
	}
	else if (shapeColor == 2)
	{
	    c.setColor (Color.red);
	}
	else if (shapeColor == 3)
	{
	    c.setColor (Color.yellow);
	}
	else if (shapeColor == 4)
	{
	    c.setColor (Color.green);
	}
	else if (shapeColor == 5)
	{
	    c.setColor (Color.magenta);
	}
	else if (shapeColor == 6)
	{
	    c.setColor (Color.black);
	}

	// Call correspoding method depending on what shape 1 was defined by user
	if (shapeChoice1 == 1)
	{
	    Circle.CircledrawLeft ();
	}
	else if (shapeChoice1 == 2)
	{
	    Triangle.TriangledrawLeft ();
	}
	else if (shapeChoice1 == 3)
	{
	    Rect.RectdrawLeft ();
	}
	else if (shapeChoice1 == 4)
	{
	    Mapleleaf.MapleleafdrawLeft ();
	}
	else if (shapeChoice1 == 5)
	{
	    Star.StardrawLeft ();
	}
	else if (shapeChoice1 == 6)
	{
	    Heart.HeartdrawLeft ();
	}

	// Call correspoding method depending on what shape 2 was defined by user
	if (shapeChoice2 == 1)
	{
	    Circle.Circledraw ();
	}
	else if (shapeChoice2 == 2)
	{
	    Triangle.Triangledraw ();
	}
	else if (shapeChoice2 == 3)
	{
	    Rect.Rectdraw ();
	}
	else if (shapeChoice2 == 4)
	{
	    Mapleleaf.Mapleleafdraw ();
	}
	else if (shapeChoice2 == 5)
	{
	    Star.Stardraw ();
	}
	else if (shapeChoice2 == 6)
	{
	    Heart.Heartdraw ();
	}

	// Call correspoding method depending on what shape 3 was defined by user
	if (shapeChoice3 == 1)
	{
	    Circle.CircledrawRight ();
	}
	else if (shapeChoice3 == 2)
	{
	    Triangle.TriangledrawRight ();
	}
	else if (shapeChoice3 == 3)
	{
	    Rect.RectdrawRight ();
	}
	else if (shapeChoice3 == 4)
	{
	    Mapleleaf.MapleleafdrawRight ();
	}
	else if (shapeChoice3 == 5)
	{
	    Star.StardrawRight ();
	}
	else if (shapeChoice3 == 6)
	{
	    Heart.HeartdrawRight ();
	}
    }

    // Method to set general parameters
    public static void params (int x, int y, int width, int height)
    {
	xCoord = x;
	yCoord = y;
	widthShape = width;
	heightShape = height;
    }

    // 1 second delay method for countdown on splash screen
    private static void delayer (long milliseconds)
    {
	try
	{
	    Thread.sleep (1000);
	}
	catch (InterruptedException ex)
	{
	}
    }
} // Shapes class
