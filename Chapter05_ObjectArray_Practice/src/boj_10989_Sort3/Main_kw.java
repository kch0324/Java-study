package boj_10989_Sort3;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

public class Main_kw {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[10002];
		
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[num]++;
		}
		
		StringBuilder sb = new StringBuilder(n * 3); 
        for (int i = 1; i <= 10000; i++) {
            while (arr[i]-- > 0) sb.append(i).append('\n');
        }
        System.out.print(sb);
	}
}