package boj_15596_SumN;

public class Main_hs {
	public static long sum(int[] a) {
        long ans = 0;
        for (int i : a) {
            ans += i;
        }
        return ans;
    }
}	

