package shapes;
import java.awt.*;

    // Circle class, containing draw methods for left, middle and right locations
    public class Circle extends Shapes
    {

	public static void CircledrawLeft ()
	{
	    c.drawOval ((xCoord - widthShape / 2) - padding, yCoord - heightShape / 2, widthShape, heightShape);
	    c.fillOval ((xCoord - widthShape / 2) - padding, yCoord - heightShape / 2, widthShape, heightShape);

	}

	public static void Circledraw ()
	{
	    c.drawOval ((xCoord - widthShape / 2), yCoord - heightShape / 2, widthShape, heightShape);
	    c.fillOval ((xCoord - widthShape / 2), yCoord - heightShape / 2, widthShape, heightShape);

	}

	public static void CircledrawRight ()
	{
	    c.drawOval ((xCoord - widthShape / 2) + padding, yCoord - heightShape / 2, widthShape, heightShape);
	    c.fillOval ((xCoord - widthShape / 2) + padding, yCoord - heightShape / 2, widthShape, heightShape);

	}
    }
