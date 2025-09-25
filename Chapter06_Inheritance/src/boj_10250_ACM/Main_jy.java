package boj_10250_ACM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_jy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 호텔의 층 수
            int F = Integer.parseInt(st.nextToken());
            // 각 층의 방 수  -> 굳이 필요하지는 않은듯
            int R = Integer.parseInt(st.nextToken());
            // 손님 순서
            int N = Integer.parseInt(st.nextToken());

            int floor = N % F;
            int room = N / F + 1;

            if (floor == 0) {
                floor = F;
                room = N / F;
            }

            System.out.print(floor);
            System.out.print(String.format("%02d", room));
            System.out.print("\n");
        }
        
    }
}
