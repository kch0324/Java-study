package boj_11047_CoinCalculator;
import java.util.*;


public class Main_dy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 동전 개수
        int k = sc.nextInt(); // 목표 금액

        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        int count = 0;

        // 큰 금액부터 탐색
        for (int i = n - 1; i >= 0; i--) {
            if (coins[i] <= k) {
                count += k / coins[i];
                k %= coins[i];
            }
        }

        System.out.println(count);
    }
}
