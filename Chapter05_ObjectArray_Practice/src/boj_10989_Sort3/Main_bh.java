package boj_10989_Sort3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main_bh {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i] = num;
		}

		Arrays.sort(arr);

		for (int i : arr) {
			bw.write(i+"\n");
		}

		bw.close();
		br.close();
	}
}