package boj_2525_Clock;

import java.util.Scanner;

public class Main_bh {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(); // 시
		int M = sc.nextInt(); // 분
		
		int add = sc.nextInt(); // 요리시간(분)
		
		int getH = (M + add)/60;
		
		if(getH > 0) { // 60분이 넘나?
			if(H+getH >= 24) {
				System.out.println((H+getH-24)+" "+((M + add)%60));
			}else {
				System.out.println((H+getH)+" "+((M + add)%60));
			}
		}else {
			System.out.println(H+" "+(M+add));
		}
	}

}
