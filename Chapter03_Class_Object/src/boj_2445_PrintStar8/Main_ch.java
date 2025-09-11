package boj_2445_PrintStar8;

import java.util.Scanner;

public class Main_ch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= 2 * N - 1; i++) {
            int nums; // 현재 줄에 출력할 별 개수 (왼쪽/오른쪽)
            if (i <= N) {	// 중앙(별이 N개인 줄) 보다 위쪽 줄
                nums = i;            
            } else {	// 중앙(별이 N개인 줄) 보다 아래쪽 줄
                nums = 2 * N - i;
            }

            // 왼쪽 별
            for (int j = 1; j <= nums; j++) System.out.print("*");

            // 가운데 공백
            for (int j = 1; j <= 2 * (N - nums); j++) System.out.print(" ");

            // 오른쪽 별
            for (int j = 1; j <= nums; j++) System.out.print("*");

            System.out.println();
        }
    }
}