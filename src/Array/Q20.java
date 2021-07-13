package Array;

import java.util.HashSet;
import java.util.Set;

public class Q20 {
	static boolean findsum(int[] arr,int n)
	{
		Set<Integer> set=new HashSet<>();
		
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
			if(arr[i]==0||sum==0||set.contains(sum))
			{
				return true;
			}
			set.add(sum);
		}
		return false;
	}
}
