package boj_10825_SubjectSort;

import java.util.*;
import java.io.*;

public class Main_hs {
	static class Student {
		String name;
		int korean, english, math;
		Student(String name, int korean, int english, int math) {
			this.name = name;
			this.korean = korean;
			this.english = english;
			this.math = math;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		List<Student> answer = new ArrayList<>();
		
		for (int t = 0; t < N; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int k = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			answer.add(new Student(name, k, e, m));
		}
			
		answer.sort((p1, p2) -> {
		    if (p1.korean != p2.korean) return p2.korean - p1.korean;
		    if (p1.english != p2.english) return p1.english - p2.english;
		    if (p1.math != p2.math) return p2.math - p1.math;
		    return p1.name.compareTo(p2.name);
		});
		
		for (Student s : answer) {
			bw.write(s.name);
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		}
	}