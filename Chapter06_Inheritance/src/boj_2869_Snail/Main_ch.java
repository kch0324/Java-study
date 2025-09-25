package boj_2869_Snail;

import java.util.Scanner;

public class Main_ch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();   // 낮에 올라가는 높이
        int B = sc.nextInt();   // 밤에 떨어지는 높이
        int V = sc.nextInt();   // 목표 높이
        int cnt;                // 올라가는데 걸리는 일 수
     
        if (A <= B) {
            cnt = -1;   // 못올라갈때
        } else {
            cnt = (V - A) / (A - B) + 1;	// 총가야하는 거리 = V-A
            if ((V - A) % (A - B) != 0) {	// 나누어떨어지지 않으면 하루가 더 걸림
                cnt++;
            }
        }

        System.out.print(cnt);
        sc.close();
    }
}