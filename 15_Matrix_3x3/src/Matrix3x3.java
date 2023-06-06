import java.util.Scanner;

public class Matrix3x3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] matrix = new int[3][3];
		System.out.println("Insert matrix values:");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[0].length; column++) matrix[row][column] = in.nextInt();
		}
		in.close();
		
		System.out.print("\nThe matrix is:");
		for (int row = 0; row < matrix.length; row++) {
			System.out.print("\n");
			for (int column = 0; column < matrix[0].length; column++) System.out.printf("%4d", matrix[row][column]);
		}
		
		System.out.println("\n\nSum of matrix's rows:");
		for (int row = 0; row < matrix.length; row++) {
			int sum = 0;
			for (int column = 0; column < matrix[0].length; column++) sum += matrix[row][column];
			System.out.println("The sum of row " + row + " is : " + sum);
		}
		
		System.out.println("\n\nSum of matrix's columns:");
		for (int column = 0; column < matrix[0].length; column++) {
			int sum = 0;
			for (int row = 0; row < matrix.length; row++) sum += matrix[row][column];
			System.out.println("The sum of row " + column + " is : " + sum);
		}
		
		System.out.print("\n\nThe transposed matrix is:");
		int[][] tMatrix = new int[matrix[0].length][matrix.length];
		for (int row = 0; row < tMatrix.length; row++) {
			System.out.print("\n");
			for (int column = 0; column < tMatrix[0].length; column++) {
				tMatrix[row][column] = matrix[column][row];
				System.out.printf("%4d", tMatrix[row][column]);
			}
		}	
		
	}

}
