package polimi_2018_pag45;

import java.util.Scanner;

public class Pag45 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter letters or digits. When you are done enter #: ");
		int count = 0;
		int sum = 0;
		char c = in.next().charAt(0);
		while (c != '#') {
			if ((int)c > 47 && (int)c < 58) {
				sum += (int)c - 48;
				count++;
			}
			c = in.next().charAt(0);
		}
		in.close();
		if (count > 0) System.out.println("The mean of numbers entered is: " + ((double) sum/count));
		else System.out.println("No number entered");
	}

}
