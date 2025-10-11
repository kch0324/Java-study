package boj_11047_CoinCalculator;

import java.util.*;
import java.io.*;

public class Main_hs {
	static class Coin {
		public int Solve(int price, int[] arr) {
			int answer = 0;
			int i = 0; 
			while (price > 0) {
				if (arr[i] > price) {
					i += 1;
					continue;
				}
				else {
					int count  = price / arr[i];
					price -= arr[i] * count;
					answer += count;
					i += 1;
				}
			}
			return answer;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] coin_value = new int[N]; 
		
		for (int i = N-1; i >= 0 ; i--) {
			int c = Integer.parseInt(br.readLine());
			coin_value[i] = c;
		}
			
		Coin result = new Coin();
		int answer = result.Solve(K, coin_value);
	
		bw.write(String.valueOf(answer));
		bw.newLine();
		
		bw.flush();
		bw.close();
		}
	
	}