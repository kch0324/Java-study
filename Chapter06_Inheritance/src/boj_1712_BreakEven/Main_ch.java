package boj_1712_BreakEven;
import java.util.Scanner;

public class Main_ch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();   // 고정비용
        int B = sc.nextInt();   // 가변비용
        int C = sc.nextInt();   // 판매가격
        int cnt;                // 손익분기점 판매대수

        if (C <= B) {
            cnt = -1;   // 손익분기점이 없을때
        } else {
            cnt = A / (C - B) + 1;   
        }

        System.out.print(cnt);
        sc.close();
    }
}