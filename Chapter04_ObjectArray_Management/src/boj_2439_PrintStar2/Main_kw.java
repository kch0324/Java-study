package boj_2439_PrintStar2;

import java.io.*;
import java.util.*;

public class Main_kw {

	public static void printChar(char c, int num) {
		for (int i = 0; i < num; i++) {
			System.out.print(c);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		for (int i = 1; i < n+1; i++) {
			printChar(' ', n - i);
			printChar('*', i);
			System.out.println();
		}
	}
}