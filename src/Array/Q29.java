package Array;

public class Q29 {
	public static int sb(int[] a,int n,int x)
	{
		int ans=Integer.MAX_VALUE;
		int temp=0;
		int i=0,j=0;
		while(i<n&&j<n)
		{
			temp+=a[j];
			if(temp>x)
			{
				while(temp-a[i]>x)
				{
					temp-=a[i];
					i++;
				}
				ans=Math.min(ans, j-i+1);
//				i=j;
//				temp=0;
				j++;
			}
			else {
				j++;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int A[] = {1, 4, 45, 6, 0, 19};
		int x  =  51;
		System.out.println(sb(A,A.length,x));
	}

}
