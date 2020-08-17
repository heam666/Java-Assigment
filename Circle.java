/*
 Q.4: Create the following class as stated:
A class called circle is designed as shown in the following class diagram. It contains:

� Two private instance variables: radius (of the type double) and color (of the type
String), with default value of 1.0 and "red", respectively.

� Two overloaded constructors - a default constructor with no argument, and a
constructor which takes a double argument for radius.

� Two public methods: getRadius() and getArea(), which return the radius and area of
this instance, respectively.                                                                                                                                                                                                                                                                                                                                                                                                                                        
 */
//----------------------##############-------------------

public class  Circle
{
	private double radius=1.0;
	private String color="red";
	Circle()
	{
		
	}
	Circle(double radius)
	{
		this.radius=radius;
	}
	public void getRadius()
	{
		System.out.println(radius);
	}
	public void getArea()
	{
		double area=3.14*radius*radius;
		System.out.println(area);
	}
	public static void main(String [] args)
	{
		Circle c1=new Circle();
		c1.getRadius();
		c1.getArea();
	}
}


