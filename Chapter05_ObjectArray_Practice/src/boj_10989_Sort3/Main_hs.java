package boj_10989_Sort3;

import java.util.*;
import java.io.*;


public class Main_hs {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] testList = new int[n];
		
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			testList[i] = num;
			
		}
		
		Arrays.sort(testList);
		
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int x : testList) {
			bw.write(String.valueOf(x));
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
	}
}
