package boj_10814_SortAge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 패키지 안에 같은 이름의 클래스가 있으면 오류가 나서 Person 1 로 만듦
class Person1 {
	int age;
	String name;
	
	public Person1(int age, String name) {
		this.age = age;
		this.name = name;
	}
}

public class Main_kw {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		List<Person1> people = new ArrayList<>(n);
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int age = Integer.parseInt(st.nextToken());
			
			String name = st.nextToken();
			
			people.add(new Person1(age, name));
		}
		
		// comparingInt 는 정수값을 기준으로 객체를 비교. 람다식, p 를 받아서 p.age 를 기준으로 비교함
		people.sort(Comparator.comparingInt(p -> p.age));
		
		for (Person1 p : people) {
			System.out.println(p.age + " " + p.name);
		}
	}
}
