package boj_11053_LISGeneric;

import java.util.*;
import java.io.*;
import java.util.stream.*;

public class Main_hs {
	public static int generic (List<Integer> arr, int n) {
		int answer = 0;
		int[] dp = new int[n];
		Arrays.fill(dp, 1);
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr.get(j) < arr.get(i)) {
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
			}
		}
		for (int value : dp) {
			answer = Math.max(answer, value);
		}	
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		List<Integer> test_arr = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		
		int result = generic(test_arr, N);
		
		bw.write(String.valueOf(result));
		
		bw.flush();
		bw.close();
	}
}