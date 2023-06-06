package polimi_2018_Pag47;

import java.util.Scanner;

public class Pag47 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		char c = in.next().charAt(0);
		int index = (int)c;
		System.out.print("Enter offset: ");
		int offset = sc.nextInt();
		if(index + offset > 90) offset += 6;
		if(index + offset > 122) offset -= 64;
		System.out.println((char)(index + offset));
		in.close();
		sc.close();
	}

}
