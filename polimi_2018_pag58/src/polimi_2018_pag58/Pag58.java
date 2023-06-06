package polimi_2018_pag58;

import java.util.Scanner;

public class Pag58 {
	
	public static void main(String[] args) {
		System.out.println("Inserisci un numero");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) sum += i; 
		}
		if (n < sum) System.out.println("Abbondante");
		else if (n == sum) System.out.println("Perfetto");
		else System.out.println("Mancante");
	}

}
