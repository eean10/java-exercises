import java.util.Scanner;

public class SwapValues {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Give me two integer numbers and I'll swap their values.");
		System.out.print("First number\nvalA = ");
		int valA = in.nextInt();
		System.out.print("Second number\nvalB =  ");
		int valB = in.nextInt();
		in.close();
		
		int temp = valA;
		valA = valB;
		valB = temp;
		
		System.out.println("Let's swap them!");
		System.out.println("valA = " + valA);
		System.out.println("valB = " + valB);
	}
}
