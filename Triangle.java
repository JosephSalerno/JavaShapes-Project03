
/**
 * A <code>Triangle</code> object represents a Triangle with
 * a base, height, color, (x,y) position, and boolean filled
 * @author JosephSalerno
 * @author BrendanOlski
 * @author MitchellThomas
 * Class: Triangle.java
 * Project: 3
 */

public class Triangle extends StraightLineShape{
	
	
	//class variables
	public static final String DEFAULT_COLOR = "Black";
	public static final int DEFAULT_POSITION = 0;
	public static final int DEFAULT_BASE= 1;
	public static final int DEFAULT_HEIGHT = 1;
	public static final boolean DEFAULT_FILL = false;
	
	//instance variables
	private int base;
	private int height;
	private String color;
	private int x;
	private int y;
	private boolean filled;
	private int[] xCoords = new int[3];
	private int[] yCoords = new int[3];

	
	
	/**
	 * Constructor to create a Triangle given a base, height, color, fill, and position x and y,
	 * additionally calculating the coordinate locations of the shape.
	 * @param base - integer length for the bottom side of the triangle
	 * @param height - integer height of the triangle
	 * @param color - A string representing the color of the shape
	 * @param x - the x-coordinate of the shape
	 * @param y - the y-coordinate of the shape
	 * @param filled - boolean representing if the shape is filled or not
	 *
	 */
	public Triangle (int base, int height, String color, int x, int y, boolean filled)
	{
		super("Triangle");
		this.base = base;
		this.height = height;
	    this.color = color;
	    this.x = x;
	    this.y = y;
	    this.filled = filled;
	    
	    this.calculateCoords();
	}
	
	/**
	 * Constructor to create a Triangle with no parameters 
	 * and just the DEFAULT values given by the program.
	 */
	public Triangle() {
		this(DEFAULT_BASE, DEFAULT_HEIGHT, DEFAULT_COLOR, DEFAULT_POSITION, DEFAULT_POSITION, DEFAULT_FILL );
		this.calculateCoords();
	   }
	
	public void calculateCoords()
	{
		xCoords[0] = (base/2)+x;
		xCoords[1] = (base+x);
		xCoords[2] = x;
		
		yCoords[0] = y;
		yCoords[1] = yCoords[2] = (height+y);
		
	}
	/**
	 * Returns the integer base of the triangle
	 * @return base of the triangle
	 */
	public int getBase()
	{
		return base;
	}
	
	/**
	 * Returns the integer height of the triangle
	 * @return height of the triangle
	 */
	public int getHeight()
	{
		return height;
	}

	/**
	 * Returns the string color of the triangle
	 * @return color of the triangle
	 */
	public String getColor()
	{
		return color;
	}
	
	/**
	 * Returns the x position of the triangle
	 * @return x position integer
	 */
	public int getX()
	{
		return x;
	}
	
	/**
	 * Returns the y position of the triangle
	 * @return y position integer
	 */
	public int getY()
	{
		return y;
	}
	
	/**
	 * Sets the base to a new value, updates coords
	 * @param newBase - new base value of the triangle
	 */
	public void setBase(int newBase)
	{
		this.base = newBase;
		this.calculateCoords();
	}
	
	/**
	 * Sets the height to a new value, updates coords
	 * @param newHeight - new height value of the triangle
	 */
	public void setHeight(int newHeight)
	{
		this.height = newHeight;
		this.calculateCoords();
	}
	
	/**
	 * Sets the triangle color to a new color
	 * @param newColor - new color string of the triangle
	 */
	public void setColor(String newColor)
	{
		this.color = newColor;
	}
	
	/**
	 * Sets the x position to a new value, updates coords
	 * @param newX - new x position of the triangle
	 */
	public void setX(int newX)
	{
		this.x = newX;
		this.calculateCoords();
	}
	
	/**
	 * Sets the y position to a new value, updates coords
	 * @param newY - new y position of the triangle
	 */
	public void setY(int newY)
	{
		this.y = newY;
		this.calculateCoords();
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
	 * Returns an int[] of the x coordinates of the triangle
	 * @return an integer array with x coordinates
	 */
	public int[] getXCoordinates()
	{
		return xCoords;
		
	}
	
	/**
	 * Returns an int[] of the y coordinates of the triangle
	 * @return an integer array with each y coordinate 
	 */
	public int[] getYCoordinates()
	{
		return yCoords;
	}

	/**
	 * Returns a double[] of the three outer sides of the triangle
	 * @return a double array with all 3 sides of the triangle
	 */
	public double[] getSides()
	{
		double hypotenuse = Math.sqrt((Math.pow(base/2,2) + Math.pow(height,2)));
		double[] sides = new double[3];
		sides[0] = sides[2] = hypotenuse;
		sides[1] = base;
		return sides;
	}
	
	/**
	 * Returns the perimeter of the triangle
	 * @return the perimeter as a double
	 */
	public double getPerimeter()
	{
		double[] sides = getSides();
		double perimeter = 0;
		for(int x = 0; x < sides.length; x++)
		{
			perimeter += sides[x];
		}
		return perimeter;
	}
	
	/**
	 * Returns the string representation of the triangle
	 * @return a string representing the triangle
	 */
	public String toString() {
	      String str = "===Triangle===\n";
	      str += "Base width: " + base + "\n";
	      str += "Height: " + height + "\n";
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
	      str += "\n==========\n";
	      
	      return str;
	   }
	   
	/**
	 * Compares this Triangle to another one
	 * @param other - Triangle object for comparison
	 * @return integer 0 if equal, -1 if less than, 1 if greater than other Triangle
	 */
	public int compareTo(Triangle other) {
		  double tArea = 0.5 * (base * height);
		  double tOtherArea = 0.5 * (other.getBase() * other.getHeight());
		  if (tArea == tOtherArea) {
		         return 0;
		      } else if (tArea < tOtherArea) {
		         return -1;
		      } else {
		         return 1;
		      }
		      }
	   
	   
	      }
	      
	

