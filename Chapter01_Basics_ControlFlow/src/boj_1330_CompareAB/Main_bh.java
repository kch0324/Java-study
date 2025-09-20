package boj_1330_CompareAB;

import java.util.Scanner;

public class Main_bh {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        while(A < -10000){
            System.out.println("-10,000 ≤ A");
            A = sc.nextInt();
        }
        
        int B = sc.nextInt();
        while(B > 10000){
            System.out.println("B ≤ 10,000");
            B = sc.nextInt();
        }
        
        if(A == B){
            System.out.println("==");
        }else if(A > B){
            System.out.println(">");
        }else{
            System.out.println("<");
        }

	}

}
