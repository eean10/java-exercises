package polimi_2018_pag61;

import java.util.Scanner;

public class Pag61 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter integers number. Enter 0 when you are done:");
		int previousNumber;
		int currentNumber = in.nextInt();
		int currentLength = 1;
		int maxLength = 1;
		while (currentNumber != 0) {
			previousNumber = currentNumber;
			currentNumber = in.nextInt();
			
			if (currentNumber > previousNumber) currentLength++;
			else currentLength = 1;
			
			if (currentLength > maxLength) maxLength = currentLength;
		}
		in.close();
		System.out.println("The max length of subsequence of increasing numbers is: " + maxLength);

	}

}
