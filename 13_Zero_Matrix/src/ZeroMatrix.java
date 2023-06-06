
public class ZeroMatrix {

	public static void main(String[] args) {
		int[][] zeroMatrix = new int[3][3];

		System.out.print("La matrice contiene:");
		for (int row = 0; row < zeroMatrix.length; row++) {
			System.out.print("\n");
			for (int column = 0; column < zeroMatrix[0].length; column++) {
				zeroMatrix[row][column] = 0;
				System.out.print(zeroMatrix[row][column] + " ");
			}
		}
	}

}
