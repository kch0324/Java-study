package boj_15596_SumN;

public class Main_kw {

	public class Test {
		long sum(int[] a)
		{
			long nums = 0;
			
			for (int n : a)
			{
				nums += n;
			}
			return nums;
		}
	}
}
