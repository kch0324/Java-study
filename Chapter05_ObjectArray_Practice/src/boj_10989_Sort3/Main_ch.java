package boj_10989_Sort3;
import java.util.Scanner;

public class Main_ch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	// N: ���� ����
		int[] count = new int[10001];	// count: 0~10,000������ ���� ���� ī���ù迭
		// �Է¹��� �� ī����
		for(int i = 0; i < N; i++) {
			int num = sc.nextInt();
			count[num]++;
		}
		// ī���� �迭 ��ȸ�ϸ� ������ŭ ���
		for(int i = 0; i < count.length; i++) {
			if(count[i] == 0) {
				continue;
			}
			for(int j = 0; j < count[i]; j++) {
				System.out.println(i);
			}
			
		}
		

	}

}