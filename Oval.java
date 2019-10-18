/**
 * A <code>Oval</code> object represents a Oval with
 * a width, height, color, (x,y) position, and boolean filled
 * @author JosephSalerno
 * @author BrendanOlski
 * @author MitchellThomas
 * Class: Oval.java
 * Project: 3
 */
public class Oval extends RoundShape{
	
	
	//class variables
	public static final String DEFAULT_COLOR = "Black";
	public static final int DEFAULT_POSITION = 0;
	public static final int DEFAULT_RADIUS_W = 1;
	public static final int DEFAULT_RADIUS_H = 2;
	public static final boolean DEFAULT_FILL = false;
	
	//instance variables
	private int radiusWidth;
	private int radiusHeight;

	/**
	 * Constructor to create a Oval given a width, height, color, position x, y, and fill.
	 * @param radiusWidth - integer radius width for the Oval
	 * @param radiusHeight - integer radius height for the Oval
	 * @param color - A string representing the color of the shape
	 * @param x - the x coordinate of the shape
	 * @param y - the y coordinate of the shape
	 * @param filled - boolean representing if the shape is filled or not
	 *
	 */
	public Oval(int radiusWidth, int radiusHeight, String color, int x, int y, boolean filled)
	{
		this.radiusWidth = radiusWidth;
		this.radiusHeight = radiusHeight;
	    this.color = color;
	    this.x = x;
	    this.y = y;
	    this.filled = filled;
	}
	
	/**
	 * Constructor to create a Oval no givens, only DEFAULTS
	 */
	public Oval() {
		this(DEFAULT_RADIUS_W, DEFAULT_RADIUS_H, DEFAULT_COLOR, DEFAULT_POSITION, DEFAULT_POSITION, DEFAULT_FILL);
	   }
	
	/**
	 * Returns the integer width of the Oval
	 * @return width of the Oval
	 */
	public int getWidth()
	{
		return radiusWidth;
	}
	
	/**
	 * Returns the integer height of the Oval
	 * @return height of the Oval
	 */
	public int getHeight()
	{
		return radiusHeight;
	}
	
	/**
	 * Sets width of the Oval to a new one
	 * @param newWidth - new width of the Oval
	 */
	public void setWidth(int newWidth)
	{
		this.radiusWidth = newWidth;
	}
	
	/**
	 * Sets height of the Oval to a new one
	 * @param newHeight - new height of the Oval
	 */
	public void setHeight(int newHeight)
	{
		this.radiusHeight = newHeight;
	}
	
	/**
	 * Sets x position of the Oval to a new one
	 * @param newX - new x position of the Oval
	 */
	public void setX(int newX)
	{
		this.x = newX;
	}
	
	/**
	 * Sets y of the Oval to a new one
	 * @param newY - new y position of the Oval
	 */
	public void setY(int newY)
	{
		this.y = newY;
	}

	/**
	 * Returns the string representation of the Oval
	 * @return the Oval's string representation
	 */
	public String toString() {
	      String str = "===Oval===\n";
	      str += "Radius (Width): " + radiusWidth + "\n";
	      str += "Radius (Height): " + radiusHeight + "\n";
	      str += "Position: " + x + "," + y + "\n";
	      str += "Color: " + color + "\n";
	      str += "Filled: " + filled;
	      str += "\n==========\n";
	      
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
        	} else if (! (other instanceof Oval)) {
            		return false;
        	} else {
            		Oval o2 = (Oval) other;
            		return (this.filled == o2.filled && this.color == o2.color && this.radiusHeight == o2.radiusHeight && this.radiusWidth == o2.radiusWidth && this.x == o2.x && this.y == o2.y);
        	}
    	}
	      
	
}
