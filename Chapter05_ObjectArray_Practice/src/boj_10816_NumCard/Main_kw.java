package boj_10816_NumCard;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_kw {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n1 = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		
		List<Integer> nums = new ArrayList<>();
		
		for (int i = 0; i < n1; i++) 
			nums.add(Integer.parseInt(st.nextToken()));
		
		// cnt �� ũ�⸦ �˳��� ����
		Map<Integer, Integer> cnt = new HashMap<>(n1 * 2);
        for (int x : nums) {
        	// getOrDefault �� ��ųʸ��� get ó�� x �� �����Ѵٸ� x �� ���� ���, ���ٸ� 0�� ���. 
        	// map �� ����ִ� ���� +1 �� �ؼ� �ٽ� �־���
        	cnt.put(x, cnt.getOrDefault(x, 0) + 1);
        }

        int n2 = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        List<Integer> result = new ArrayList<>(n2);
        
        for (int i = 0; i < n2; i++) {
            int q = Integer.parseInt(st.nextToken());
            result.add(cnt.getOrDefault(q, 0));
        }
		
		for (int n : result) {
			System.out.print(n + " ");
		}
	}
}
