package boj_10250_ACM;

import java.io.*;
import java.util.StringTokenizer;

public class Main_dy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		//테스트 개수
		int T = Integer.parseInt(bf.readLine());
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			//호텔 층 수 
			int H = Integer.parseInt(st.nextToken());
			//각 층의 방 수
			int W = Integer.parseInt(st.nextToken());
			//몇 번째 손님
			int N = Integer.parseInt(st.nextToken());
			
			//층 = N%H, 호수 = N//H
			int floor = N%H;
			//나머지가 0이라면 꼭대기층
			if (floor == 0) {
				floor = H;
			}
			//1~W호수가 존재하기에 + 1
			int room = (N-1)/H + 1;
			


            bw.write(floor + String.format("%02d", room));
            bw.newLine(); //줄바꿈
        }

        bw.flush();
        bw.close();
    }
}