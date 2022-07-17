import java.util.Scanner;

public class Harmonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double result = 0;
		double num = 0;

		int n;

		System.out.println("Enter a number:" );
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if (n != 0) {
			for (int i = 1; i <= n; i++) {
				result = result + (double) 1 / i;
				System.out.print("1/" + i + " +");
			}
			System.out.print("= " + result);
			System.out.println();
		} else
			System.out.println("Please enter a valid number");
	}

}
