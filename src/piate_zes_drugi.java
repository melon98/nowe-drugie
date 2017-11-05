import java.util.Scanner;

public class piate_zes_drugi {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int a = 1;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int suma = 0;
		int sr;
		int x = 0;
		
		while (a != 0) {
			a = in.nextInt();
			if(a==0) {
			break;
		}
			if (a > max) {
				max = a;
			}
			if (a < min) {
				min = a;
			} 
			suma = suma + a;
			x++;
		
		}
		sr = suma / x;

		System.out.println(max);
		System.out.println(min);
		System.out.println(suma);
		System.out.println(sr);

	}
}