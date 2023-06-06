//make insert 30 times (one for each day of November)
//find the highest and lowest time

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class KmForFun {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		System.out.println("I find the minimum and maximum timimg."
						 + "\nInsert the path of the file where timings are stored: ");
		String filePath = in.nextLine();
		in.close();
		
		File timingsFile = new File(filePath);
		Scanner sc = new Scanner(timingsFile);
		int min = Integer.parseInt(sc.nextLine());
		int max  = min;
		
		while (sc.hasNextLine()) {
			int temp = Integer.parseInt(sc.nextLine());
			if (temp > max) max = temp;
			if (temp < min) min = temp;
		}
		in.close();
		sc.close();
		
		System.out.println("The highest time is : " + max);
		System.out.println("The lowest time is : " + min);
		
	}

}
