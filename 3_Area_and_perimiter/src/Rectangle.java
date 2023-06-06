import java.util.Scanner;

//Calculate area and perimeter of a rectangle

public class Rectangle {

	public static void main(String[] args) {
		double area;
		double perimeter;
		System.out.println("Let's calculate area and perimeter or a rectangle.");
		
		Scanner in = new Scanner(System.in);
		System.out.println("How long is the base? ");
		double base = in.nextDouble();
		System.out.println("How long is the height? ");
		double height = in.nextDouble();
		
		area = base * height;
		perimeter = (base + height) * 2.0;
		in.close();
		
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);

	}

}
