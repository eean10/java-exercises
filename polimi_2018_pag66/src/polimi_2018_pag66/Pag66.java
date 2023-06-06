package polimi_2018_pag66;

import java.util.Scanner;

public class Pag66 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter coefficients of quadratic equation in the form ax^2 + bx + c = 0");
		System.out.print("a: ");
		double a = in.nextDouble();
		System.out.print("b: ");
		double b = in.nextDouble();
		System.out.print("c: ");
		double c = in.nextDouble();
		in.close();
		
		if (a == 0 && b == 0 && c == 0) System.out.println("Nope");
		else if (a == 0 && b == 0) System.out.println("x can be any real number");
		else if (a == 0) System.out.println("x = " + (-c/b));
		else if (b == 0) {
			if (-c/a > 0) System.out.println("x = " + Math.sqrt(-c/a));
			else System.out.println("No solutions");
		}
		else {
			double delta = b*b - 4*a*c;
			if (delta < 0) System.out.println("No solutions");
			else {
				double x1 = (-b + Math.sqrt(delta))/2;
				double x2 = (-b - Math.sqrt(delta))/2;
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
	}
}
