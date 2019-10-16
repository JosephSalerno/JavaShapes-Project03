
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
	
	public String toString() {
		String str = "===Rectangle===";
		str += "Rectangle Height: " + rectHeight + "\n";
		str += "Rectangle Width: " + rectWidth + "\n";
		str += "Position: " + x + " ," + y + "\n";
		str += "Color: " + color + "\n";
	    str += "Filled: " + filled;
	    str += "\n==========";
	    
	    return str;
	    
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
	
	
	
	

}

