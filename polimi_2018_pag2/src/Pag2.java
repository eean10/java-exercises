import java.util.Arrays;
import java.util.Scanner;

public class Pag2 {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		System.out.println("Insert 3 numbers:");
		int[] array = new int[3];
		 for (int i = 0; i < array.length; i++) array[i] = in.nextInt();
		 Arrays.sort(array);
		 System.out.println(Arrays.toString(array));
		 in.close();
	}

}
