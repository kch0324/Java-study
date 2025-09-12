package boj_10162_Microwave;
import java.util.Scanner;

public class Main_dy {

	public static void main(String[] args) {
		int a = 300;
		int b = 60;
		int c = 10;
		int cnt_a = 0;
		int cnt_b = 0;
		int cnt_c = 0;
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		cnt_a = T / a;
		T = T % a;
		
		cnt_b = T / b;
		T = T % b;
		
		cnt_c = T / c;
		T = T % c;
		
		if (T != 0) {
			System.out.print(-1);
		}
		
		else {
			System.out.print(cnt_a+" "+cnt_b+" "+cnt_c);
		}

	}

}
