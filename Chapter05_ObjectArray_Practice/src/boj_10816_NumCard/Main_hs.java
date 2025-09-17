package boj_10816_NumCard;

import java.util.*;
import java.io.*;


public class Main_hs {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		# 각 n과 n개의 정수, m과 m개의 정수 입력 받음
		int n = Integer.parseInt(br.readLine());
		String[] input1  = br.readLine().split(" ");
		int m = Integer.parseInt(br.readLine());
		String[] input2 = br.readLine().split(" ");
		
//		# 받은 배열들이 전부 문자 형태이기 때문에 정수형으로 변경
		int[] arr1 = new int[n];
		int[] arr2 = new int[m];
		
		for (int i = 0; i < n; i++) {
			arr1[i] = Integer.parseInt(input1[i]);
		}
		for (int j = 0; j < m; j++) {
			arr2[j] = Integer.parseInt(input2[j]);
		}
		
//		# 숫자 별로 카운팅하는 hashmap 자료 구조 사용
		Map<Integer, Integer> countMap = new HashMap<>();
		
//		# arr1을 돌면서 key : 숫자, value : 등장 횟수로 저장
		for (int num : arr1) {
			countMap.put(num, countMap.getOrDefault(num, 0) + 1 );
		}
		
//		# 콘솔 출력 시 버퍼링을 사용하여 더 빠르게 처리하기 위해 작성
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
//		# arr2를 순회하면서 arr2에 있는 숫자가 arr1에 몇 번 나왔는지 출력
//		# 해시맵을 사용하여 시간 단축, key값이 없다면 0으로 출력(Python의 dict.get(key, default)와 동일)
		for (int i = 0; i < m; i++) {
			bw.write(String.valueOf(countMap.getOrDefault(arr2[i], 0)));
			if (i != m -1) {
				bw.write(" ");
			}
		}
		bw.flush();
		bw.close();
	}
}