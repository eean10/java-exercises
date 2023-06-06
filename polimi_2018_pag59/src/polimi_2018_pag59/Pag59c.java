package polimi_2018_pag59;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pag59c {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		int n = in.nextInt();
		in.close();
		
		List<Integer> decompositions = new ArrayList<>();
		int firstNumber = 0;
		int secondNumber = 0;
		int thirdNumber = 0;
		for (firstNumber = 0; firstNumber <= (int)Math.sqrt(n/3);) {
			firstNumber++;
			int firstRest = n - firstNumber*firstNumber;
			for (secondNumber = firstNumber; secondNumber <= (int)Math.sqrt(firstRest/2); secondNumber++) {
				int secondRest = firstRest - secondNumber*secondNumber;
				thirdNumber = (int)Math.sqrt(secondRest);
				if (thirdNumber*thirdNumber == secondRest && thirdNumber != 0) {
					if(!decompositions.contains(firstNumber)) {
						decompositions.add(firstNumber);
						decompositions.add(secondNumber);
						decompositions.add(thirdNumber);
					}
				}
			}
		}
		if (decompositions.size() > 0) {
			for(int i = 0; i < decompositions.size(); i += 3) {
				firstNumber = decompositions.get(i);
				secondNumber = decompositions.get(i+1);
				thirdNumber = decompositions.get(i+2);		
				System.out.println(n + " ==> " + n + " = " + 
					(firstNumber*firstNumber) + " + " + (secondNumber*secondNumber) + " + " + (thirdNumber*thirdNumber)  
					  + " = " + firstNumber + "^2 + " + 		secondNumber + 		"^2 + " + thirdNumber + "^2"); 
			}
		}
		else System.out.println("Nope");
	}
}
	
