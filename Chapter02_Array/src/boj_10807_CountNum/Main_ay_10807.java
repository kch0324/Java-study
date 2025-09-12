package boj_10807_CountNum;
import java.util.Scanner;
public class Main_ay_10807 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] intarray = new int[N];
		
		for (int i = 0; i < N; i++) {
			intarray[i] = sc.nextInt();
		}
		int v = sc.nextInt();
		int cnt = 0;
		for(int i=0; i<intarray.length; i++) {
			if (v == intarray[i]) {
				cnt += 1;
			}
			
		}
		System.out.println(cnt);
		
	}

}
