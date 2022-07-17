import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int head = 0;
		int tail = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of times to flip coin:");
		int n = sc.nextInt();
		for (int i = 1; i < n; i++) {
			double flip = Math.floor(Math.random() * 10) % 2;
			if (flip< 0.5) {
				head++;

			} else {
				tail++;
			}
		}
		double headpercent = (head * 100) /n;
		double tailpercent = (tail * 100) /n;
		System.out.println("The percent of Head flips:" + headpercent);
		System.out.println("The percent of Tail flips:" + tailpercent);
	}

}
