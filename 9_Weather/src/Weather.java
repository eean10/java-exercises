
/*Write a program that stores averages temperature from this site
 * https://www.ilmeteo.it/portale/medie-climatiche/Roma?refresh_ce
 * and then shows the average of those temperatures
 */
    
public class Weather {

	public static void main(String[] args) {
		String[] temperatures = {"3", "4", "5", "8", "11", "15", "17", "18", "15", "11", "7", "4"};
		double average = 0.0;
		for (String temperature : temperatures) average += Integer.parseInt(temperature)/12.0;
		System.out.println(average);
	}

}
