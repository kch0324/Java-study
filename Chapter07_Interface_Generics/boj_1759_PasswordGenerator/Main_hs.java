package boj_1759_PasswordGenerator;

import java.util.*;
import java.io.*;

public class Main_hs {
	static final Set<String> vowels = Set.of("a", "e", "i", "o", "u");
	
	public static void recurr (String[] arr, int index, int l, int c, List<String> log, BufferedWriter bw) throws IOException {
		if (log.size() == l ) {
			int count_a = 0;
			int count_b = 0;
			for (String word : log) {
				if (vowels.contains(word)) {
					count_a++;
				}
				else {
					count_b++;
				}
			}
			if (count_a >= 1 && count_b >= 2) {
				bw.write(String.join("", log) + "\n");
				return;
			}
		}
		
		for (int i = index; i < c; i++) {
			log.add(arr[i]);
	        recurr(arr, i + 1, l, c, log, bw);  
	        log.remove(log.size() - 1);
			}
		}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int L = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		String[] test_arr = br.readLine().split(" ");
		Arrays.sort(test_arr);
		recurr(test_arr, 0, L, C, new ArrayList<>(), bw);
		bw.flush();
		bw.close();
	}
}
