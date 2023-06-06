

import java.util.Scanner;

public class Pag57 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] queen = new int[2];
		System.out.println("Enter position of the queen (1-8)");
		System.out.print("x: ");
		queen[0] = in.nextInt();
		System.out.print("y: ");
		queen[1] = in.nextInt();
		System.out.print("");
		int[] king = new int[2];
		System.out.println("Enter position of the king (1-8)");
		System.out.print("x: ");
		king[0] = in.nextInt();
		System.out.print("y: ");
		king[1] = in.nextInt();
		in.close();
		boolean checkmate = false;
		if (queen[0] == king[0] || queen[1] == king[1]) checkmate = true;
		else {
			for (int i = 0; i < 8 && !checkmate; i++) {
				if (queen[0] == king[0] + i &&
					queen[1] == king[1] + i) checkmate = true;
				else if (queen[0] == king[0] - i &&
						 queen[1] == king[1] - i) checkmate = true;
				else if (queen[0] == king[0] + i &&
						 queen[1] == king[1] - i) checkmate = true;
				else if (queen[0] == king[0] - i &&
						 queen[1] == king[1] + i) checkmate = true;
			}
		}
		if (checkmate) System.out.println("Checkmate");
		else System.out.println("Failed");
	}

}
