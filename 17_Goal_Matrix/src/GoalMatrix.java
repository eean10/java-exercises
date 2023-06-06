import java.util.*;

public class GoalMatrix {

	public static void main(String[] args) {
		int[][] goalMatrix = new int [4][5];
		String[] teamsMatrix = new String [goalMatrix.length];
		NavigableMap<Integer, String> teamsMap = new TreeMap<Integer, String>();
		
		Scanner in = new Scanner (System.in);
		Scanner sc = new Scanner (System.in);
		
		for (int team = 0; team < teamsMatrix.length; team++) {
			System.out.print("Qual è il nome della squadra? ");
			teamsMatrix[team] = in.nextLine();
			int sumOfGoals = 0;
			System.out.println("Inserisci il numero di goal segnati in ogni partita dalla squadra " + teamsMatrix[team]);
			for (int scoredGoals = 0;  scoredGoals < goalMatrix[0].length; scoredGoals++) {
				goalMatrix[team][scoredGoals] = sc.nextInt();
				sumOfGoals += goalMatrix[team][scoredGoals];
			}
			teamsMap.put(sumOfGoals, teamsMatrix[team]);
		}
		in.close();
		sc.close();
		
		System.out.print("\nLa matrice dei goal è: ");
		for (int team = 0; team < teamsMatrix.length; team++) {
			System.out.print("\n");
			System.out.printf("%-8s", teamsMatrix[team]);
			for (int scoredGoals = 0;  scoredGoals < goalMatrix[0].length; scoredGoals++) {
				System.out.printf( "%4d", + goalMatrix[team][scoredGoals]);
			}
		}
		
		System.out.print("\n\nLe squadre ordinate in base ai goal fatti sono: ");
		for (String team : teamsMap.descendingMap().values()) System.out.println(team);

	}

}
