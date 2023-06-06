package polimi_2018_pag36;

import java.util.Scanner;

public class Pag36 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int q = in.nextInt();
		in.close();
		int sum = 0;
		int n = 0;
		while(sum < q) {
			n++;
			sum += n;
		}
		if (sum == q) System.out.println(q + " is the sum of all integer numbers until " + n);
		else System.out.println(q + " is not a triangular number");
	}

}
