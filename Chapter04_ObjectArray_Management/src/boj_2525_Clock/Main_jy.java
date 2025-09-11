package boj_2525_Clock;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_jy {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(br.readLine());
		
		b += c;
		
		if (b>=60) {
			a = a + b/60;
			b = b % 60;
		}
		
		if (a>=24) {
			a = a%24;
			}
		
		System.out.print(a);
		System.out.print(" ");
		System.out.print(b);

		}

	}
