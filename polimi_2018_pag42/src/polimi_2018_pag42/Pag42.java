package polimi_2018_pag42;

import java.util.Scanner;

public class Pag42 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two letters: ");
		char start = in.nextLine().toUpperCase().charAt(0);
		char end = in.nextLine().toUpperCase().charAt(0);
		in.close();
		for (int i = Math.min((int)start, (int)end) ; i <= Math.max((int)start, (int)end); i++)
			System.out.print((char)i);
	}

}
