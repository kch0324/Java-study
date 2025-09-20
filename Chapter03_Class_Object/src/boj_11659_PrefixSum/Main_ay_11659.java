package boj_11659_PrefixSum;

import java.util.Scanner;

class sum_M {
	public int calc(int[] prefix, int start, int end) {
		
		return prefix[end] - prefix[start - 1];
}
}
public class Main_ay_11659 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N+1];
		int[] prefix = new int[N+1];
		
		for (int i = 1; i < N+1; i++ ) {
			arr[i] = sc.nextInt();
			prefix[i] = prefix[i-1] + arr[i];
		}
		sum_M s = new sum_M();
		for (int j = 0; j < M; j++) {
			int S = sc.nextInt();
			int E = sc.nextInt();
			int ans = s.calc(prefix, S, E);
			System.out.println(ans);
		}
	}
}
