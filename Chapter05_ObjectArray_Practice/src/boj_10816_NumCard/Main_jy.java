package boj_10816_NumCard;

import java.io.*;
import java.util.*;

public class Main_jy {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] arr1 = new int[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()); //  여기서 새로 만들어야 함...
        int[] arr2 = new int[M];
        for (int j = 0; j < M; j++) {
            arr2[j] = Integer.parseInt(st.nextToken());
        }
        
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int key : arr1) {
            count.put(key, count.getOrDefault(key, 0) + 1);
        }
        
        StringBuilder sb = new StringBuilder();
        for (int q : arr2) {
            sb.append(count.getOrDefault(q, 0)).append(" ");
        }
        
        System.out.println(sb);
    }
}
