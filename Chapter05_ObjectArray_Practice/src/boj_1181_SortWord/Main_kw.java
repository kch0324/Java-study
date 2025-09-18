package boj_1181_SortWord;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main_kw {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Set<String> set = new HashSet<>();
		
		for(int i = 0; i < n; i++) {
			set.add(br.readLine());
		}
		
		List<String> li = new ArrayList<>(set);
		
		li.sort((a, b) -> {
			if (a.length() == b.length()) {
		        return a.compareTo(b); // 길이가 같다면 알파벳순으로
		    }
		    return a.length() - b.length();
		});
		
		for (String s : li) {
			System.out.println(s);
		}
	}

}