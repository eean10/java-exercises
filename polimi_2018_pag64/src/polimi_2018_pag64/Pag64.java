package polimi_2018_pag64;

import java.util.Scanner;

public class Pag64 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a positive integer number: ");
		int numberToCheck = in.nextInt();
		in.close();
		int previous1 = 1;
		int previous2 = 1;
		int previous3 = 1;
		int current = previous3 + previous2;
		while (current < numberToCheck) {
			previous3 = previous2;
			previous2 = previous1;
			previous1 = current;
			current = previous2 + previous3;
		}
		if (current == numberToCheck) System.out.println(numberToCheck + " is in the Padovan succession");
		else System.out.println("Nope");
	}

}
