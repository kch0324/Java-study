package boj_10814_AgeSort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


class Member {
	int age;
	String name;
	
	public Member(int age, String name) {
		this.age = age;
		this.name = name;
	}
}


public class Main_ay {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		List<Member> members = new ArrayList<>();
		
		for (int i=0; i <N; i++) {
			String[] input = br.readLine().split(" ");
			int age = Integer.parseInt(input[0]);
			String name = input[1];
			members.add(new Member(age, name));
		}
		
		Collections.sort(members, (m1, m2) -> m1.age - m2.age);
		
		StringBuilder sb = new StringBuilder();
		for (Member m : members) {
			sb.append(m.age).append(" ").append(m.name).append("\n");
		}
		
		System.out.print(sb);
		
	}

}
