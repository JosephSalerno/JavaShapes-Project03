
/**
 * A <code>Square</code> object represents a Square with
 * a width, color, (x,y) positions, and boolean filled
 * @author JosephSalerno
 * @author BrendanOlski
 * @author MitchellThomas
 * Class: Square.java
 * Project: 3
 */

public class Square extends StraightLineShape{
	
	
	//class variables
	public static final String DEFAULT_COLOR = "Black";
	public static final int DEFAULT_POSITION = 0;
	public static final int DEFAULT_WIDTH= 1;
	public static final boolean DEFAULT_FILL = false;
	
	//instance variables
	private int width;
	private String color;
	private int x;
	private int y;
	boolean filled;
	private int[] xCoords = new int[4];
	private int[] yCoords = new int[4];
	
	
	/**
	 * Constructor to create a Square given a width, color, fill, and position x and y.
	 * @param width - integer width for the sides of the square
	 * @param color - A string representing the color of the shape
	 * @param x - the x-coordinate of the shape
	 * @param y - the y-coordinate of the shape
	 * @param filled - boolean representing if the shape is filled or not
	 *
	 */
	public Square(int width, String color, int x, int y, boolean filled)
	{
		super("Square");
		
		this.width = width;
	    this.color = color;
	    this.x = x;
	    this.y = y;
		this.filled = filled;

		xCoords[0] = x;
		xCoords[1] = x + width;
		xCoords[2] = x + width;
		xCoords[3] = x;
		
		yCoords[0] = y;
		yCoords[1] = y;
		yCoords[2] = y + width;
		yCoords[3] = y + width;
	}
	
	/**
	 * Constructor to create a Square with no parameters 
	 * and just the DEFAULT values given by the program.
	 */
	public Square() {
		this(DEFAULT_WIDTH, DEFAULT_COLOR, DEFAULT_POSITION, DEFAULT_POSITION, DEFAULT_FILL);
		xCoords[0] = DEFAULT_POSITION;
		xCoords[1] = DEFAULT_POSITION + DEFAULT_WIDTH;
		xCoords[2] = DEFAULT_POSITION + DEFAULT_WIDTH;
		xCoords[3] = DEFAULT_POSITION;
		
		yCoords[0] = DEFAULT_POSITION;
		yCoords[1] = DEFAULT_POSITION;
		yCoords[2] = DEFAULT_POSITION + DEFAULT_WIDTH;
		yCoords[3] = DEFAULT_POSITION + DEFAULT_WIDTH;
	   }
	
	/**
	 * Returns the integer width of the Square
	 * @return width of the Square
	 */
	public int getWidth()
	{
		return width;
	}
	
	/**
	 * Returns the string color of the Square
	 * @return color of the Square
	 */
	public String getColor()
	{
		return color;
	}
	
	/**
	 * Returns the x position of the Square
	 * @return x position integer
	 */
	public int getX()
	{
		return x;
	}
	
	/**
	 * Returns the y position of the Square
	 * @return y position integer
	 */
	public int getY()
	{
		return y;
	}
	
	/**
	 * Sets the width to a new value
	 * @param newWidth - new width value of the Square
	 */
	public void setWidth(int newWidth)
	{
		this.width = newWidth;
	}
	
	/**
	 * Sets the Square color to a new color
	 * @param newColor - new color string of the Square
	 */
	public void setColor(String newColor)
	{
		this.color = newColor;
	}
	
	/**
	 * Sets the x position to a new value
	 * @param newX - new x position of the Square
	 */
	public void setX(int newX)
	{
		this.x = newX;
	}
	
	/**
	 * Sets the y position to a new value
	 * @param newY - new y position of the Square
	 */
	public void setY(int newY)
	{
		this.y = newY;
	}

	/**
	 * Sets the boolean filled to true or false
	 * @param newFill - new filled boolean of the Square
	 */
	public void setFill(boolean newFill)
	{
		this.filled = newFill;
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
	 * Returns an int[] of the x coordinates of the Square
	 * @return an integer array with each x coordinate following one another
	 */
	public int[] getXCoordinates()
	{
		return xCoords;
	}
	
	/**
	 * Returns an int[] of the y coordinates of the Square
	 * @return an integer array with each y coordinate following one another
	 */
	public int[] getYCoordinates()
	{
		return yCoords;
	}

	/**
	 * Returns a double[] with the sides of the Square
	 * @return a double array with all 4 sides of the Square
	 */
	public double[] getSides()
	{
		double[] sides = new double[4];
		sides[0] = sides[1] = sides[2] = sides[3] = width;
		return sides;
	}
	
	/**
	 * Returns the perimeter of the Square
	 * @return the perimeter as a integer
	 */
	public double getPerimeter()
	{
		return width*4;
	}
	
	/**
	 * Returns the string representation of the Square
	 * @return a string representing the Square
	 */
	public String toString() {
	      String str = "===Square===\n";
	      str += "Width: " + width + "\n";
	      str += "Coordinates: ";
	      
	      for(int index = 0; index<xCoords.length; ++index)
	      {
	    	str+= "(" + xCoords[index] + "," + yCoords[index] + "), ";
	      }
	      
	      str += "\nPosition: " + x + "," + y + "\n";
	      str += "Color: " + color + "\n";
	      str += "Filled: " + filled + "\n\n";
	      
	      double[] sides = getSides();
	      for(int x = 0; x<sides.length; x++)
	      {
	    	  str += "Side " + (x + 1) + ": " + sides[x] + "\n";
	      }
	      
	      str += "Perimeter: " + getPerimeter() + "\n";
	      str += "==========\n\n";
	      
	      return str;
	   }
	   
	/**
	 * Compares this Square to another one
	 * @param other - Square object for comparison
	 * @return integer 0 if equal, -1 if less than, 1 if greater than other Square
	 */
	public int compareTo(Square other) {
		if (this.width == other.width) {
	         return 0;
	      } else if (this.width < other.width) {
	         return -1;
	      } else {
	         return 1;
	      }
		      }
	   
	      }
	      
	

