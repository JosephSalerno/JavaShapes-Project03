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
	private String color;
	private int x;
	private int y;
	boolean filled;

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
	 * Returns the string color of the Oval
	 * @return color of the Oval
	 */
	public String getColor()
	{
		return color;
	}
	
	/**
	 * Returns the x position of the Oval
	 * @return x position of the Oval
	 */
	public int getX()
	{
		return x;
	}
	
	/**
	 * Returns the y position of the Oval
	 * @return y position of the Oval
	 */
	public int getY()
	{
		return y;
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
	 * Sets color of the Oval to a new one
	 * @param newColor - new color of the Oval
	 */
	public void setColor(String newColor)
	{
		this.color = newColor;
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
	 * Returns a boolean showing if the shape is filled
	 * @return boolean pertaining to whether or not the shape is filled
	 */
	public boolean isFilled()
	{
		return filled;
	}
	
	/**
	 * Sets the boolean filled to true or false
	 * @param newFill - new filled boolean of the Shape
	 */
	public void setFIll(boolean newFill)
	{
		this.filled = newFill;
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
	   
	/**
	 * Compares this Oval to another one
	 * @param other - Oval object for comparison
	 * @return integer 0 if equal, -1 if less than, 1 if greater than other Oval
	 */
	   public int compareTo(Oval other) {
		   //Calculate areas
		   double oArea = this.radiusHeight * this.radiusWidth * Math.PI;
		   double oOtherArea = other.radiusHeight * other.radiusWidth * Math.PI;
		   
		   if (oArea == oOtherArea) {
		         return 0;
		      } else if (oArea < oOtherArea) {
		         return -1;
		      } else {
		         return 1;
		      }
	      }
	      
	
}
