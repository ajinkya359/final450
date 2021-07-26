package Array;

import java.util.Arrays;

public class Q14 {

	public void nextPermutation(int[] nums)
	{
		if(nums.length<=1) return;
		int index=nums.length-1;
		for(int i=nums.length-1;i>=0;i--)
		{
			if(nums[i]<nums[index])
			{
				int temp=nums[index];
				nums[index]=nums[i];
				nums[i]=temp;
				return ;
				
			}
		}
		Arrays.sort(nums);
	}
	
}
