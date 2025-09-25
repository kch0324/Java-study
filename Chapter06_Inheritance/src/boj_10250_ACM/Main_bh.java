package boj_10250_ACM;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_bh {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			String[] arr = br.readLine().split(" ");
			int H = Integer.parseInt(arr[0]);
			int W = Integer.parseInt(arr[1]);
			int N = Integer.parseInt(arr[2]);

//			int[][] building = new int[H][W];
			
			int cnt = 0;
			String room = "";
			
			for(int c = 0; c < W; c++) {
				for(int r = 0; r < H; r++) {
					cnt++;
					if(cnt >= N) {
						if(c+1 >= 10) {
							room = (r+1)+""+(c+1);
						}else {
							room = (r+1)+"0"+(c+1);
						}
						break;
					}
				}
				if(cnt >= N) {
					break;
				}
			}
			bw.write(room);
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}