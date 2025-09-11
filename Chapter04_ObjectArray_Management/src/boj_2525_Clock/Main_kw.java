package boj_2525_Clock;

import java.io.*;
import java.util.*;

public class Main_kw {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int C = Integer.parseInt(br.readLine());
		
		B += C;
		if (B >= 60) {
			A += B / 60;
			
			B %= 60;
		}
		if (A >= 24) {
			A -= 24;
		}
		
		System.out.print(A + " " + B);
	}
}
