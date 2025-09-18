package boj_10989_Sort3;
import java.util.Scanner;

public class Main_ch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	// N: 수의 개수
		int[] count = new int[10001];	// count: 0~10,000까지의 수를 담을 카운팅배열
		// 입력받은 수 카운팅
		for(int i = 0; i < N; i++) {
			int num = sc.nextInt();
			count[num]++;
		}
		// 카운팅 배열 순회하며 개수만큼 출력
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