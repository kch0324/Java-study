package boj_11659_PrefixSum;
import java.util.Scanner;

public class Main_dy {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int sum = 0;
		int[] arr = new int[n+1];
		
		for (int i = 1; i <= n; i++) {
			int j = scanner.nextInt();
			arr[i] = arr[i-1] + j;
			
	}
		
		for (int k = 0; k < m; k++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt(); 
			
			System.out.println(arr[b]-arr[a-1]);
		}	

	}

}
