import java.util.Scanner;
//
public class SoccerMatch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Name of first team: ");
		String firstTeam = in.nextLine();
		
		System.out.print("Name of second team: ");
		String secondTeam = in.nextLine();
		
		System.out.print("How many goals did the first team score? ");
		int goalsOfFirstTeam = Integer.parseInt(in.nextLine());
		
		System.out.print("How many goals did the second team score? ");
		int goalsOfSecondTeam = Integer.parseInt(in.nextLine());
		
		int totalGoals = goalsOfFirstTeam + goalsOfSecondTeam;
		in.close();
		
		if (goalsOfFirstTeam == goalsOfSecondTeam) System.out.println("It's a tie!");
		else if (goalsOfFirstTeam > goalsOfSecondTeam) System.out.println(firstTeam + " won!");
		else System.out.println(secondTeam + " won!");
		System.out.println("Total number of goals: " + totalGoals);

	}

}
