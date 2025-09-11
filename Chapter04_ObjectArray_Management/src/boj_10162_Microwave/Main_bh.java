package boj_10162_Microwave;

import java.util.Scanner;

public class Main_bh {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		int A = T / 300;
		int B = (T % 300) / 60;
		int C = (T % 300 % 60) / 10;
		
		if((T % 300 % 60 % 10) == 0) {
			System.out.print(A+" ");
			System.out.print(B+" ");
			System.out.print(C);
		}else {
			System.out.println(-1);
		}
	}
}