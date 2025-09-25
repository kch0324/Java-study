package boj_10250_ACM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
	
	static int solve(int p_h, int p_w, int p_n) {
		int h = (p_n - 1) % p_h + 1;
		int room_num = (p_n - 1) / p_h + 1;
		
		return h * 100 + room_num;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
		
			sb.append(solve(H, W, N));
			sb.append('\n');
		}
		
		System.out.print(sb.toString());
		
	}
}
