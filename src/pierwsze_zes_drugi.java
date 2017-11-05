import java.util.Scanner;

public class pierwsze_zes_drugi {

	public static void main(String[] args) {
		int a;

		Scanner in = new Scanner(System.in);

		a = in.nextInt();

		for (int i = 1; i <= a; i = i + 2)
			System.out.print(i + " ");
	}
}