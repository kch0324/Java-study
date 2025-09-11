package boj_11659_PrefixSum;

import java.util.Scanner;

public class Main_bh {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
//		int[] Narr = new int[N+1];
		int[] prefix = new int[N+1]; 
		int[] ans = new int[M];
		
		for(int i = 1; i < N+1; i++) {
			int a = sc.nextInt();
			prefix[i] = prefix[i-1] + a;
		}

		for(int i = 0; i < M; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
//			sc.nextLine(); // 개행 ........
//			System.out.print(prefix[end] - prefix[start-1] + "\n");
			ans[i] = prefix[end] - prefix[start-1]; 
		}
		for (int i : ans) {
			System.out.println(i);
			
		}
	}
}
