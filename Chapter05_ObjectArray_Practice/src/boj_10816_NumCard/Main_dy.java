package boj_10816_NumCard;

import java.io.*;
import java.util.*;

public class Main_dy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        //0과 양수 카운팅 배열
        int[] p_lst = new int[10000001];
        //음수 카운팅 배열
        int[] n_lst = new int[10000001];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int card = Integer.parseInt(st.nextToken());
            if (card >= 0) p_lst[card]++;
            else n_lst[-card]++;
        }
        
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num >= 0) bw.write(p_lst[num] + " ");
            else bw.write(n_lst[-num] + " ");
        }
        bw.flush();
    }
}