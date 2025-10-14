package boj_1920_GenericBinarySearch;

import java.util.*;
import java.io.*;


public class Main_hs {
	
	public static boolean binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == target) {
				return true;
			}
			else if (arr[mid] < target) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		return false;
	}
	
//	public static <T extends Comparable<T>> boolean binarySearch(T[] arr, T target) {
//        int left = 0;
//        int right = arr.length - 1;
//
//        while (left <= right) {
//            int mid = (left + right) / 2;
//            int cmp = arr[mid].compareTo(target);
//
//            if (cmp == 0) return true;
//            else if (cmp < 0) left = mid + 1;
//            else right = mid - 1;
//        }
//        return false;
//    }

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr_A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		Arrays.sort(arr_A);
		
		int M = Integer.parseInt(br.readLine());
		int[] test_arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	
		for (int target : test_arr) {
			if (binarySearch(arr_A, target)) {
				bw.write("1\n");
			}
			else {
				bw.write("0\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
