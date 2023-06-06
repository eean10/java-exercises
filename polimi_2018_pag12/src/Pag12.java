import java.util.Scanner;

public class Pag12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insert an integer number: ");
		int n = in.nextInt();
		int square = 0;
		for (int i = 0; i < n; i++) square += i + i + 1;
		System.out.println("Squared number: " + square);
		in.close();
	}

}
