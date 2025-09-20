package boj_10872_Factorial;
import java.util.*;

public class Main_jy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 1;
		
		while (a>0) {
			b *= a--;
		}
		
		System.out.println(b);
	}
}