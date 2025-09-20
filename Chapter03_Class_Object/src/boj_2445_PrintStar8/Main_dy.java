package boj_2445_PrintStar8;
import java.util.Scanner;

public class Main_dy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 위쪽
        for (int i = 1; i <= N; i++) {
            printStars(i);                          // 왼쪽 별
            printSpaces(2 * (N - i));               // 가운데 공백
            printStars(i);                          // 오른쪽 별
            System.out.println();
        }

        // 아래쪽
        for (int i = N - 1; i >= 1; i--) {
            printStars(i);
            printSpaces(2 * (N - i));
            printStars(i);
            System.out.println();
        }

        sc.close();
    }

    // 별 출력 함수
    public static void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
    }

    // 공백 출력 함수
    public static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }

	}

}
