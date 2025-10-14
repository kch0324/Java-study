package boj_1966_GenericPrinterQueue;

import java.util.*;
import java.io.*;

public class Main_hs {
	static class Tuple {
	    int priority;
	    int index;

	    Tuple(int priority, int value) {
	        this.priority = priority;
	        this.index = value;
	    }
	}
	
	public static int printer (int[] arr, int n, int m) {
		Queue<Tuple> q = new ArrayDeque<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < n; i++) {
			q.offer(new Tuple(arr[i], i));
			pq.offer(arr[i]);
		}
		
		int order = 1;
		while (!q.isEmpty()) {
			Tuple current = q.poll();
			if (current.priority == pq.peek()) {
				pq.poll();
				if (current.index == m) {
					return order;
				}
				order++;
			}
			else {
				q.offer(current);
			}
		}
		return -1;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t < T+1; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
	        int M = Integer.parseInt(st.nextToken());
	        
	        st = new StringTokenizer(br.readLine());
	        int[] test_arr = new int[N];
	        for (int i = 0; i < N; i++) {
	        	test_arr[i] = Integer.parseInt(st.nextToken());
	        }
			
			int answer = printer(test_arr, N, M);
			bw.write(String.valueOf(answer));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
