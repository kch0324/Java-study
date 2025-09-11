package boj_11659_PrefixSum;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_jy {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()); //5
		int b = Integer.parseInt(st.nextToken()); //3

		int num[] = new int[a];
		int sum[] = new int[a+1];
		
		st = new StringTokenizer(br.readLine()); //5 4 3 2 1
		for (int i = 0; i < a; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		sum[0] = 0;
		for (int i = 1; i <= a; i++) {
			sum[i] = sum[i-1] + num[i-1];
		}
		
		for (int i = 0; i < b; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			System.out.println(sum[end] - sum[start-1]);
			}

		}

	}