import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pag33 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		int number = in.nextInt();
		in.close();
		if (number == 0) System.out.println("0 is divisible by any number (except 0) infinite times");
		else {
			List<Integer> list = new ArrayList<>();
			list.add(1);
			int numberCopy = number;
			for (int divisor = 2; divisor <= numberCopy; divisor ++) {
				if (numberCopy % divisor == 0) {
					list.add(divisor);
					numberCopy /= divisor;
					divisor--;
				}
			}
			System.out.println("Factorization of " + number + ":");
			System.out.println(list.toString());
		}	
	}
}
