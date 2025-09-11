package boj_10872_Factorial;

import java.util.Scanner;

class Factorial {
	
	public int calc(int N) {
		int result = 1;
		for (int i = N; i > 0; i--) {
			result *=i;
		}
		return result;
	}
}

public class Main_ay_10872 {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	Factorial f = new Factorial();
	int ans = f.calc(N);
	
	System.out.println(ans);
	}
}
