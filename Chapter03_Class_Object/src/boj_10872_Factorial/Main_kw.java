package boj_10872_Factorial;

import java.io.*;
import java.util.*;

public class Main_kw {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int result = factorial(n);
		
		System.out.println(result);
	}
	
	public static int factorial(int num)
	{
		if (num <= 1)
			return 1;
			
		return num * factorial(num - 1);
	}
}
