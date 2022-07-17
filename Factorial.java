import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		int n;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = 2; i * i <= n; i++) {
			while (n % i == 0) {
				n = n / i;
				System.out.println(i);

			}
		}
		if (n > 2) {
			System.out.println("prime factor:" + n);
		}

	}

}
