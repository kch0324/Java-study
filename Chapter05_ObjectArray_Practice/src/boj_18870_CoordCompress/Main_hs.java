package boj_18870_CoordCompress;


import java.io.*;
import java.util.*;

public class Main_hs {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] input = br.readLine().split(" ");
		
		int [] arr = new int[input.length];
		
		for (int i = 0; i < input.length; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		
//		# 좌표의 대소 관계를 유지하기 위해 오름차순 정렬
		int[] sorted = arr.clone();
		Arrays.sort(sorted);
		
//		# 해시맵(파이썬의 딕셔너리와 비슷한 듯)으로 rank 생성
		Map<Integer, Integer> rank = new HashMap<>();
		int idx = 0;
		
//		# 정렬된 배열을 돌면서 해시맵에 키가 없다면 추가하고 인덱스 1씩 증가(중복X)
		for (int v : sorted) {
			if (!rank.containsKey(v)) {
				rank.put(v,  idx++);
			}
		}
		
//		# 문자열을 여러번 붙이기 위해 StringBuilder 사용
		StringBuilder sb = new StringBuilder();
		for (int v : arr) {
			sb.append(rank.get(v)).append(' '); 
		}
//		# 마지막 숫자의 공백을 없애기 위해 trim() 사용 (파이썬에서의 strip()과 같은 역할)
		System.out.println(sb.toString().trim());
	}
}
