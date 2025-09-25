package boj_1193_Fraction;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
	static int[] find_fountain(int k) {
		int n = 1;
		int num = 0;
		
		while (num < k) {
			num += n;
			n++;
		}
		
		n--;
		num = num - n + 1;
		
		int y = 0, x = 0;
		
		if (n % 2 == 0) {
			y = 1;
			x = n;
		}
		else {
			y = n;
			x = 1;
		}
		
		while(num != k) {
			if (n % 2 == 0) {
				y++;
				x--;
			}
			else {
				y--;
				x++;
			}
			num++;
		}
		return new int[] {y, x};
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int k = Integer.parseInt(st.nextToken());
		
		int[] res = find_fountain(k);
		int y = res[0];
		int x = res[1];
		
		System.out.println(y + "/" + x);
	}
}

