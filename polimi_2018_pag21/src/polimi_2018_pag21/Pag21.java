package polimi_2018_pag21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pag21 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter num: ");
		int num = in.nextInt();
		System.out.println("Enter integer numbers. When you are done enter 0.");
		int number = in.nextInt();
		List<Integer> list = new ArrayList<>();
		while(number != 0) {
			if (number % num == 0 && number % 2 == 0) list.add(number);
			number = in.nextInt();
		}
		in.close();
		System.out.println("Numbers that are even and divisible by " + num);
		System.out.println(list.toString());
	}
}
