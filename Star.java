package shapes;
import java.awt.*;

    // Star class, containing draw methods for left, middle and right locations
    public class Star extends Shapes
    {
	public static void StardrawLeft ()
	{
	    c.drawStar ((xCoord - widthShape / 2) - padding, yCoord - heightShape / 2, widthShape, heightShape);
	    c.fillStar ((xCoord - widthShape / 2) - padding, yCoord - heightShape / 2, widthShape, heightShape);
	}

	public static void Stardraw ()
	{
	    c.drawStar ((xCoord - widthShape / 2), yCoord - heightShape / 2, widthShape, heightShape);
	    c.fillStar ((xCoord - widthShape / 2), yCoord - heightShape / 2, widthShape, heightShape);
	}

	public static void StardrawRight ()
	{
	    c.drawStar ((xCoord - widthShape / 2) + padding, yCoord - heightShape / 2, widthShape, heightShape);
	    c.fillStar ((xCoord - widthShape / 2) + padding, yCoord - heightShape / 2, widthShape, heightShape);
	}
    }
