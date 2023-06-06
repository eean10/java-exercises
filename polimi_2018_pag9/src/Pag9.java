import java.util.Scanner;
public class Pag9 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Insert an integer number: ");
		int n = in.nextInt();
		System.out.println("Insert " + n + " integer numbers: ");
		int max = in.nextInt();
		int position = 1;
		for (int i = 2; i <= n; i++) {
			int temp = in.nextInt();
			if (temp > max) {
				max = temp;
				position = i;
			}
		}
		System.out.println("The maximum is " + max + " and it is in place " + position);
		in.close();
	}

}
