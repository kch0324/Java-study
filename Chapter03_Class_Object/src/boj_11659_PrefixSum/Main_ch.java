package boj_11659_PrefixSum;

import java.util.Scanner;

public class Main_ch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // �迭 ����
        int M = sc.nextInt(); // �׽�Ʈ ���̽� ����

        int[] arr = new int[N];	// �� �迭 ���� �ʱ�ȭ
        // �迭 �Ҵ�
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        //
        for (int p = 0; p < M; p++) {
        	int i = sc.nextInt();
        	int j = sc.nextInt();
        	
        	int sums = 0;
        	for (int q = i-1; q < j; q++) {
        		sums += arr[q];
        	}
        	System.out.println(sums);
        	
        }

	}
}