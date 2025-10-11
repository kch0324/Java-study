package boj_7785_CompanyEmployees;

import java.util.*;
import java.io.*;

public class Main_hs {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		Set<String> employees = new HashSet<>(); 
		
		for (int i = 0; i < N ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String log = st.nextToken();
			
			if (log.equals("enter") ) {
				employees.add(name);
			}
			else {
				employees.remove(name);
			}
		}
		List<String> result = new ArrayList<>(employees); 
		
		result.sort(Collections.reverseOrder());
		
		
		for (String employee : result) {
			bw.write(employee);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		}
	}
