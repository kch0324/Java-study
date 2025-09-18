package boj_1181_SortWord;

import java.util.*;

public class Main_ch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. �ܾ� ���� �Է�
        int N = sc.nextInt();

        // 2. HashSet���� �ߺ� ����
        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(sc.next()); // �ߺ��� �ڵ����� ���ŵ�
        }

        // 3. Set �� �迭 �Ǵ� ����Ʈ�� ��ȯ
        String[] arr = set.toArray(new String[0]);

        // 4. ����: ���� �� ������
        Arrays.sort(arr, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);   // ���̰� ������ ������
            }
            return a.length() - b.length(); // ª�� �� ������
        });

        // 5. ���
        for (String word : arr) {
            System.out.println(word);
        }
    }
}