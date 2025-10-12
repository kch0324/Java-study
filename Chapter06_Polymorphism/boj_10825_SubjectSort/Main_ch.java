package boj_10825_SubjectSort;

import java.util.*;

class Student_ch {
    // 필드
    String name;
    int kor;
    int eng;
    int math;

    // 생성자
    Student_ch(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}

public class Main_ch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 학생 수 입력
        int N = sc.nextInt();
        Student_ch[] arr = new Student_ch[N]; // 객체 배열 선언

        // 2. 입력받아서 Student_ch 객체 생성 후 배열에 저장
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();
            arr[i] = new Student_ch(name, kor, eng, math);
        }

        // 3. 정렬 기준 설정
        Arrays.sort(arr, new Comparator<Student_ch>() {
            @Override
            public int compare(Student_ch s1, Student_ch s2) {
                // 국어 내림차순
                if (s1.kor != s2.kor)
                    return s2.kor - s1.kor;

                // 영어 오름차순
                if (s1.eng != s2.eng)
                    return s1.eng - s2.eng;

                // 수학 내림차순
                if (s1.math != s2.math)
                    return s2.math - s1.math;

                // 이름 사전순 오름차순 (문자열 비교)
                return s1.name.compareTo(s2.name);
            }
        });

        // 4. 이름 출력
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i].name);
        }
    }
}
