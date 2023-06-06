/*get number of downloads of 10 apps
divide apps by number of downloads
gold: > 2 million
siver: 500 thousand - 2 million
bronze: < 500 thousand
show how many apps refer to each category
*/

import java.util.Scanner;

public class ProfStore {

	public static void main(String[] args) {
		int[] category = {0,0,0};
		Scanner in = new Scanner(System.in);
		System.out.println("Let's group apps by number of downloads. ");
		System.out.println("How many apps are involved?");
		int numberoOfApps = in.nextInt();
		
		for (int i = 0; i < numberoOfApps; i++) {
			System.out.print("Number of downloads of the app #" + (i+1) + ": ");
			int downloads = in.nextInt();
			if (downloads > 2000000) category[0]++;
			else if (downloads > 500000) category[1]++;
			else category[2]++;
		} 
		in.close();
		
		System.out.println("\nCategory  N of apps");
		System.out.println("   Gold:     " + category[0]);
		System.out.println(" Silver:     " + category[1]);
		System.out.println(" Bronze:     " + category[2]);
		
	}

}
