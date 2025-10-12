package boj_10825_SubjectSort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


class Member {
	
	String name;
	int language;
	int english;
	int math;
	
	public Member(String name, int language, int english, int math) {
		
		this.name = name;
		this.language = language;
		this.english = english;
		this.math = math;
	}
}


public class Main_ay {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		List<Member> members = new ArrayList<>();
		
		for (int i=0; i <N; i++) {
			String[] input = br.readLine().split(" ");
			
			String name = input[0];
			int language = Integer.parseInt(input[1]);
			int english = Integer.parseInt(input[2]);
			int math = Integer.parseInt(input[3]);
			members.add(new Member(name, language, english, math));
		}
		
		Collections.sort(members, (m1, m2) -> {
			if (m1.language != m2.language)
				return m2.language - m1.language;
			else if (m1.english != m2.english)
				return m1.english - m2.english;
			else if (m1.math != m2.math)
				return m2.math - m1.math;
			else
				return m1.name.compareTo(m2.name);
		});
		
		StringBuilder sb = new StringBuilder();
		for (Member m : members) {
			sb.append(m.name).append("\n");
		}
		
		System.out.print(sb);
		
	}

}
