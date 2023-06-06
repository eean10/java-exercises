package polimi_2018_pag31;

import java.util.*;

public class Pag31 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		int number = in.nextInt();
		in.close();
		if (number == 0) System.out.println("0 is divisible by any number (except 0) infinite times");
		else {
			TreeSet<Integer> set = new TreeSet<>();
			set.add(1);
			int numberCopy = number;
			for (int divisor = 2; divisor <= numberCopy; divisor ++) {
				if (numberCopy % divisor == 0) {
					set.add(divisor);
					numberCopy /= divisor;
					divisor--;
				}
			}
			System.out.println("Prime divisors of " + number + " are:");
			System.out.println(set.toString());
		}
	}
}
