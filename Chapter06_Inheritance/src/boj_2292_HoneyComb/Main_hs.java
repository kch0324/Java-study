package boj_2292_HoneyComb;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_hs {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int i = 1;
		int max = 1;
		while (N > max) {
			max += i * 6;
			i++;
		}
		
		bw.write(String.valueOf(i));
		bw.newLine();
		bw.flush();
		bw.close();	
	}

}