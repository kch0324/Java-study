package boj_2292_HoneyComb;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_bh {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine()); // n번 벌집

		if(N == 1) {
			System.out.println(1);
		}else {
			int six = 1;
			N -= 1;
			while(N > 0) {
				N -= 6*six;
				six++;
			}
			System.out.println(six);
		}
		br.close();
	}
}