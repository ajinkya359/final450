package Array;

import java.util.HashMap;

public class Q26 {
	
	static boolean find3Numbers(int[] arr,int n,int x)
	{
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++) {
			if(map.get(arr[i])==null)
				map.put(arr[i], 1);
			else map.put(arr[i], map.get(arr[i])+1);
		}
		
		for(int i=0;i<n;i++)
		{
			for (int j=i+1;j<n;j++)
			{
				int need=x-arr[i]-arr[j];
				if(map.get(need)!=null) {
					int temp=0;
					if(arr[i]==need) temp++;
					if(arr[j]==need) temp++;
					if(map.get(need)>temp)return true;
				}
			}
		}
		return false;
		
	}
	
	public static void main(String[] args){
		
	}	
}
