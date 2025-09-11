package boj_10162_Microwave;

import java.io.*;
import java.util.*;

public class Main_kw {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int A = 300;
		int B = 60;
		int C = 10;
		
		int[] res = {0, 0, 0};
		
		while (n >= 10) {
			if (n >= A) {
				n -= A;
				res[0] += 1;
				continue;
			}
			else if (n >= B){
				n -= B;
				res[1] += 1;
				continue;
			}
			else {
				n -= C;
				res[2] += 1;
				continue;
			}
		}
		
		if (n != 0) {
			System.out.println(-1);
			return;
		}
		
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
		
	}
}
