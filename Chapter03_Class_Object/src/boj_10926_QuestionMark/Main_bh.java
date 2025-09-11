package boj_10926_QuestionMark;

import java.util.Scanner;

public class Main_bh {

	public static void main(String[] args) {
		String prev_id = "";
		Scanner sc = new Scanner(System.in);
		String try_id = sc.nextLine();
		prev_id = try_id;
		
		if(try_id.equals(prev_id)) {
			System.out.println(try_id+"??!");
		}
	}
}
