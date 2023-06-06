import java.util.Random;

public class Integer3 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int[] randomNumbers = new int[10];
		int lowerbound = 6;
		int upperbound = 10 + 1 - lowerbound;
		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = rand.nextInt(upperbound) + lowerbound;
			System.out.println(randomNumbers[i]);
		}
		
	}

}
