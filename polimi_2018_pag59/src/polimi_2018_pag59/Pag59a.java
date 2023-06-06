package polimi_2018_pag59;

import java.util.*;

public class Pag59a {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		int n = in.nextInt();
		in.close();
		
		List<Integer> list = new ArrayList<>();
		int firstNumber = 0;
		int secondNumber = 0;
		for (firstNumber = 0; firstNumber <= (int)Math.sqrt(n/2);) {
			firstNumber++;
			int temp = n - firstNumber*firstNumber;
			secondNumber = (int)Math.sqrt(temp);
			if (secondNumber*secondNumber == temp && secondNumber != 0) {
				if(!list.contains(firstNumber)) {
					list.add(firstNumber);
					list.add(secondNumber);
				}
			}
		}
		
		if (list.size() > 0) {
			for(int i = 0; i < list.size(); i += 2) {
				firstNumber = list.get(i);
				secondNumber = list.get(i+1);
				System.out.println(n + " ==> " + n + " = "
								+ (firstNumber*firstNumber) + " + " + (secondNumber*secondNumber) 
									+ " = " + firstNumber + "^2 + " + secondNumber + "^2"); 
			}
		}
		else System.out.println("Nope");
	}

}
