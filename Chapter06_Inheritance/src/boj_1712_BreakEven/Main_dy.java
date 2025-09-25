package boj_1712_BreakEven;

import java.io.*;
import java.util.StringTokenizer;

public class Main_dy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		//고정비용
		int a = Integer.parseInt(st.nextToken());
		//가변비용
		int b = Integer.parseInt(st.nextToken());
		//판매비용
		int c = Integer.parseInt(st.nextToken());
		
		//판매 개수
		int n = 0;
		
		//가변 비용보다 판매비용이 작거나 같면 손익분기점은 존재 x
		if (b>=c) {
			bw.write("-1");
		}
		else {
			//손익분기점은 a/(c-b), 이익이 난 순간 = 손익분기점 + 1
			n = a/(c-b) + 1;
			bw.write(String.valueOf(n));
			}
		bw.flush();
		}
		
		
		
		
	}
