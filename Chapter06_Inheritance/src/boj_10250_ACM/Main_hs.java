package boj_10250_ACM;

import java.util.*;
import java.io.*;

public class Main_hs {
	
	static class ACM{
		public int solve(int h, int m, int n) {
			int floor = n % h;
			if (floor == 0) {
				floor = h;				
			}
			int room = (n - 1) / h + 1;
			
			return floor * 100 + room;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			ACM result = new ACM();
			int answer = result.solve(H, M, N);
			
			bw.write(String.valueOf(answer));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}