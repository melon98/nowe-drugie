import java.util.Scanner;

public class drugie_zes_drugi {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a, b, suma = 0, x = 0;
		a = in.nextInt();
		b = in.nextInt();
		if (a >= b) {
			System.out.println("a musi byc mniejsze od b");
		} else if (a < b) {
			while ((a + x) <= b) {
				suma = suma + (a + x);
				x++;

			}
			System.out.println(suma);
			suma=0; x=0;
			do {
				suma = suma + (a + x);
				x++;

			} while ((a + x) <= b);
			System.out.println(suma);
		}
		suma=0; x=0;
		for(int i=a; i<=b; i++) {
				suma=suma+i;
				
		}
			
		System.out.println(suma);
	}
}
