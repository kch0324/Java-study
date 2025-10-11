package boj_10814_AgeSort;

import java.util.*;
import java.io.*;

// # person 클래스 생성, 인자는 나이, 이름, 인덱스 번호
class Person {
	int age;
	String name;
	int idx;
	Person(int age, String name, int idx) {
		this.age = age;
		this.name = name;
		this.idx = idx;
	}
}

public class Main_hs {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		# Person 객체를 담는 리스트 생성
		int n = Integer.parseInt(br.readLine());
		List<Person> people = new ArrayList<>();
		
//		# N개의 줄에 따라서 한 줄씩 input 배열에 넣은 후, age, name, i를 Person 객체로 저장
		for (int i = 0; i < n; i++) {
			String[] input = br.readLine().split(" ");
			int age = Integer.parseInt(input[0]);
			String name = input[1];
			people.add(new Person(age, name, i));
		};
		
		
//		# 나이순 → 같으면 입력순(idx) 정렬
		people.sort((a, b) -> {
			if (a.age != b.age) {
				return a.age - b.age;
			}
			return a.idx - b.idx;
		});
	
		StringBuilder sb = new StringBuilder();
		for (Person p : people) {
			sb.append(p.age).append(" ").append(p.name).append("\n");
		}
		System.out.println(sb);
	}

}
