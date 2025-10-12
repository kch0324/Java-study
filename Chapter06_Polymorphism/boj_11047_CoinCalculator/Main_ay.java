package boj_11047_CoinCalculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;

public class Main_ay {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int K = Integer.parseInt(input[1]);
		
		int[] coins = new int[N];
		for (int i = 0; i < N; i++) {
			coins[i] = Integer.parseInt(br.readLine());
		}
		
		int ans = 0;
		for (int i = N -1; i >=0; i--) {
			if(coins[i] <= K) {
				ans += K / coins[i];
				K %= coins[i];
			}
			if (K==0) break;
		}
		
		System.out.println(ans);
	}

}
