package boj_2869_Snail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {	

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long A = Integer.parseInt(st.nextToken());
		long B = Integer.parseInt(st.nextToken());
		long V = Integer.parseInt(st.nextToken());
		
		 if (A >= V) {                  // 첫날 낮에 도달
	            System.out.println(1);
	            return;
	        }
		 	
		 	
        long total_dist = V - A;
        long dist = A - B;

        long days = (long) Math.ceil((double) total_dist / dist) + 1;
	
		System.out.println(days);
	}
}
