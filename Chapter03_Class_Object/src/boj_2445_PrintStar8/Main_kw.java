package boj_2445_PrintStar8;

import java.io.*;
import java.util.*;

public class Main_kw {

	public static void printChar(char c, int cnt) {
		for (int i = 0; i < cnt; i++) {
			System.out.print(c);
		}
	}
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        
        for (int i = 1; i <= N; i++) {
        	printChar('*', i);
        	printChar(' ', (N - i) * 2);
        	printChar('*', i);
        	System.out.println();
        }
        
        for (int i = N-1; i > 0; i--) {
        	printChar('*', i);
        	printChar(' ', (N - i) * 2);
        	printChar('*', i);
        	System.out.println();
        }
        
	}
}