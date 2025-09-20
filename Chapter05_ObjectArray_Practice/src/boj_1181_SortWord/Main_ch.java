package boj_1181_SortWord;

import java.util.*;

public class Main_ch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 단어 개수 입력
        int N = sc.nextInt();

        // 2. HashSet으로 중복 제거
        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(sc.next()); // 중복은 자동으로 제거됨
        }

        // 3. Set → 배열 또는 리스트로 변환
        String[] arr = set.toArray(new String[0]);

        // 4. 정렬: 길이 → 사전순
        Arrays.sort(arr, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);   // 길이가 같으면 사전순
            }
            return a.length() - b.length(); // 짧은 게 앞으로
        });

        // 5. 출력
        for (String word : arr) {
            System.out.println(word);
        }
    }
}