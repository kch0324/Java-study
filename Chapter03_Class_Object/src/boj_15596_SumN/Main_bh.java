package boj_15596_SumN;

import java.util.Scanner;

public class Main_bh {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		

	}
}

class Test {
    long sum(int[] a) {
        long ans = 0;
        
        for (int i = 0; i < a.length; i++) {
			ans += a[i];
		}
        return ans;
    }
}