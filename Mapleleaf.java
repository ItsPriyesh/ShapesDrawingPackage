package shapes;
import java.awt.*;

    // MapleLeaf class, containing draw methods for left, middle and right locations
    public class Mapleleaf extends Shapes
    {

	public static void MapleleafdrawLeft ()
	{
	    c.drawMapleLeaf ((xCoord - widthShape / 2) - padding, yCoord - heightShape / 2, widthShape, heightShape);
	    c.fillMapleLeaf ((xCoord - widthShape / 2) - padding, yCoord - heightShape / 2, widthShape, heightShape);

	}

	public static void Mapleleafdraw ()
	{
	    c.drawMapleLeaf ((xCoord - widthShape / 2), yCoord - heightShape / 2, widthShape, heightShape);
	    c.fillMapleLeaf ((xCoord - widthShape / 2), yCoord - heightShape / 2, widthShape, heightShape);

	}

	public static void MapleleafdrawRight ()
	{
	    c.drawMapleLeaf ((xCoord - widthShape / 2) + padding, yCoord - heightShape / 2, widthShape, heightShape);
	    c.fillMapleLeaf ((xCoord - widthShape / 2) + padding, yCoord - heightShape / 2, widthShape, heightShape);

	}
    }
