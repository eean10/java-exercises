import java.util.Arrays;
import java.util.Random;

public class Double2 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		double[] randomNumbers = new double[5];
		
		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = rand.nextDouble();
			if (randomNumbers[i] == 1.0) i--;
		}
		
		double average = 0;
		for (double d : randomNumbers) average += d/randomNumbers.length;
		System.out.println(Arrays.toString(randomNumbers));
		System.out.println("The average of previous numbers is: " + average);
	}

}
