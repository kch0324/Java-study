package boj_10816_NumCard;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 15552번 문제 참고
// https://rlakuku-program.tistory.com/33
// 시간초과 줄이기
public class Main_bh {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()); // 상근이 카드수
		int[] sangn = new int[n];
		String[] input = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			sangn[i] = Integer.parseInt(input[i]); // 각 요소마다 형변환
		}

		int m = Integer.parseInt(br.readLine()); // 비교할 카드수
		String[] input2 = br.readLine().split(" ");
		for (int i = 0; i < m; i++) {
			int num = Integer.parseInt(input2[i]); // 각 요소마다 형변환
			int cnt = 0;
			for (int j = 0; j < n; j++) {
				if (sangn[j] == num) {
					cnt++;
				}
			}
			bw.write(cnt + " ");
			bw.flush(); // 출력 후 버퍼 비움
		}
		bw.close();
		br.close();
	}

}
