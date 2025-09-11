package boj_11659_PrefixSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_yi {
	static class PlusArr{
        private int[] arr;

        public PlusArr(int[] a){
            int n = a.length;
            arr = new int[n+1];
            arr[0] = 0;
            for (int i = 1; i <= n; i++) {
                arr[i] = a[i-1] + arr[i-1];
            }
        }

        public int calSum(int a, int b){
            return arr[b] - arr[a - 1];
        }
    }


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());   
        }

        PlusArr pa = new PlusArr(arr);

        for (int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(pa.calSum(a, b));
        }
    }
} 