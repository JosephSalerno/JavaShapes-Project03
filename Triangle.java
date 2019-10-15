public class Triangle{
	
	
	//class variable
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
	boolean filled;

	
	public Triangle(int base, int radiusHeight, String color, int x, int y, boolean filled)
	{
		this.base = base;
		this.height = radiusHeight;
	    this.color = color;
	    this.x = x;
	    this.y = y;
	    this.filled = filled;
	}
	public Triangle() {
		this(DEFAULT_BASE, DEFAULT_HEIGHT, DEFAULT_COLOR, DEFAULT_POSITION, DEFAULT_POSITION, DEFAULT_FILL );
	   }
	
	public int getBase()
	{
		return base;
	}
	
	public int getHeight()
	{
		return height;
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
	
	public void setBase(int newBase)
	{
		this.base = newBase;
	}
	
	public void setHeight(int newHeight)
	{
		this.height = newHeight;
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
	
	public String getCoordinates()
	{
		String str = "(" + (base/2 + x) + "," + y + "),";
		str += " (" + (base + x) + "," + (height + y) + "),";
		str += " (" + x + "," + (height + y) + ")";
		return str;
		
	}
	
	public double[] getSides()
	{
		double hypotenuse = Math.sqrt((Math.pow(base/2,2) + Math.pow(height,2)));
		double[] sides = new double[3];
		System.out.println(hypotenuse);
		sides[0] = sides[2] = hypotenuse;
		sides[1] = base;
		return sides;
	}
	
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
	public String toString() {
	      String str = "===Triangle===\n";
	      str += "Base width: " + base + "\n";
	      str += "Height: " + height + "\n";
	      str += "Coordinates: " + getCoordinates() + "\n";
	      str += "Position: " + x + "," + y + "\n";
	      str += "Color: " + color + "\n";
	      str += "Filled: " + filled + "\n\n";
	      double[] sides = getSides();
	      str += "Side 1: " + sides[0] + "\n";
	      str += "Side 2: " + sides[1] + "\n";
	      str += "Side 3: " + sides[2] + "\n";
	      str += "Perimeter: " + getPerimeter() + "\n";
	      str += "\n==========";
	      
	      return str;
	   }
	   
	   public int compareTo(Triangle other) {
		   return 2;
		      }
	   
	      }
	      
	

