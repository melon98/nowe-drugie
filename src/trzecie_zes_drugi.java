import java.util.Scanner;

public class trzecie_zes_drugi {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, i = 0;
		double liczba = 0;
		a = in.nextInt();
		while (i <= a) {
			liczba = Math.pow(2, i);
			i++;

			if (liczba < a) {
				System.out.println((int)liczba);
			}
		}

	}

}
