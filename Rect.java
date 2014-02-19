package shapes;
import java.awt.*;

    // Rectangle class, containing draw methods for left, middle and right locations
    public class Rect extends Shapes
    {

	public static void RectdrawLeft ()
	{
	    c.drawRect ((xCoord - widthShape / 2) - padding, yCoord - heightShape / 2, widthShape, heightShape);
	    c.fillRect ((xCoord - widthShape / 2) - padding, yCoord - heightShape / 2, widthShape, heightShape);

	}

	public static void Rectdraw ()
	{
	    c.drawRect ((xCoord - widthShape / 2), yCoord - heightShape / 2, widthShape, heightShape);
	    c.fillRect ((xCoord - widthShape / 2), yCoord - heightShape / 2, widthShape, heightShape);

	}

	public static void RectdrawRight ()
	{
	    c.drawRect ((xCoord - widthShape / 2) + padding, yCoord - heightShape / 2, widthShape, heightShape);
	    c.fillRect ((xCoord - widthShape / 2) + padding, yCoord - heightShape / 2, widthShape, heightShape);

	}
    }
