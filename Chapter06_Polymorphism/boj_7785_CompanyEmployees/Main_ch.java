package boj_7785_CompanyEmployees;

import java.util.*;

public class Main_ch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 기록 개수 입력
        int N = sc.nextInt();

        // 2. 회사 안에 있는 사람들을 저장할 Set
        Set<String> people = new HashSet<>();

        // 3. 출입 기록 입력
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            String status = sc.next();

            // enter면 추가, leave면 삭제
            if (status.equals("enter")) {
                people.add(name);
            } else {
                people.remove(name);
            }
        }

        // 4. HashSet을 리스트로 변환 후 사전 역순 정렬
        List<String> list = new ArrayList<>(people);
        Collections.sort(list, Collections.reverseOrder());

        // 5. 결과 출력
        for (String name : list) {
            System.out.println(name);
        }
    }
}
