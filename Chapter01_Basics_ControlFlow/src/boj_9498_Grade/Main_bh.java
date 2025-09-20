package boj_9498_Grade;

import java.util.Scanner;

public class Main_bh {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        while(score < 0 || score > 100){
            System.out.println("시험 점수는 0~100 사이 입니다.");
            score = sc.nextInt();
        }
        
        if(score >= 90){
            System.out.println("A");
        }else if(score >= 80){
            System.out.println("B");
        }else if(score >= 70){
            System.out.println("C");
        }else if(score >= 60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
	}
}
