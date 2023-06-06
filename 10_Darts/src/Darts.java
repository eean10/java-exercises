import java.util.Scanner;

/*Store in a String array named "centri" names of players and times they hit the bull's eye
 * in even indexes it has to store names, in odd ones number of bull's eyes.
 * Print the name of best player (most bull's eyes)
 * 
 */
public class Darts {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Let's find who won playing darts!");
		System.out.println("How many players have played?");
		int numberOfPlayers = Integer.parseInt(in.nextLine());
		
		String [] centri = new String[2*numberOfPlayers];
		int bestScore = 0;
		String bestPlayer = "";
		for (int player = 0; player < numberOfPlayers; player++) {
			System.out.println("\nPlayer #" + (player+1));
			System.out.print("Name: ");
			String name = in.nextLine();
			System.out.print("Bull's eyes: ");
			String numberOfBullEyes = in.nextLine();
			centri[player] = name;
			centri[2 * player + 1] = numberOfBullEyes;
			int score = Integer.parseInt(numberOfBullEyes);
			if (score > bestScore) {
				bestScore = score;
				bestPlayer = name;
			}
		}
		in.close();
		System.out.println("\nThe best player is: " + bestPlayer + 
				", They hit the bull's eye " + bestScore + " time(s)");
	}

}
