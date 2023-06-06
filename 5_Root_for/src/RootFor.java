import java.util.Scanner;
//enter name and favourite team and print a sentence

public class RootFor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What's your first name? ");
		String name = in.nextLine();
		name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
		
		System.out.println("What's your last name? ");
		String surname = in.nextLine();
		surname = surname.substring(0,1).toUpperCase() + surname.substring(1).toLowerCase();
		
		System.out.println("What's your favourite team? ");
		String team = in.nextLine();
		team = team.substring(0,1).toUpperCase() + team.substring(1).toLowerCase();
		in.close();
		
		System.out.println("Ciao " + name + " " + surname + "! La tua squadra del cuore è : " + team + ".");
		
	}

}
