package boj_1193_Fraction;

import java.io.*;
import java.util.StringTokenizer;

public class Main_dy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		//입력값 x
		int x = Integer.parseInt(bf.readLine());
		
		//몇번째 대각선
		int line = 1;
		//해당 대각선에서 몇번째에 위치
		int num = 0;
		int n = 0;
		//x가 몇번째 대각선에 있는지 계산
		while(true) {
			for (int i=0; i<line; i++) {
				n += 1;
				if(n==x) {
					num = i;
					break;
				}
			}
			if(n==x) {
				break;
			}
			line += 1;
		}
		
		int deno = 1;
		int nume = line;
		
		//짝수번째 대각선이라면
		if (line%2==0) {
			//분모 denominator
			deno = 1;
			//분자 numerator
			nume = line;
			for (int i = 0; i < num; i++) {
				deno += 1;
				nume -= 1;
			}
		}
		else {
			deno = line;
			nume = 1;
			for (int i = 0; i < num; i++) {
				deno -= 1;
				nume += 1;
		}
    }
		bw.write(deno+"/"+nume);
        bw.flush();
        bw.close();
}
	
}