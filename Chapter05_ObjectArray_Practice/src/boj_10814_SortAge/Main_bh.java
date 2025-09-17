package boj_10814_SortAge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

class Person_bh {
	private int join; // 가입순번
	private int age;
	private String name;
	
	public Person_bh() {}

	public Person_bh(int join, int age, String name) {
		super();
		this.join = join;
		this.age = age;
		this.name = name;
	}

	public int getJoin() {
		return join;
	}


	public void setJoin(int join) {
		this.join = join;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return age+" "+name;
	}
}

public class Main_bh {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		// 사람의 수 n만큼 class Person을 만들어 배열로 생성
		
		Person_bh[] arr = new Person_bh[n];
		for(int i = 0; i < n; i++) {
			String[] input = br.readLine().split(" ");
			// 배열 안의 각 요소는 null 상태 (즉, Person_bh 객체가 아직 없음)
			arr[i] = new Person_bh(i, Integer.parseInt(input[0]),input[1]);
//			arr[i].setJoin(i+1);
//			arr[i].setAge(Integer.parseInt(input[0]));
//			arr[i].setName(input[1]);
		}		
		
		Arrays.sort(arr, new Comparator<Person_bh>() {

			@Override
			public int compare(Person_bh p1, Person_bh p2) {
				int result = Integer.compare(p1.getAge(),p2.getAge());
				if(result == 0) {
					result = Integer.compare(p1.getJoin(),p2.getJoin());
				}
				/*
				p1 == p2 일 경우 0 리턴
				p1 < p2  일 경우 음수 리턴
				p1 > p2  일 경우 양수 리턴
				*/
				return result;
			}
		});

		for (Person_bh person : arr) {
			System.out.println(person.toString());
		}

	}

}

