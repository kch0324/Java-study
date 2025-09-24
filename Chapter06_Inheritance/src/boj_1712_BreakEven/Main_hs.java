package boj_1712_BreakEven;

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
		
		long x = Long.parseLong(br.readLine());
		
		
		long end = 1;
		long diff = 1;
		
		while (x > end) {
			diff += 1;
			end += diff;
		}
		
		long delta = end - x;
		long child;
		long par;
		
		if (diff % 2 == 0) {
			child = diff - delta;
			par = 1 + delta;
			}
		else {
			child = 1 + delta;
			par = diff - delta;
			}
		
		String answer = child + "/" + par;
		
		bw.write(String.valueOf(answer));
		bw.newLine();
		bw.flush();
		bw.close();	
	}

}
