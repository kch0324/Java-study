package boj_1712_BreakEven;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_bh {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] arr = br.readLine().split(" ");
		int A = Integer.parseInt(arr[0]); // 고정비
		int B = Integer.parseInt(arr[1]); // 가변비
		int C = Integer.parseInt(arr[2]); // 판매액

		if(C <= B) {
			System.out.println(-1);
		}else {
			double gap = C - B;
			System.out.println((int)(A/gap+1));
		}
		br.close();
	}
}