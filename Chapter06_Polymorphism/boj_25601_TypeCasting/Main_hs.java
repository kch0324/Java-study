package boj_25601_TypeCasting;

import java.util.*;
import java.io.*;

public class Main_hs {
	static class TypeCasting {
		public String solve(String a, String b, Map<String, String> map) {
			String origin_a = a;
			String origin_b = b;
			while (map.containsKey(a) && !a.equals(map.get(a))) {
				a = map.get(a);
				if (a.equals(origin_b)) {
					return "1";
				}
			
			}
			while (map.containsKey(b) && !b.equals(map.get(b))) {
				b = map.get(b);
				if (b.equals(origin_a)) {
					return "1";
				}
			
			}
			return "0";
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		Map<String, String> casting = new HashMap<>(); 
		
		for (int i = 0; i < N-1 ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String child = st.nextToken();
			String par = st.nextToken();
			casting.put(child, par);
		}
		StringTokenizer st = new StringTokenizer(br.readLine());
		String A = st.nextToken();
		String B = st.nextToken();
		
		TypeCasting result = new TypeCasting();
		
		String answer = result.solve(A, B, casting);
		
		bw.write(answer);
		
		bw.flush();
		bw.close();
		}
	}

