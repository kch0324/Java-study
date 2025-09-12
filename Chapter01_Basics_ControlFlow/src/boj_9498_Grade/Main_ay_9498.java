package boj_9498_Grade;

import java.util.Scanner;

public class Main_ay_9498 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if (score > 89) {
			System.out.println("A");
		}else if (score > 79) {
			System.out.println("B");
		}else if (score>69) {
			System.out.println("C");
		}else if (score>59) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}

}
