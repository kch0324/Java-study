package boj_2525_Clock;
import java.util.Scanner;

public class Main_dy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int need = sc.nextInt();
		int n_h = 0;
		int n_m = 0;
		
		n_h = need / 60;
		n_m = need % 60;
		
		hour = hour + n_h;
		min = min + n_m;
		
		if(min >= 60) {
			hour = hour + (min/60);
			min = min % 60;
		}
		
		if (hour >= 24) {
			hour = hour % 24;
		}
		
		System.out.println(hour+" "+min);

	}

}
