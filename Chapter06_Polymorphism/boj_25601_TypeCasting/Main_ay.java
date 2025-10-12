package boj_25601_TypeCasting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

class Typecasting {
	private final Map<String, String> parent = new HashMap<>();
	
	// 자식, 부모 관계 추가
	public void Edge(String child, String par) {
		parent.put(child, par);
	}
	
	// from이 target의 자손인가? 
	private boolean isAncestor(String from, String target) {
		if (from.equals(target)) return true;
		String cur = from;
		while (parent.containsKey(cur)) {
			cur = parent.get(cur);
			if (cur.equals(target)) return true;
		}
		return false;
	}
	
	public boolean relative(String a, String b) {
		return isAncestor(a, b) || isAncestor(b, a);
	}
}
public class Main_ay {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
		
        Typecasting tc = new Typecasting();
        for (int i=0; i< N-1; i++) {
        	String[] input = br.readLine().split(" ");
        	String child = input[0], par = input[1];
        	tc.Edge(child, par);
        }
        
        String[] last = br.readLine().split(" ");
        String A = last[0], B = last[1];
        
        System.out.println(tc.relative(A, B)? 1:0);
	}

}
