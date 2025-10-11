package boj_7785_CompanyEmployees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main_kw {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		// set 의 삽입 삭제는 평균 O(1), hash set 이라 해시 충돌이 많으면 O(N) 이 될 수 있음.
		Set<String> se = new HashSet<>();
		
		// 저장과 삭제
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String name = st.nextToken();
			String comeAndGo = st.nextToken();
			
			if (comeAndGo.equals("enter"))
				se.add(name);
			else {
				se.remove(name);
			}
		}
		
		// list 로 변환 후 역순으로 정렬
		List<String> arr = new ArrayList<>(se);
		Collections.sort(arr, Collections.reverseOrder());
		for (String s : arr) {
			System.out.println(s);
		}
	}
}
