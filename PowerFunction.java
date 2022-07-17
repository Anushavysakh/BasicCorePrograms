import java.util.Scanner;

public class PowerFunction {

	public static void main(String[] args) {
		
		int i = 0;                
		int powerOfTwo = 1;  
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		while (i <= n) {
			System.out.println(powerOfTwo);   // print out the power of two
			powerOfTwo = 2 * powerOfTwo;                // double to get the next one
			i = i + 1;
		}
	}
}
