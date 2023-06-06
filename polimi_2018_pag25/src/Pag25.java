import java.util.Scanner;

public class Pag25 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0;
		System.out.println("Enter characters. When you are done enter #");
		char c = in.next().charAt(0);
		while (c != '#') {
			if (c == 'a' ||
				c == 'e' ||
				c == 'i' ||
				c == 'o' ||
				c == 'u' ) count++;
			c = in.next().charAt(0);
		}
		in.close();
		System.out.println("Number of lowercase vowels: " + count);
	}
}
