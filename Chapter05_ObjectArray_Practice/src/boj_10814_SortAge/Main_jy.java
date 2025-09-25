package boj_10814_SortAge;

import java.io.*;
import java.util.*;

public class Main_jy {
    static class Member {
        int age;
        String name;
        int index; // 입력 순서

        Member(int age, String name, int index) {
            this.age = age;
            this.name = name;
            this.index = index;
        }
    }

    public static void main(String[] args) throws IOException {
    	// 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        List<Member> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            list.add(new Member(age, name, i));
        }

        // 나이 기준 정렬
        list.sort((a, b) -> {
        	// 나이가 같을 경우 먼저 가입한 순서대로
            if (a.age == b.age) {
                return Integer.compare(a.index, b.index);
            }
            return Integer.compare(a.age, b.age);
        });

        for (Member m : list) {
            sb.append(m.age).append(" ").append(m.name).append("\n");
        }

        System.out.print(sb);
    }
}
