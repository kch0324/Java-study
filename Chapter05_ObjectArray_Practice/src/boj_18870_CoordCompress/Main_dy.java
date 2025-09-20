package boj_18870_CoordCompress;

import java.io.*;
import java.util.*;

public class Main_dy {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] lst = new int [n];
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
        	lst[i] = Integer.parseInt(st.nextToken());
        }
        
        //중복 제거 후 정렬
        Set<Integer> set = new HashSet<>();
        for(int x : lst) set.add(x);
        Integer[] s = set.toArray(new Integer[0]);
        Arrays.sort(s);
        
        //딕셔너리같은 key,value로 이뤄진 자료구조
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length; i++) {
        	//숫자, 순위
        	map.put(s[i], i);
        }
        
        for(int i=0; i<n; i++){
            bw.write(map.get(lst[i]) + " ");
        }
        bw.flush();
        }
}