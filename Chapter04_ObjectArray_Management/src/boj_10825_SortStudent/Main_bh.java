package boj_10825_SortStudent;

import java.util.Scanner;

public class Main_bh {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 학생 수
		String[] name = new String[N];
		int[][] score = new int[N][3];
		
		for(int i = 0; i < N; i++) {
			name[i] = sc.nextLine();
			score[i][0] = sc.nextInt(); // 국
			score[i][1] = sc.nextInt(); // 영
			score[i][2] = sc.nextInt(); // 수
		}
		
		// 정렬...?

	}

}
