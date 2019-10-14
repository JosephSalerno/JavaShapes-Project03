public class Oval{
	
	
	//class variable
	public static final String DEFAULT_COLOR = "Black";
	public static final int DEFAULT_POSITION = 0;
	public static final int DEFAULT_RADIUS_W = 1;
	public static final int DEFAULT_RADIUS_H = 2;
	
	//instance variables
	private int radiusWidth;
	private int radiusHeight;
	private String color;
	private int x;
	private int y;
	boolean filled;

	
	public Oval(int radiusWidth, int radiusHeight, String color, int x, int y)
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
	
	public int getWidth()
	{
		return radiusWidth;
	}
	
	public int getHeight()
	{
		return radiusHeight;
	}

	public String getColor()
	{
		return color;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void setWidth(int newWidth)
	{
		this.radiusWidth = newWidth;
	}
	
	public void setHeight(int newHeight)
	{
		this.radiusHeight = newHeight;
	}
	
	public void setColor(String newColor)
	{
		this.color = newColor;
	}
	
	public void setX(int newX)
	{
		this.x = newX;
	}
	
	public void setY(int newY)
	{
		this.y = newY;
	}
	
	public boolean isFilled()
	{
		return filled;
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
	   
	   public int compareTo(Oval other) {
		   if (this.radiusHeight == other.radiusHeight && this.radiusWidth == other.radiusWidth) {
		         return 0;
		      } else if ((this.radiusHeight + this.radiusWidth) < (other.radiusHeight + other.radiusWidth)) {
		         return -1;
		      } else {
		         return 1;
		      }
	      }
	      
	
}
