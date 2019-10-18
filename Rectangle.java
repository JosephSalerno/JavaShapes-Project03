
public class Rectangle {

	// Class variable
	public static final String DEFAULT_COLOR = "Black";
	public static final int DEFAULT_RECT_WIDTH = 1;
	public static final int DEFAULT_RECT_HEIGHT = 2;
	public static final int DEFAULT_POSITION = 0;
	
	//instance variables
	private int[] xCoords;
	private int[] yCoords; 
	private int rectWidth;
	private int rectHeight;
	private int x;
	private int y;
	boolean filled;
	private String color;
	
	public Rectangle(String color, int x, int y, int rectWidth, int rectHeight) {  
		this.color = color;      
		this.x = x;      
		this.y = y;   
		this.rectWidth = rectWidth;
		this.rectHeight = rectHeight;
		
	}

	public Rectangle() {
		
		this(DEFAULT_COLOR, DEFAULT_POSITION, DEFAULT_POSITION, DEFAULT_RECT_WIDTH, DEFAULT_RECT_HEIGHT);
		
	}
	
	
	public int compareTo(Rectangle other) {
		return 0;	
	}
	
	
	public int getRectWidth() {
		return rectWidth;
	}
	
	
	public int getRectHeight() {
		return rectHeight;
	}
	
	
	public String getColor() {
		return color;
	}
	
	
	public int getX() {
		return x;
	}
	
	
	public int getY() {
		return y;
	}
	
	
	public void setWidth(int newRectWidth) {
		this.rectWidth = newRectWidth;
	}
	
	
	public void setHeight(int newRectHeight) {
		this.rectHeight = newRectHeight;
	}
	
	
	/**
	 * Sets the Rectangle color to a new color
	 * @param newColor - new color string of the Rectangle
	 */
	
	public void setColor(String newColor) {
		this.color = newColor;
	}
	
	
	/**
	 * Sets the x position to a new value
	 * @param newX - new x position of the Rectangle
	 */
	
	public void setX(int newX) {
		this.x = newX;
	}
	
	
	/**
	 * Sets the y position to a new value
	 * @param newY - new y position of the Rectangle
	 */
	
	public void setY(int newY) {
		this.y = newY;
	}
	
	
	public boolean isFilled() {
		return filled;
	}

	
	/**
	 * Returns an int[] of the coordinates of the Rectangle
	 * @return an integer array with each coordinate (in groups of two) following one another
	 */
	
	public int[] getCoordinates() {
		int[] coords = new int[8];
		coords[0] = x;
		coords[1] = y;
		coords[2] = x + rectWidth;
		coords[3] = y;
		coords[4] = x + rectWidth;
		coords[5] = y + rectHeight;
		coords[6] = x;
		coords[7] = y + rectHeight;
		return coords;
	}
	
	
	/**
	 * Returns a double[] with the sides of the Rectangle
	 * @return a double array with all 4 sides of the Rectangle
	 */
	
	
	public double[] getSides() {
		double[] sides = new double[4];
		sides[0] = sides[2] = rectWidth;
		sides[1] = sides[3] = rectHeight;
		return sides;
	}
	
	
	/**
	 * Returns the perimeter of the Square
	 * @return the perimeter as a integer
	 */
	
	public double getPerimeter() {
		return (rectHeight * 2) + (rectWidth * 2);
	}
	
	
	/**
	 * Compares this Rectangle to another one
	 * @param other - Rectangle object for comparison
	 * @return integer 0 if equal, -1 if less than, 1 if greater than other Rectangle
	 */
	
	public int compareTo(Rectangle other) {
		  double rArea = (this.rectHeight * this.rectWidth);
		  double rOtherArea = (other.getRectHeight() * other.getRectWidth());
		  if (rArea == rOtherArea) {
		         return 0;
		      } 
		  else if (rArea < rOtherArea) {
		         return -1;
		      } 
		  else {
		         return 1;
		  }
	}
	
	public String toString() {
		String str = "===Rectangle===";
		str += "Height: " + rectHeight + "\n";
		str += "Width: " + rectWidth + "\n";
		str += "Coordinates: " + "(" + coords[0] + "," + coords[1] + ") , (" +
		coords[2] + "," + coords[3] + ") , (" + coords[4] + "," + coords[5] + ") , (" 
		+ coords[6] + "," + coords[7] + ")" + "\n";
		str += "Position: " + x + "," + y + "\n";
		str += "Color: " + color + "\n";
	    str += "Filled: " + filled;
	    double[] sides = getSides();
	    for(int x = 0; x < 4; x++) {
	    	str += "Side " + (x + 1) + ": " + sides[x] + "\n";
	    }
	    str += "Perimeter: " + getPerimeter() + "\n";
	    str += "\n==========";
	    
	    return str;
	    
	}
	   
}

