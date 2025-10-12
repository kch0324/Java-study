package boj_11047_CoinCalculator;

import java.util.*;

public class Main_ch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 동전 종류 개수 N, 목표 금액 K 입력
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N]; // 동전 가치 배열

        // 2. 동전 가치 입력 (문제 보장: 오름차순)
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // 3. 큰 동전부터 가능한 한 많이 사용 (그리디)
        int cnt = 0; // 사용한 동전 개수
        for (int i = N - 1; i >= 0; i--) {
            if (K == 0) break;             // 목표 금액을 모두 만들었으면 종료
            if (arr[i] <= K) {             // 현재 동전이 사용가능하면
                cnt += (K / arr[i]);         // 해당 동전으로 만들 수 있는 개수만큼 사용
                K %= arr[i];               // 쓰고 남은 나머지로 남은금액 갱신
            }
        }

        // 4. 결과 출력
        System.out.println(cnt);
    }
}
