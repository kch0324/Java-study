package boj_10816_NumCard;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

// 15552번 문제 참고
// https://rlakuku-program.tistory.com/33
// 시간초과 줄이기
public class Main_bh {

	// O(n*m)
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine()); // 상근이 카드수
		HashMap<Integer, Integer> map = new HashMap<>();
		
		String[] input = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(input[i]);
			map.put(num, map.getOrDefault(num, 0) + 1); // 키가 있으면 거기에 +1, 없으면 새로 추가
		}

		int m = Integer.parseInt(br.readLine()); // 비교할 카드수
		String[] input2 = br.readLine().split(" ");
		for (String ch_num : input2) {
			int num = Integer.parseInt(ch_num);
			bw.write(map.getOrDefault(num, 0) + " ");
			
		}
		bw.flush(); // 출력 후 버퍼 비움
		bw.close();
		br.close();
	}
	
	// 시간복잡도가 O(n*m)
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int n = Integer.parseInt(br.readLine()); // 상근이 카드수
//		int[] sangn = new int[n];
//		String[] input = br.readLine().split(" ");
//		for (int i = 0; i < n; i++) {
//			sangn[i] = Integer.parseInt(input[i]); // 각 요소마다 형변환
//		}
//
//		int m = Integer.parseInt(br.readLine()); // 비교할 카드수
//		String[] input2 = br.readLine().split(" ");
//		for (int i = 0; i < m; i++) {
//			int num = Integer.parseInt(input2[i]); // 각 요소마다 형변환
//			int cnt = 0;
//			for (int j = 0; j < n; j++) {
//				if (sangn[j] == num) {
//					cnt++;
//				}
//			}
//			bw.write(cnt + " ");
//			bw.flush(); // 출력 후 버퍼 비움
//		}
//		bw.close();
//		br.close();
//	}

}
