package Array;

public class Q30 {
	public static void threeWayPartition(int[] arr,int a,int b)
	{
		int left=0,right=arr.length-1;
		for(int i=0;i<=right;i++)
		{
			if(arr[i]<a)
			{
				int temp=arr[i];
				arr[i]=arr[left];
				arr[left]=temp;
				left++;
			}
			else if(arr[i]>b)
			{
				int temp=arr[i];
				arr[i]=arr[right];
				arr[right]=temp;
				right--;
				i--;
			}
		}
	}
	public static void main(String[] args) {
		int n = 3; 
		int A[] = {70 ,18 ,18 ,97 ,25 ,44, 71 ,84 ,91};
		threeWayPartition(A, 50,72);
		MyUtils.ArrayMethods.printArray(A);
	}

}
