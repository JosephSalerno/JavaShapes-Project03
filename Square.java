package shapes;

/*
 * A square class for drawing.
 * @author
 * @version 1.0
 * 
 */
public class Square implements Comparable<Square> {
   
   // Class variables
   public static final double DEFAULT_LENGTH = 1.0;
   public static final String DEFAULT_COLOR = "Black";
   public static final int DEFAULT_POSITION = 0;
   
   public static final String[] ALLOWED_COLORS = {"Black", "White", "Purple", "Blue", "Green"};
   
   // Instance variables
   private double length;
   private String color;
   private int x;
   private int y;
   
   /*
    * Constructor to create a Square given a length, color, and position x and y.
    * @param length - double length for the side of the square
    * @param color - A string representing the color of the square
    * @param x - the x-coordinate of the shape
    * @param y - the y-coordinate of the shape
    * @throws IllegalArgumentException if length is <= 0
    *
    */
   public Square(double length, String color, int x, int y) {
      if (length <= 0) {
         throw new IllegalArgumentException("Length must be positive.");
      }
      
      boolean foundColor = false;
      for (String c : ALLOWED_COLORS) {
         if (color.equals(c)) {
            foundColor = true;
            break;
         }
      }
      
      if (!foundColor) {
         throw new IllegalArgumentException("Bad color :(");
      }
      
      this.length = length;
      this.color = color;
      this.x = x;
      this.y = y;
   }
   
   public Square() {
      this(DEFAULT_LENGTH, DEFAULT_COLOR, DEFAULT_POSITION, DEFAULT_POSITION);
   }
   
   public String toString() {
      String str = "==Square==\n";
      str += "Width: " + length + "\n";
      str += "Coordinates: " + "\n";
      str += "Position: " + x + "," + y + "\n";
      str += "Filled: " + filled + "\n";
      str += "Color: " + color + "\n";
      str += "\n";
      
      return str;
   }
   
   public int compareTo(Square other) {
      if (this.length == other.length) {
         return 0;
      } else if (this.length < other.length) {
         return -1;
      } else {
         return 1;
      }
      
   }
}
