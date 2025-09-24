package boj_2869_Snail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main_hs {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long V = Long.parseLong(st.nextToken());
		
		long answer = (V - A) / (A-B);
		
		if ((V - A) % (A-B) != 0) {
			answer++;
		}
		answer++;
		
		bw.write(String.valueOf(answer));
		bw.newLine();
		bw.flush();
		bw.close();	
	}
}
