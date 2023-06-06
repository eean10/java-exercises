import java.util.Arrays;
import java.util.Random;

public class Double4 {

	public static void main(String[] args) {
Random rand = new Random();
		
		double[] randomNumbers = new double[10];
		
		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = rand.nextDouble() * 100.0;
			if (randomNumbers[i] == 100.0) i--;
		}

		System.out.println(Arrays.toString(randomNumbers));

	}

}
