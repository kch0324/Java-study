package boj_10816_NumCard;

import java.util.Scanner;

public class Main_ch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();    // N: 상근이가 가진 카드 개수
        int offset = 10000000;   // offset: 음수 인덱스 보정용
        int[] count = new int[20000001];   // count: -10,000,000 ~ 10,000,000 까지의 카운팅 리스트

        // 1. 상근이가 가진 카드 입력받아서 개수 카운팅
        for (int i = 0; i < N; i++) {
            int card = sc.nextInt();
            count[card + offset]++;
        }

        int M = sc.nextInt();    // M: 확인할 카드 개수
        StringBuilder sb = new StringBuilder();   // sb: 출력할 문자열들을 저장할 버퍼(리스트 같은거)

        // 2. 확인할 카드들을 입력받고 개수 확인
        for (int i = 0; i < M; i++) {
            int num = sc.nextInt();   // num: 확인할 카드 숫자
            sb.append(count[num + offset]);
            if (i < M - 1) { // 마지막 카드가 아니라면만 공백 추가
                sb.append(" ");
            }
        }

        // 3. 출력
        System.out.println(sb.toString());
    }
}
