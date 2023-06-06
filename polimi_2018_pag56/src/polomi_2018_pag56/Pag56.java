package polomi_2018_pag56;

public class Pag56 {
	
	public static int numberOfDivisors(int n) {
		int divisors = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) divisors++; 
		}
		return divisors;
	}
	
	public static void main(String[] args) {
		System.out.println("Higly composite numbers");
		int number = 0;
		int divisors = 0;
		int previousDivisors = divisors;
		for (int i = 0; i < 20; i++) {
			boolean foundNumber = false;
			while(!foundNumber) {
				number++;
				divisors = numberOfDivisors(number);
				if (divisors > previousDivisors) {
					System.out.println(number);
					previousDivisors = divisors;
					foundNumber = true;
				}	
			}
		}
	}

}
