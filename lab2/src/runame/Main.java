package runame;
import java.util.Scanner;


import shape.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius of circle");
		double radius=sc.nextDouble();
		Circle c1 = new Circle(radius);
		System.out.println("Area of the circle = " + c1.calcArea());
		System.out.println("enter the height of triangle");
		int height=sc.nextInt();
		System.out.println("enter the base of triangle");
		int base=sc.nextInt();
		Triangle t1 = new Triangle(height,base);
		System.out.println("Area of the Triangle = " + t1.calcArea());
		
		System.out.println("enter the side length of square");
		int length=sc.nextInt();

		Square s1 = new Square(length);
		s1.calcArea();
		
	}

}
