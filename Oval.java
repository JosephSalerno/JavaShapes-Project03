public class Oval{
	
	
	//class variable
	public static final String DEFAULT_COLOR = "Black";
	public static final int DEFAULT_POSITION = 0;
	public static final double DEFAULT_RADIUS_W = 1.0;
	public static final double DEFAULT_RADIUS_H = 1.5;
	
	//instance variables
	private double radiusWidth;
	private double radiusHeight;
	private String color;
	private int x;
	private int y;
	boolean filled;

	
	public Oval(double radiusWidth, double radiusHeight, String color, int x, int y)
	{
		this.radiusWidth = radiusWidth;
		this.radiusHeight = radiusHeight;
	    this.color = color;
	    this.x = x;
	    this.y = y;
	}
	public Oval() {
		this(DEFAULT_RADIUS_W, DEFAULT_RADIUS_H, DEFAULT_COLOR, DEFAULT_POSITION, DEFAULT_POSITION);
	   }
	
	public String toString() {
	      String str = "===Oval===";
	      str += "Radius (Width): " + radiusWidth + "\n";
	      str += "Radius (Height): " + radiusHeight + "\n";
	      str += "Position: " + x + "," + y + "\n";
	      str += "Color: " + color + "\n";
	      str += "Filled: " + filled;
	      str += "\n==========";
	      
	      return str;
	   }
	   
	   public int compareTo(Circle other) {
	      return 2;
	      }
	      
	
}
}