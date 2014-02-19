package shapes;
import java.awt.*;

    // Heart class, containing draw methods for left, middle and right locations
    public class Heart extends Shapes
    {
	public static void HeartdrawLeft ()
	{
	    // Left bump
	    c.drawOval ((xCoord - (widthShape / 2)) - padding, yCoord - (heightShape / 2), (widthShape / 2), (heightShape / 2));
	    c.fillOval ((xCoord - (widthShape / 2)) - padding, yCoord - (heightShape / 2), (widthShape / 2), (heightShape / 2));

	    // Right bump
	    c.drawOval (xCoord - padding, yCoord - (heightShape / 2), (widthShape / 2), (heightShape / 2));
	    c.fillOval (xCoord - padding, yCoord - (heightShape / 2), (widthShape / 2), (heightShape / 2));

	    // Flipped triangle for bottom section of heart
	    int[] xPoints = { ((width / 2) - (widthShape / 2)) - padding, (width / 2) - padding, ((width / 2) + (widthShape / 2)) - padding};
	    int[] yPoints = { (height / 2) - (heightShape / 4), (height / 2) + (heightShape / 2), (height / 2) - (heightShape / 4) };
	    c.drawPolygon (xPoints, yPoints, 3);
	    c.fillPolygon (xPoints, yPoints, 3);
	}

	public static void Heartdraw ()
	{
	    // Left bump
	    c.drawOval (xCoord - (widthShape / 2), yCoord - (heightShape / 2), (widthShape / 2), (heightShape / 2));
	    c.fillOval (xCoord - (widthShape / 2), yCoord - (heightShape / 2), (widthShape / 2), (heightShape / 2));

	    // Right bump
	    c.drawOval (xCoord, yCoord - (heightShape / 2), (widthShape / 2), (heightShape / 2));
	    c.fillOval (xCoord, yCoord - (heightShape / 2), (widthShape / 2), (heightShape / 2));

	    // Flipped triangle for bottom section of heart
	    int[] xPoints = { (width / 2) - (widthShape / 2), (width / 2), (width / 2) + (widthShape / 2) };
	    int[] yPoints = { (height / 2) - (heightShape / 4), (height / 2) + (heightShape / 2), (height / 2) - (heightShape / 4) };
	    c.drawPolygon (xPoints, yPoints, 3);
	    c.fillPolygon (xPoints, yPoints, 3);
	}

	public static void HeartdrawRight ()
	{
	    // Left bump
	    c.drawOval ((xCoord - (widthShape / 2)) + padding, yCoord - (heightShape / 2), (widthShape / 2), (heightShape / 2));
	    c.fillOval ((xCoord - (widthShape / 2)) + padding, yCoord - (heightShape / 2), (widthShape / 2), (heightShape / 2));

	    // Right bump
	    c.drawOval (xCoord + padding, yCoord - (heightShape / 2), (widthShape / 2), (heightShape / 2));
	    c.fillOval (xCoord + padding, yCoord - (heightShape / 2), (widthShape / 2), (heightShape / 2));

	    // Flipped triangle for bottom section of heart
	    int[] xPoints = { ((width / 2) - (widthShape / 2)) + padding, (width / 2) + padding, ((width / 2) + (widthShape / 2)) + padding};
	    int[] yPoints = { (height / 2) - (heightShape / 4), (height / 2) + (heightShape / 2), (height / 2) - (heightShape / 4) };
	    c.drawPolygon (xPoints, yPoints, 3);
	    c.fillPolygon (xPoints, yPoints, 3);
	}
    }
