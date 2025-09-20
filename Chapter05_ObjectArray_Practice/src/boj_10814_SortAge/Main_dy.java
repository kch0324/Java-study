package boj_10814_SortAge;

import java.util.Arrays; 
import java.util.Comparator;
import java.util.Scanner;


class Person_dy{
	//필드
	private int age;
	private String name;
	
	//생성자
	public Person_dy(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	//get 조회
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
	}
	

public class Main_dy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Person_dy[] lst = new Person_dy[n];
		
		for (int i = 0; i < n; i++) {
			lst[i] = new Person_dy(sc.nextInt(), sc.next());
		}
        //정렬
		Arrays.sort(lst, Comparator.comparingInt(Person_dy::getAge));
        
        //출력
		for (Person_dy p:lst) {
			System.out.println(p.getAge()+" "+p.getName());
		}
	}

}