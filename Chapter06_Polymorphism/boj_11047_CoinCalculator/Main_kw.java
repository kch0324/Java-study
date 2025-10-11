package boj_11047_CoinCalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main_kw {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		// 동전의 수는 정해지기 때문에 배열로 만듦.
		int[] arr = new int[N];
		
		// 저장
		for (int i = 0; i < N; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			
			arr[i] = Integer.parseInt(st1.nextToken());
		}
		
		int result = 0;
		int n = N - 1;
		
		// 큰 수부터 (N - 1) 비교
		while (K > 0 && n >= 0) {
			if (arr[n] > K)
				n--;
			else{
				result += K / arr[n];
				K %= arr[n];
			}
		}
		
		System.out.println(result);
	}
}
