package boj_2869_Snail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_bh {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] arr = br.readLine().split(" ");
		int A = Integer.parseInt(arr[0]); // 낮 상승
		int B = Integer.parseInt(arr[1]); // 밤 하락
		int V = Integer.parseInt(arr[2]); // 막대높이

		int days = V - A;
		int gap = A - B;
		
		bw.write((int)Math.ceil((double)days/gap+1)+"");

		bw.flush();
		bw.close();
		br.close();
	}
}