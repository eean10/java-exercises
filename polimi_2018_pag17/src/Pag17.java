import java.util.Arrays;

public class Pag17 {

	public static void main(String[] args) {
		int n = 30;
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			if (i < 3) array[i] = 1;
			else array[i] = array[i-1] + array[i-3];
		}
		System.out.println(Arrays.toString(array));
	}

}
