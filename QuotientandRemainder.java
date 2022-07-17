import java.util.Scanner;

public class QuotientandRemainder {

	public static void main(String[] args) {
	
	double quotient=0;
	double remainder=0;
	
	Scanner sc = new Scanner(System.in);	
	
	System.out.println("Enter 1st number:");
	double	a = sc.nextInt();
	
	System.out.println("Enter 2nd number:");
	double	b = sc.nextInt();
	
	quotient=a/b;
	remainder=a%b;
	
	System.out.println("Quotient="+quotient);
	System.out.println("Remainder="+remainder);
	}

}
