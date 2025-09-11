package boj_10872_Factorial;

import java.util.Scanner;

class Fact {
	int num;
	// 생성자
	Fact(int num) {
		this.num = num;
	}
	// 메서드
	int getFact() {
		int result = 1;
		for (int i = 2; i <= num; i++) {
			result *= i;
		}
		return result;
	}
	
}
	

public class Main_ch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();	// N: N팩토리얼 
        
        Fact A = new Fact(N);	// 인스턴스 생성
        
        System.out.println(A.getFact());

    }
} 