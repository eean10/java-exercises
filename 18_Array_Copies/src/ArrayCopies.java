import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopies {

	public static void main(String[] args) {
		int[] numeri = new int[5];
		
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci i valori del vettore: ");
		for(int i = 0; i < numeri.length; i++) {
			numeri[i] = in.nextInt();
		}
		in.close();
		
		//Method 1
		int[] copiaNumeri1 = numeri.clone();
		Arrays.sort(copiaNumeri1);
		
		System.out.println("\nMetodo 1: assegnazione con .clone()");
		System.out.println("Vettore numeri " + numeri);
		System.out.println(Arrays.toString(numeri));
		System.out.println("Vettore copiaNumeri " + copiaNumeri1);
		System.out.println(Arrays.toString(copiaNumeri1));
		
		
		//Method 2
		int[] copiaNumeri2 = new int [numeri.length];
		for (int i = 0; i < numeri.length; i++) copiaNumeri2[i] = numeri[i];
		Arrays.sort(copiaNumeri2);
		
		System.out.println("\nMetodo 2: assegnazione con ciclo");
		System.out.println("Vettore numeri " + numeri);
		System.out.println(Arrays.toString(numeri));
		System.out.println("Vettore copiaNumeri " + copiaNumeri2);
		System.out.println(Arrays.toString(copiaNumeri2));
				
		
		//Method 3
		int[] copiaNumeri3 = new int [numeri.length];
		copiaNumeri3 = numeri;
		Arrays.sort(copiaNumeri3);
		
		System.out.println("\nMetodo 3: assegnazione con =");
		System.out.println("Vettore numeri " + numeri);
		System.out.println(Arrays.toString(numeri));
		System.out.println("Vettore copiaNumeri " + copiaNumeri3);
		System.out.println(Arrays.toString(copiaNumeri3));
				
	}

}
