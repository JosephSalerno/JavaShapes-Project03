/**
 * A <code>StraightLineShape</code> abstract class that creates methods
 * to work with each straight line shape in Project 3.
 * 
 * @author JosephSalerno
 * @author BrendanOlski
 * @author MitchellThomas 
 * Class: StraightLineShape.java 
 * Project: 3
 */

public abstract class StraightLineShape extends AllShapes{

    /**
	 * Returns the perimeter of the Shape
	 * @return the perimeter as a double
	 */
    public abstract double getPerimeter();

    /**
	 * Returns the int[] of xCoords of the Shape
	 * @return integer array containing the x coordinates
	 */
    public abstract int[] getXCoordinates();

    /**
	 * Returns the int[] of yCoords of the Shape
	 * @return integer array containing the y coordinates
	 */
    public abstract int[] getYCoordinates();
  }