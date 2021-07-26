package Array;

import java.util.HashMap;

public class Q25 {

	static String isSubset(long[] a1,long[] a2,long n,long m)
	{
		HashMap<Long, Integer> map=new HashMap<>();
		for(int i=0;i<m;i++)
			map.put(a2[i], 1);
		for(int i=0;i<n;i++)
		{
			if(map.get(a1[i])!=null)
			{
				map.remove(a1[i]);
			}
			
		}
		if(map.isEmpty())return "Yes";
		else return "No";
	}
	public static void main(String[] args) {
		long a1[] = {10, 5, 2, 23, 19};
		long a2[] = {19, 5, 3};
		System.out.println(isSubset(a1, a2, a1.length, a2.length));
	}
}
