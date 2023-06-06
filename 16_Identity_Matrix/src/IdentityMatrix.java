
public class IdentityMatrix {

	public static void main(String[] args) {
		int[][] identityMatrix = new int[4][4];
		
		System.out.print("La matrice diagonale è la seguente:");
		for (int row = 0; row < identityMatrix.length; row++) {
			System.out.print("\n");
			for (int column = 0; column < identityMatrix[0].length; column++) {
				if (row == column) identityMatrix[row][column] = 1;
				else identityMatrix[row][column] = 0;
				System.out.printf("%3d", identityMatrix[row][column]);
			}
		}

	}

}
