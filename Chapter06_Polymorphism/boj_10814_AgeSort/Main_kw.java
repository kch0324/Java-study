package boj_10814_AgeSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 클래스 생성
class Person {
	int age;
	String name;
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
}

public class Main_kw{
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		List<Person> people = new ArrayList<>(n);
		
		// name, age 를 받아서 저장
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int age = Integer.parseInt(st.nextToken());
			
			String name = st.nextToken();
			
			people.add(new Person(age, name));
		}
		
		// 나이 순으로 정렬
		people.sort(Comparator.comparingInt(p -> p.age));
		
		for (Person p : people) {
			System.out.println(p.age + " " + p.name);
		}
	}
}
