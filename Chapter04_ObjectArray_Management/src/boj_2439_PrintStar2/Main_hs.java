package boj_2439_PrintStar2;

import java.util.Scanner;


public class Main_hs{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        String[] arr = new String[n];
        
        for (int i = 0; i < n; i++){
            arr[i] = " ".repeat(n-1-i) + "*".repeat(i+1);
        }
        for (String s : arr){
            System.out.println(s);
        }
    }
}
