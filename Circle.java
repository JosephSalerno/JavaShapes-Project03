/**
 * A <code>Circle</code> object represents a Circle with
 * a radius, color, (x,y) position, and boolean filled
 * @author JosephSalerno
 * @author BrendanOlski
 * @author MitchellThomas
 * Class: Circle.java
 * Project: 3
 */

public class Circle extends RoundShape{
	
	
	//class variables
	public static final String DEFAULT_COLOR = "Black";
	public static final int DEFAULT_POSITION = 0;
	public static final int DEFAULT_RADIUS = 1;
	public static final boolean DEFAULT_FILL = false;
	
	//instance variables
	private int radius;
	private String color;
	private int x;
	private int y;
	private boolean filled;

	
	/**
	 * Constructor to create a Circle given a radius, color, position x, y, and fill.
	 * @param radius - integer radius for the Circle
	 * @param color - A string representing the color of the shape
	 * @param x - the x coordinate of the shape
	 * @param y - the y coordinate of the shape
	 * @param filled - boolean representing if the shape is filled or not
	 *
	 */
	public Circle(int radius, String color, int x, int y, boolean filled)
	{
		this.radius = radius;
	    this.color = color;
	    this.x = x;
	    this.y = y;
	    this.filled = filled;
	}
	
	/**
	 * Constructor to create a Circle with no givens, only DEFAULTS
	 */
	public Circle() {
		this(DEFAULT_RADIUS, DEFAULT_COLOR, DEFAULT_POSITION, DEFAULT_POSITION, DEFAULT_FILL);
	   }
	
	/**
	 * Returns the integer radius of the Circle
	 * @return radius of the Circle
	 */
	public int getRadius()
	{
		return radius;
	}
	
	/**
	 * Returns the string color of the Circle
	 * @return color of the Circle
	 */
	public String getColor()
	{
		return color;
	}
	
	/**
	 * Returns the x position of the Circle
	 * @return x position integer
	 */
	public int getX()
	{
		return x;
	}
	
	/**
	 * Returns the y position of the Circle
	 * @return y position integer
	 */
	public int getY()
	{
		return y;
	}
	
	/**
	 * Sets the radius to a new value
	 * @param newRadius - new radius value of the Circle
	 */
	public void setRadius(int newRadius)
	{
		this.radius = newRadius;
	}
	
	/**
	 * Sets the Circle color to a new color
	 * @param newColor - new color string of the Circle
	 */
	public void setColor(String newColor)
	{
		this.color = newColor;
	}
	
	/**
	 * Sets the x position to a new value
	 * @param newX - new x position of the Circle
	 */
	public void setX(int newX)
	{
		this.x = newX;
	}
	
	/**
	 * Sets the y position to a new value
	 * @param newY - new y position of the Circle
	 */
	public void setY(int newY)
	{
		this.y = newY;
	}
	
	/**
	 * Checks if the shape is filled
	 * @return a boolean relating to whether or not the shape is filled
	 */
	public boolean isFilled()
	{
		return filled;
	}
	
	/**
	 * Sets filled to a new value
	 * @param newFill - new boolean value for filled
	 */
	public void setFill(boolean newFill)
	{
		this.filled = newFill;
	}
	
	/**
	 * Returns the circumference of the Circle
	 * @return double containing the circumference
	 */
	public double getCircumference()
	{
		return 2 * Math.PI * radius;
	}
	
	/**
	 * Returns a string representation of the Circle
	 * @return a string containing the Circle string representation
	 */
	public String toString() {
	      String str = "===Circle===\n";
	      str += "Radius: " + radius + "\n";
	      str += "Position: " + x + "," + y + "\n";
	      str += "Color: " + color + "\n";
	      str += "Filled: " + filled + "\n";
	      str += "Circumference: " + getCircumference() + "\n";
	      str += "\n============\n";
	      
	      return str;
	   }
	   
	/*
    	* Method to test the equality of two shapes.
    	* @param Object other - a different shape object 
    	* @return true/false depending on equality of shape objects
    	*/   
    	public boolean equalsTo(Object other) {
        	if (this == other) {
         	   return true;
        	} else if (! (other instanceof Circle)) {
        	   return false;
        	} else {
        	   Circle c2 = (Circle) other;
         	   return (this.radius == c2.radius && this.color == c2.color && this.filled == c2.filled && this.x == c2.x && this.y == c2.y);
        	}
    	}
}
