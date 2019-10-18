/**
 * A <code>AllShapes</code> abstract class that creates methods
 * to work with each shape in Project 3.
 * @author JosephSalerno
 * @author BrendanOlski
 * @author MitchellThomas
 * Class: AllShapes.java
 * Project: 3
 */

public abstract class AllShapes {
    
    /**
	 * Returns the color of the Shape
	 * @return String of the color of the Shape
	 */
    public abstract String getColor();

    /**
	 * Returns the x position of the Shape
	 * @return x position of the Shape
	 */
    public abstract int getX();

    /**
	 * Returns the y position of the Shape
	 * @return y position of the Shape
	 */
    public abstract int getY();

    /**
	 * Sets the x position to a new value, update coords
	 * @param newX - new x position of the Shape
	 */
    public abstract void setX(int newX);

    /**
	 * Sets the y position to a new value, update coords
	 * @param newY - new y position of the Shape
	 */
    public abstract void setY(int newY);

    /**
	 * Sets the Rectangle color to a new color
	 * @param newColor - new color string of the Shape
	 */
    public abstract void setColor(String newColor);

    /**
	 * Sets the fill to a new value
	 * @param newFill - new fill boolean of the Shape
	 */
    public abstract void setFill(boolean newFill);

    /**
	 * Returns a boolean showing the user whether this shape is filled or not
	 * @return boolean relating to whether or not the shape is filled
	 */
    public abstract boolean isFilled();


    public abstract int equalsTo(Object other);

    /**
	 * Returns the string representation of the Shape
	 * @return a string representing the Shape
	 */
    public abstract String toString();
}