package boj_10250_ACM;

import java.util.*;
import java.io.*;

public class Main_hs {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			int floor = N % H;
			if (floor == 0) {
				floor = H;				
			}
			int room = (N - 1) / H + 1;
			
			int answer = floor * 100 + room;
			
			bw.write(String.valueOf(answer));
			bw.newLine();
			
		}
		bw.flush();
		bw.close();
	}

}