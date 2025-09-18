package boj_1181_SortWord;

import java.io.*;
import java.util.*;

public class Main_dy {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        //중복제거를 위해 set 사용
        HashSet<String> set = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
        	set.add(br.readLine());
        	
        }
        
        //set에서 정렬을 위해 리스트로 변환
        String[] arr = set.toArray(new String [0]);
        
        //문자열 길이순
        Arrays.sort(arr, Comparator.comparingInt(String::length)
        		//사전순
        		.thenComparing(Comparator.naturalOrder()));
        
        for (String a : arr) bw.write(a + "\n");
        bw.flush();
}
}
