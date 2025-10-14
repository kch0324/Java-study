package boj_9012_ParenthesesValidator;

import java.util.*;
import java.io.*;

public class Main_hs {
	public static boolean parenthesesValidator (String target) {
		Deque<Character> stack = new ArrayDeque<>();
        
		for (char ch : target.toCharArray()) {
			if (ch == '(') {
				stack.addFirst(ch);
			}
			else if (ch == ')') {
				if (stack.isEmpty()) {
					return false;
				}
				stack.pollFirst();
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t < T+1; t++) {
			String test = br.readLine();
			
			if (parenthesesValidator(test)) {
				bw.write("YES");
				bw.newLine();
			}
			else {
				bw.write("NO");
				bw.newLine();
			}
		}
		bw.flush();
		bw.close();
	}
}
