package boj_25601_TypeCasting;

import java.util.*;

public class Main_ch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 클래스 개수 입력
        int N = sc.nextInt();

        // 각 클래스의 부모 정보를 저장 (자식 → 부모)
        Map<String, String> graph = new HashMap<>();

        // 상속 관계 입력
        for (int i = 0; i < N - 1; i++) {
            String parent = sc.next();
            String child = sc.next();
            graph.put(child, parent);
        }

        // 비교할 두 클래스 입력
        String A = sc.next();
        String B = sc.next();

        // 두 클래스가 상속 관계에 있는지 확인
        boolean connected = false;

        // A 기준으로 부모를 계속 따라 올라가면서 B가 나오는지 확인
        String cur = A;
        while (graph.containsKey(cur)) {
            cur = graph.get(cur);   // 부모로 이동
            if (cur.equals(B)) {    // B를 만나면 상속 관계 존재
                connected = true;
                break;
            }
        }

        // 반대로 B 기준으로 부모를 따라 올라가면서 A가 나오는지 확인
        String cur2 = B;
        while (graph.containsKey(cur2)) {
            cur2 = graph.get(cur2); // 부모로 이동
            if (cur2.equals(A)) {   // A를 만나면 상속 관계 존재
                connected = true;
                break;
            }
        }

        // 결과 출력
        if (connected) System.out.println(1);
        else System.out.println(0);
    }
}
