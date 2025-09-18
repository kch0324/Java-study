package boj_10814_SortAge;

import java.util.Arrays;
import java.util.Scanner;



public class Main_ay {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] ages = new int[N];
		String[] names = new String[N];
		Integer[] idx = new Integer[N];
		
		for (int i=0; i < N ; i++) {
			
			ages[i] = sc.nextInt();
			names[i] = sc.next(); 
			idx[i] = i;
			
		}
		
		Arrays.sort(idx, (i, j) -> {
			if(ages[i] != ages[j]) {
				return ages[i] - ages[j];
			} else {
				return i - j;
			}
		});
		for (int i = 0; i < N; i++) {
            System.out.println(ages[idx[i]] + " " + names[idx[i]]);
        }
		
		}

}
