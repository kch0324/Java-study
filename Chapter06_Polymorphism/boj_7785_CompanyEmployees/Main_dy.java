package boj_7785_CompanyEmployees;

import java.io.*;
import java.util.*;

public class Main_dy {
	    public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(br.readLine());

	        HashSet<String> set = new HashSet<>();

	        for (int i = 0; i < n; i++) {
	            String[] log = br.readLine().split(" ");
	            String name = log[0];
	            String status = log[1];

	            if (status.equals("enter")) {
	                set.add(name);
	            } else {
	                set.remove(name);
	            }
	        }

	        // 리스트로 변환 후 정렬
	        List<String> result = new ArrayList<>(set);
	        Collections.sort(result, Collections.reverseOrder());

	        for (String name : result) {
	            System.out.println(name);
	        }
	    }
	}

