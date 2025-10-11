package boj_10825_SubjectSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main_kw {
	// 학생 클래스
	static class Student {
		private String name;
	    private int kor;
	    private int eng;
	    private int math;

	    public Student(String name, int kor, int eng, int math) {
	        this.name = name;
	        this.kor = kor;
	        this.eng = eng;
	        this.math = math;
	    }
	    
	    // 정렬을 위한 getter
	    public String getName() { return name; }
	    public int getKor() { return kor; }
	    public int getEng() { return eng; }
	    public int getMath() { return math; }
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		List<Student> arr = new ArrayList<>();
		
		// 저장
		for (int i = 0; i < N; i++) {
		    StringTokenizer st = new StringTokenizer(br.readLine());	
		    
		    String name = st.nextToken();
			int kor = Integer.parseInt(st.nextToken());
			int eng = Integer.parseInt(st.nextToken());
			int math = Integer.parseInt(st.nextToken());
			
			arr.add(new Student(name, kor, eng, math));
		}
		
		// 정렬. 국어 -> 영어 -> 수학 -> 이름
		// 수학의 경우 thenComparingInt(Student::getMath).reversed() 를 하게 되면 이전까지 비교했던 국어와 영어 모두 내림차순으로 정렬됨
		// 그래서 수학만 내림차순으로 정렬시키기 아래처럼 사용함.
		arr.sort(Comparator.comparingInt(Student::getKor).reversed()
			              .thenComparingInt(Student::getEng)
			              .thenComparing(Comparator.comparingInt(Student::getMath).reversed())
			              .thenComparing(Student::getName));
		
		for (Student s : arr) {
			System.out.println(s.getName());
		}
	}
}
