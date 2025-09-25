package boj_1193_Fraction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_jy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int t = 1;

        while (T > t) {
            T -= t++;
            }

        if (t%2 != 0) {
        System.out.print((t+1-T) + "/" + T);
        } else {
        System.out.print(T + "/" + (t+1-T));
        }
    }
}