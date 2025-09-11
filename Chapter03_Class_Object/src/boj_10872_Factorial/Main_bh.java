package boj_10872_Factorial;

import java.util.Scanner;

public class Main_bh {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int ans = 1;
		
		for(int i = N; i >=0; i--) {
			int a = i;
			if(i == 0) {
				a = 1;
			}
			ans *= a;
		}
		System.out.println(ans);
	}

}
