package boj_2292_HoneyComb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_jy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int t = 0;

        while (T > 0) {
        	if (t == 0) {
        		T -= ++t;
        	}
        	else {
            T -= 6 * t++;
            }
        }
        System.out.print(t);
    }
}