package boj_10814_AgeSort;

import java.util.*;  // Arrays, Comparator 사용

class Person_ch {
    // 필드
    String name;
    int age;
    int order; // 입력 순서

    // 생성자
    Person_ch(int age, String name, int order) {
        this.age = age;
        this.name = name;
        this.order = order;
    }
}

public class Main_ch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 사람 수 입력
        int N = sc.nextInt();
        Person_ch[] arr = new Person_ch[N]; // 객체 배열 선언

        // 2. 입력받아서 Person_ch 객체 생성 후 배열에 저장
        for (int i = 0; i < N; i++) {
            int age = sc.nextInt();
            String name = sc.next();
            arr[i] = new Person_ch(age, name, i); // order = 입력순서
        }

        // 3. 나이 오름차순으로 정렬, 나이가 같으면 먼저 입력된 사람 순으로 정렬
        Arrays.sort(arr, new Comparator<Person_ch>() {
        	@Override
            public int compare(Person_ch p1, Person_ch p2) {
                if (p1.age == p2.age) {
                    // 나이가 같으면 먼저 입력된 사람이 앞으로
                    return p1.order - p2.order;
                }
                // 나이 작은 사람이 앞으로
                return p1.age - p2.age;
            }
        });

        // 4. 출력
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i].age + " " + arr[i].name);
        }
    }
}
