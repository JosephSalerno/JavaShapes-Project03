public class Circle extends Shape{
	
	
	//class variable
	public static final String DEFAULT_COLOR = "Black";
	public static final int DEFAULT_POSITION = 0;
	public static final double DEFAULT_RADIUS = 1.0;
	
	//instance variables
	private double radius;
	private String color;
	private int x;
	private int y;
	boolean filled;

	
	public Circle(double radius, String color, int x, int y)
	{
		this.radius = radius;
	    this.color = color;
	    this.x = x;
	    this.y = y;
	}
	public Circle() {
		this(DEFAULT_RADIUS, DEFAULT_COLOR, DEFAULT_POSITION, DEFAULT_POSITION);
	   }
	
	public String toString() {
	      String str = "===Circle===";
	      str += "Radius: " + radius + "\n";
	      str += "Position: " + x + "," + y + "\n";
	      str += "Color: " + color + "\n";
	      str += "Filled: " + filled;
	      str += "\n============";
	      
	      return str;
	   }
	   
	   public int compareTo(Circle other) {
	      if (this.radius == other.radius) {
	         return 0;
	      } else if (this.radius < other.radius) {
	         return -1;
	      } else {
	         return 1;
	      }
	      
	
}
}
