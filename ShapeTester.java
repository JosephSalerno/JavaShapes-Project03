/**
 * <code>ShapeTester</code> tests each shape class and its
 * methods.
 * @author JosephSalerno
 * @author BrendanOlski
 * @author MitchellThomas
 * Class: ShapeTester.java
 * Project: 3
 */

public class ShapeTester {

	public static void main(String[] args) {
		
		//Circle testing
		Circle circle1 = new Circle();
		circle1.setRadius(5);
		circle1.setColor("Blue");
		circle1.setX(2);
		circle1.setY(3);
		circle1.setFill(true);

		Circle circle2 = new Circle(4,"red",8,10,true);

		System.out.println(circle1);
		System.out.println(circle2);

		//System.out.println("Comparing the size of shape1 to the size of shape2 (0=equal, -1=less than, 1=greater than): " + circle1.equalsTo(circle2) + "\n");

		//Oval testing
		Oval oval1 = new Oval();
		oval1.setWidth(5);
		oval1.setHeight(3);
		oval1.setColor("Blue");
		oval1.setX(2);
		oval1.setY(3);
		oval1.setFill(true);

		Oval oval2 = new Oval(5,2,"blue", 2,2, true);

		System.out.println(oval1);
		System.out.println(oval2);

		//System.out.println("Comparing the size of shape1 to the size of shape2 (0=equal, -1=less than, 1=greater than): " + oval1.equalsTo(oval2) + "\n");

		//Square testing
		Square square1 = new Square();
		square1.setWidth(5);
		square1.setColor("Blue");
		square1.setX(2);
		square1.setY(3);
		square1.setFill(true);

		Square square2 = new Square(5,"yellow", 2, 2, true);

		System.out.println(square1);
		System.out.println(square2);

		//System.out.println("Comparing the size of shape1 to the size of shape2 (0=equal, -1=less than, 1=greater than): " + square1.equalsTo(square2) + "\n");

		//Rectangle testing
		Rectangle rec1 = new Rectangle();
		rec1.setWidth(5);
		rec1.setHeight(3);
		rec1.setColor("Blue");
		rec1.setX(2);
		rec1.setY(3);
		rec1.setFill(true);


		Rectangle rec2 = new Rectangle("yellow", 2, 2, 10, 5, true);

		System.out.println(rec1);
		System.out.println(rec2);

		//System.out.println("Comparing the size of shape1 to the size of shape2 (0=equal, -1=less than, 1=greater than): " + rec1.equalsTo(rec2) + "\n");

		
		//Triangle testing
		Triangle triangle1 = new Triangle();
		triangle1.setBase(5);
		triangle1.setHeight(3);
		triangle1.setColor("Blue");
		triangle1.setX(2);
		triangle1.setY(3);
		triangle1.setFill(true);

		Triangle triangle2 = new Triangle(10,10,"purple", 0, 0, false);

		System.out.println(triangle1);
		System.out.println(triangle2);

		//System.out.println("Comparing the size of shape1 to the size of shape2 (0=equal, -1=less than, 1=greater than): " + triangle1.equalsTo(triangle2) + "\n");

		//Octagon testing

	}

}
