import java.util.Scanner;

public class Swapnumbers {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Numbers Before Swap:" + num1+"," + num2);
		int temp = 0;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Number After Swap:" + num1+"," + num2);

	}

}
