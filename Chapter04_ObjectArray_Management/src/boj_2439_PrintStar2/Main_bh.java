package boj_2439_PrintStar2;

import java.util.Scanner;

public class Main_bh {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N-1-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 1+i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
