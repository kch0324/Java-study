package boj_1712_BreakEven;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main_hs {
	
	static class BreakEven {
		public long solve(long a, long b, long c) {
			if (c <= b) {
				return -1;
			}
			else {
				return a / (c - b) + 1;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long C = Long.parseLong(st.nextToken());
		
		BreakEven result = new BreakEven();
		long answer = result.solve(A, B, C); 
		
		bw.write(String.valueOf(answer));
		bw.newLine();
		bw.flush();
		bw.close();	
	}

}
