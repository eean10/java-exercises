import java.util.Arrays;
import java.util.Random;

public class Double5 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		double[] randomNumbers = new double[5];
		double lowerbound = 5.0;
		double upperbound = 10.0 - lowerbound;
		
		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = rand.nextDouble() * upperbound + lowerbound;
			if (randomNumbers[i] == 10.0) i--;
		}
		Arrays.sort(randomNumbers);
		//System.out.println(Arrays.toString(randomNumbers));
		System.out.println(randomNumbers[randomNumbers.length/2]);

	}

}
