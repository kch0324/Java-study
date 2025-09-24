package boj_2292_HoneyComb;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_hs {
	
	static class HoneyComb {
		
		public long solve (long n) {
			long i = 1;
			long max = 1;
			while (n > max) {
				max += i * 6;
				i++;
			}
			return i;
		} 
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long N = Long.parseLong(br.readLine());
		
		HoneyComb result = new HoneyComb();
		long answer = result.solve(N);
		
		bw.write(String.valueOf(answer));
		bw.newLine();
		bw.flush();
		bw.close();	
	}

}