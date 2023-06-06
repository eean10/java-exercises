import java.util.Scanner;

public class Pag15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insert an integer number: ");
		int n = in.nextInt();
		int square = 0;
		int cube = 0;
		for (int i = 0; i < n; i++) square += i + i + 1;
		for (int i = 0; i < n; i++) cube += square;
		System.out.println("Cubed number: " + cube);
		
		in.close();
	}

}
