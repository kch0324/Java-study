package boj_2445_PrintStar8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_yi {
	public void star(int a){
        int starCnt = 1;
        int spaceCnt = 2*a - 2;

        for (int i = 0; i < (2*a) - 1; i++) {
            for (int j = 0; j < starCnt; j++) {
                System.out.print("*");
            }
            for (int j = starCnt; j <= spaceCnt; j++) {
                System.out.print(" ");
            }
            for (int j = spaceCnt; j < 2*a -1; j++) {
                System.out.print("*");
            }
            if (i > a - 1){
                starCnt -= 1;
                spaceCnt += 1;
            }
            if (i < a - 1){
                starCnt += 1;
                spaceCnt -= 1;
            }
            if (i == a - 1){
                starCnt -= 1;
                spaceCnt += 1;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Main_yi m = new Main_yi();
        m.star(n);
    }
} 