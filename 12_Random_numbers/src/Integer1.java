import java.util.Random;

public class Integer1 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int upperboundInt = 100;
		int firstRandomNumber = rand.nextInt(upperboundInt);
		int secondRandomNumber = rand.nextInt(upperboundInt);
		System.out.println(firstRandomNumber);
		System.out.println(secondRandomNumber);
		System.out.println(Math.min(firstRandomNumber, secondRandomNumber));

	}

}
