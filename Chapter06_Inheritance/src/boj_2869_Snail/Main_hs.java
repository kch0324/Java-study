package boj_2869_Snail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main_hs {
	
	static class Snail {
		
		public long solve(long a, long b, long v) {
			long days = (v - a) / (a - b);
			
			if ((v - a) % (a - b) != 0) {
				days++;
			}
			days++;		
			return days;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long V = Long.parseLong(st.nextToken());
		
		Snail result = new Snail();
		long answer = result.solve(A, B, V); 
		
		bw.write(String.valueOf(answer));
		bw.newLine();
		bw.flush();
		bw.close();	
	}
}
