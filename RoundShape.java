/**
 * A <code>RoundShape</code> abstract class that creates methods
 * to work with each round shape in Project 3.
 * @author JosephSalerno
 * @author BrendanOlski
 * @author MitchellThomas
 * Class: RoundShape.java
 * Project: 3
 */

public abstract class RoundShape extends AllShapes{
  
  	protected int radius;

         /**
	 * Returns the integer width of the Oval
	 * @return width of the Oval
	 */
	public int getRadius()
	{
		return radius;
	}
	
	/**
	 * Sets width of the Oval to a new one
	 * @param newWidth - new width of the Oval
	 */
	public void setRadius(int newRadius)
	{
		this.radius = newRadius;
	}
  
  }
