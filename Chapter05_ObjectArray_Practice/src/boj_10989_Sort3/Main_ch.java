package boj_10989_Sort3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main_ch {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());	// N: ���� ����
		int[] count = new int[10001];	// count: 0~10,000������ ���� ���� ī���ù迭
		// �Է¹��� �� ī����
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			count[num]++;
		}
		// ī���� �迭 ��ȸ�ϸ� ������ŭ ���
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