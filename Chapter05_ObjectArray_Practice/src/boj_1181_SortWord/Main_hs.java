package boj_1181_SortWord;

import java.util.*;
import java.io.*;

public class Main_hs {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
//		# 중복 제거를 위해 집합으로 입력 받음
		Set<String> input = new HashSet<>();
		
		for (int i = 0; i < n; i++) {
			input.add(br.readLine());
		}
//		#리스트로 다시 변환
		List<String> arr = new ArrayList<>(input);
		
//		# 길이 짧은 순 + 사전 순 정렬
		Collections.sort(arr, (a, b) -> {
			if (a.length() != b.length()) {
				return a.length() - b.length();
			}
			return a.compareTo(b);
		});
	
		StringBuilder sb = new StringBuilder();
		for (String s : arr) {
			sb.append(s).append("\n");
		}
		System.out.println(sb);
	}

}
