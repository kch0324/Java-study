package boj_10926_QuestionMark;

import java.util.Scanner;


class Str {
	public String[] sum(String[] arr, String str) {
			arr[0] = str;
			arr[1] = "??!";
		return arr;
}
}
public class Main_ay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String surprise = sc.nextLine();
		String[] arr = new String [2];
		
		Str s = new Str();
		String[] result = s.sum(arr, surprise);
		
		System.out.println(result[0]+result[1]);
		
		
	}
}