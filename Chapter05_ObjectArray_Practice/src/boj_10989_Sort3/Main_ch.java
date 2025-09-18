package boj_10989_Sort3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main_ch {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());	// N: 수의 개수
		int[] count = new int[10001];	// count: 0~10,000까지의 수를 담을 카운팅배열
		// 입력받은 수 카운팅
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			count[num]++;
		}
		// 카운팅 배열 순회하며 개수만큼 출력
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < count.length; i++) {
			if(count[i] == 0) {
				continue;
			}
			for(int j = 0; j < count[i]; j++) {
				sb.append(i).append("\n");
			}
			
		}
		System.out.print(sb.toString());
		

	}

}