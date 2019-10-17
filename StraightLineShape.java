/**
 * A <code>StraightLineShape</code> abstract class that creates a shape object and
 * appropriate methods to work with each shape in Project 3.
 * 
 * @author JosephSalerno
 * @author BrendanOlski
 * @author MitchellThomas 
 * Class: StraightLineShape.java 
 * Project: 3
 */

public abstract class StraightLineShape{

    public StraightLineShape (String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }
    
    public String toString( ){
        return "Shape[id="+id+"]";
    }

    private String id;

    public abstract String getColor();
    public abstract int getX();
    public abstract int getY();
    public abstract void setX(int newX);
    public abstract void setY(int newY);
    public abstract void setColor(String newColor);
    public abstract void setFill(boolean newFill);
    public abstract boolean isFilled();

    public abstract double getPerimeter();
    public abstract int[] getXCoordinates();
    public abstract int[] getYCoordinates(); 
  }