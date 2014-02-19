package shapes;
import java.awt.*;

    // Triangle class, containing draw methods for left, middle and right locations
    public class Triangle extends Shapes
    {

	public static void TriangledrawLeft ()
	{
	    int[] xPoints = { ((width / 2) - (widthShape / 2)) - padding, (width / 2) - padding, ((width / 2) + (widthShape / 2)) - padding};
	    int[] yPoints = { (height / 2) + (heightShape / 2), (height / 2) - (heightShape / 2), (height / 2) + (heightShape / 2) };
	    c.drawPolygon (xPoints, yPoints, 3);
	    c.fillPolygon (xPoints, yPoints, 3);
	}

	public static void Triangledraw ()
	{
	    int[] xPoints = { (width / 2) - (widthShape / 2), (width / 2), (width / 2) + (widthShape / 2) };
	    int[] yPoints = { (height / 2) + (heightShape / 2), (height / 2) - (heightShape / 2), (height / 2) + (heightShape / 2) };
	    c.drawPolygon (xPoints, yPoints, 3);
	    c.fillPolygon (xPoints, yPoints, 3);
	}

	public static void TriangledrawRight ()
	{
	    int[] xPoints = { ((width / 2) - (widthShape / 2)) + padding, (width / 2) + padding, ((width / 2) + (widthShape / 2)) + padding};
	    int[] yPoints = { (height / 2) + (heightShape / 2), (height / 2) - (heightShape / 2), (height / 2) + (heightShape / 2) };
	    c.drawPolygon (xPoints, yPoints, 3);
	    c.fillPolygon (xPoints, yPoints, 3);
	}

    }
