package polimi_2018_pag59;

import java.util.Scanner;

public class Pag59 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		int n = in.nextInt();
		in.close();
		int firstNumber = 0;
		int secondNumber = 0;
		boolean isSumOfTwoSquares = false;
		for (firstNumber = 0; firstNumber <= (int)Math.sqrt(n/2) && !isSumOfTwoSquares;) {
			firstNumber++;
			int temp = n - firstNumber*firstNumber;
			secondNumber = (int)Math.sqrt(temp);
			if (secondNumber*secondNumber == temp && secondNumber != 0) isSumOfTwoSquares = true;	
		}
		
		if (isSumOfTwoSquares)
			System.out.println(n + " ==> " + n + " = "
								+ (firstNumber*firstNumber) + " + " + (secondNumber*secondNumber) 
				   					+ " = " + firstNumber + "^2 + " + secondNumber + "^2"); 
		else System.out.println("Nope");
	}
}
