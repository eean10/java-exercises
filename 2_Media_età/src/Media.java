import java.util.Scanner;

//Calculate the mean of people's ages

public class Media {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Let's calculate the mean of people's ages.");
		System.out.print("How many people are involved in this calculation? ");
		int numberOfPeople = in.nextInt();
		int sum = 0;
		double media = 0.0;
		for (int i  = 0; i < numberOfPeople; i++) {
			System.out.print("Insert age of people #" + (i+1) + ": ");
			int age = in.nextInt();
			sum += age;
		}
		in.close();
		media = (double) sum/numberOfPeople;
		System.out.println("The mean is: " + media);
	}

}
