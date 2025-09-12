package boj_2439_PrintStar2;
import java.util.Scanner;

public class Main_dy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 1; i < N+1; i++) {
			printSpaces(i, N);
			printStars(i);
			System.out.println();
			
	}

}

// 별 출력 함수
public static void printStars(int count) {
    for (int i = 0; i < count; i++) {
        System.out.print("*");
    }
}

// 공백 출력 함수
public static void printSpaces(int count, int n) {
    for (int i = 0; i < n-count; i++) {
        System.out.print(" ");
    }

	}

}
