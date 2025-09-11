package boj_2445_PrintStar8;

import java.util.Scanner;

public class Main_bh {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print('*');
			}
			for(int j = 0; j < N*2-2 -2*i; j++) {
				System.out.print(' ');
			}
			for(int j = 0; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();			
		}
		
		for(int i = 0; i < N-1; i++) {
			for(int j = 0; j < N-1-i; j++) {
				System.out.print('*');
			}
			for(int j = 0; j < 2+2*i; j++) {
				System.out.print(' ');
			}
			for(int j = 0; j < N-1-i; j++) {
				System.out.print('*');
			}
			System.out.println();			
		}

	}

}
