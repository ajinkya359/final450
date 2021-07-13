package Array;

import java.util.Arrays;

public class Q19 {
	static void reverseArray(int[] arr)
    {
    	int i=0,j=arr.length-1;
    	while(i<j)
    	{
    		int temp=arr[i];
    		arr[i]=arr[j];
    		arr[j]=temp;
    		i++;
    		j--;
    	}
    }
	static void rearrangeArray(int[] arr)
	{
		int positive=0,negative=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=0)
				positive++;
			else negative++;
		}
		
		if(positive>negative)
		{
			Arrays.sort(arr);
			int j=negative;
			for(int i=0;i<negative;i++)
			{
				if(i%2!=0)
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					j++;
				}
			}
		}
		else {
			reverseArray(arr);
			int j=positive;
			for(int i=0;i<positive;i++)
			{
				if(i%2==0)
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					j++;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr={1, 2, 3, -4, -1, 4,-1,-1,-1};
		rearrangeArray(arr);
		MyUtils.ArrayMethods.printArray(arr);
	}
}
