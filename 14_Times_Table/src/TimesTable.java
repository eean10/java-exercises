
public class TimesTable {

	public static void main(String[] args) {
		int[][] timesTable = new int[10][10];
		
		System.out.print("La matrice delle tabelline contiene:");
		for (int row = 0; row < timesTable.length; row++) {
			System.out.print("\n");
			for (int column = 0; column < timesTable[0].length; column++) {
				timesTable[row][column] = (row + 1) * (column + 1);
				System.out.printf("%4d", timesTable[row][column]);
			}
		}

	}

}
