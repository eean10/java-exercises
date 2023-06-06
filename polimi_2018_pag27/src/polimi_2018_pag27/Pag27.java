package polimi_2018_pag27;

import java.util.Scanner;

public class Pag27 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0;
		System.out.println("Enter characters. When you are done enter #");
		char c = in.next().charAt(0);
		while (c != '#') {
			if ((int) c >= 97 && (int) c <= 122) count++;
			c = in.next().charAt(0);
		}
		in.close();
		System.out.println("Number of lowercase letters: " + count);

	}

}
