package boj_10825_SubjectSort;
import java.util.*;

class Student_dy {
    String name;
    int korean, english, math;

    public Student_dy(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }


public class Main_dy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Student_dy> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
        	list.add(new Student_dy (sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }

        list.sort((a, b) -> {
            if (a.korean != b.korean) return b.korean - a.korean;        // 국어 내림차순
            if (a.english != b.english) return a.english - b.english;    // 영어 오름차순
            if (a.math != b.math) return b.math - a.math;                // 수학 내림차순
            return a.name.compareTo(b.name);                             // 이름 오름차순
        });

        StringBuilder sb = new StringBuilder();
        for (Student_dy s : list) {
            sb.append(s.name).append('\n');
        }

        System.out.print(sb);
    }
}
}

