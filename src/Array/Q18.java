package Array;

import java.util.ArrayList;

public class Q18 {
	static ArrayList<Integer>commonElements(int[] a,int[] b,int[] c,int n1,int n2,int n3)
	{
		ArrayList<Integer> ans=new ArrayList<>();
		ArrayList<Integer> temp=new ArrayList<>();
//		System.out.println("I am  here");
		int i=0,j=0;
		while(i<n1 && j<n2) {
//			System.out.println("a[i]:"+a[i]+" b[j]: "+b[j]);
			while(i<n1-1&&a[i]==a[i+1])
				i++;
			while(j<n2-1&&b[j]==b[j+1])
				j++;
			if(a[i]==b[j]) {
				temp.add(a[i]);
				i++;
				j++;
			}
			else if(a[i]<b[j])
				i++;
			else j++;
		}
//		while(i<n1)
//		{
//			while(i<n1-1&&a[i]==a[i+1])
//				i++;
//			temp.add(a[i]);
//			i++;
//		}
//		while(j<n2)
//		{
//			while(j<n2-1&&b[j]==b[j+1])
//				j++;
//			
//			temp.add(b[j]);
//			j++;
//		}
//		System.out.println("Temp size: "+temp.size());
		i=0;
		j=0;
		while(i<temp.size()&&j<n3)
		{
			while(j<n3-1&&c[j]==c[j+1])
			{
				j++;
			}
			if(temp.get(i)==c[j]) {
				ans.add(temp.get(i));
			i++;
			j++;
			}
			else if(temp.get(i)<c[j]) i++;
			else j++;
		}
//		System.out.println("Out of the fn");
	
		return ans;
	}
	public static void main(String[] args) {
		int n1=6,n2=5,n3=8;
		int[]A = {1, 5, 10, 20, 40, 80};
		int[] B = {6, 7, 20, 80, 100};
		int[]  C = {3, 4, 15, 20, 30, 70, 80, 120};
		ArrayList<Integer> arr=commonElements(A, B, C, n1, n2, n3);
		System.out.println("Size: "+arr.size());
		for(int x:arr)
			System.out.print(x+" ");
		System.out.println();
	}
}
