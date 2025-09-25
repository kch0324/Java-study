package boj_2292_HoneyComb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
	static int honeycomb(int n) {
		int layer = 1;
		int num = 1;
		
		if (n == num)
			return 1;
		
		while (n > num) {
			num += 6 * layer;
			layer++;
		}
		return layer;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());		
		
		System.out.println(honeycomb(n));
	}
}
