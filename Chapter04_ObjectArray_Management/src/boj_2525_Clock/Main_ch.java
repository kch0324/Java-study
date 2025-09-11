package boj_2525_Clock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_ch {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[2];
        for (int i = 0; i < 2; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int c = Integer.parseInt(br.readLine());
        arr[1] += c;
        if(arr[1]>=60){
            int small = arr[1]%60;
            int big = arr[1]/60;
            arr[0] += big;
            arr[1] = small;
            if (arr[0]>=24){
                arr[0] -= 24;
            }
        }
        System.out.println(arr[0] + " " + arr[1]);
    }
}
