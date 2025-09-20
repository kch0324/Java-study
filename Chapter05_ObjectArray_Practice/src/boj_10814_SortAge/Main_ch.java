package boj_10814_SortAge;

import java.util.Scanner;
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
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i].age > arr[j].age) {
                    // 나이 작은 사람이 앞으로
                    Person_ch temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } else if (arr[i].age == arr[j].age) {
                    if (arr[i].order > arr[j].order) {
                        // 나이가 같으면 먼저 입력된 사람이 앞으로
                        Person_ch temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }

        // 4. 출력
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i].age + " " + arr[i].name);
        }
    }
}