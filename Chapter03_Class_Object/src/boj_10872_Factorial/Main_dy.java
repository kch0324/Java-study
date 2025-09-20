package boj_10872_Factorial;
import java.util.Scanner;

public class Main_dy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int ans = 1;
		for (int i = n; i > 0; i--) {
			ans *= i;
		}
		System.out.println(ans);	
	}

}
