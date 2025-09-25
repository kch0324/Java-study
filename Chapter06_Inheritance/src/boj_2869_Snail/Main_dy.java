package boj_2869_Snail;

//미완성
import java.io.*;
import java.util.StringTokenizer;

public class Main_dy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		//하루(당일~내일 아침) 올라가는 거리 a-b
		//밤 사이에 미끄러지니까 아침에 도착시 더이상 미끄러지지않는다. -1
		
		int day = v/(a-b) - 1;
		bw.write(String.valueOf(day));
}
}
