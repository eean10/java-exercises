package polimi_2018_pag38;

import java.util.Scanner;

public class Pag38 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		int q = in.nextInt();
		in.close();
		String bit = "";
		if (q == 0) bit = "0";
		int qCopy = q;
		int maxPower = 0;
		while((int)Math.pow(2, maxPower) <= q) maxPower++;
		maxPower--;
		for (int power = maxPower; power >= 0; power--) {
			if (qCopy >= (int)Math.pow(2, power)) {
				qCopy -= (int)Math.pow(2, power);
				bit += "1";
			}
			else bit += "0";
		}
		System.out.println("Decimal system: " + q);
		System.out.println("Binary system: " + bit);
		System.out.println("Minimum number of bits: " + bit.length());
		

	}

}
