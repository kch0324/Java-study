package boj_10989_Sort3;

import java.util.*;
import java.io.*;


public class Main_hs {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		# 정수 n 입력 및 N개의 정수를 담을 배열 생성
		int n = Integer.parseInt(br.readLine());
		int[] testList = new int[n];
		
//		# 받은 정수들을 전부 정수형을 변환
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			testList[i] = num;	
		}
		
//		# 정렬
		Arrays.sort(testList);
		
//		# 콘솔에 출력할 때 버퍼링을 사용하여 더 빠르게 처리하려는 코드
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
//	    # 출력 시 줄 바꿈
		for (int x : testList) {
			bw.write(String.valueOf(x));
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
	}
}
