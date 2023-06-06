import java.util.Scanner;

public class Pag19 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = 0;
		int count = 0;
		System.out.println("Insert integer numbers. When you are done, insert -1");
		while(number != -1) {
			number = in.nextInt();
			if (number % 3 == 0) count ++;
			else if (number % 5 == 0) count ++;
			else if (number % 7 == 0) count ++;
		}
		in.close();
		System.out.println("There are " + count + " number(s) divisible by 3 or 5 or 7");
	}
}
