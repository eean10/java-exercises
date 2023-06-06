import java.util.Scanner;

/*
 * Insert how many students got the highest grade and divide the bonus by them
 * Insert try catch exception in case no student has reached the requirement
 */
public class SCBonus {

	public static void main(String[] args) {
		final int bonus = 1000;
		Scanner in = new Scanner(System.in);
		System.out.println("How many students got a score of 10?");
		int worthyStudents = in.nextInt();
		
		
		try {
			int bonusPerStudent = bonus/worthyStudents;
			System.out.println("Each student gets €" + bonusPerStudent);
		} catch (ArithmeticException e) {
			System.out.println("Impossibile dividere per 0");
			in.close();
		}
	}

}
