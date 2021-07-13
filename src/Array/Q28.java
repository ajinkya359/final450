package Array;

import java.util.ArrayList;
import java.util.Collections;

public class Q28 {
	
	public static long findMinDiff(ArrayList<Long> a,long n,long m)
	{
			long ans=Long.MAX_VALUE;
			Collections.sort(a);
			for(int i=0;i<a.size()&& i+m-1<n;i++)
			{
				ans=Math.min(ans, a.get((int) (i+m-1))-a.get(i));
			}
			return ans;
	}
	
	
	
	public static void main(String[] args) {
		
	}
}
