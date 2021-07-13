package Array;

import java.util.Arrays;

public class Q35 {
	static int find_median(int[] v)
    {
        Arrays.sort(v);
        int n=v.length;
        if(n%2!=0) {
        	
        	return v[n/2];
        }
        else {
        	return (v[n/2-1]+v[n/2])/2;
        }
    }
	public static void main(String[] args) {
		int[]arr = {90 ,100 ,78 ,89 ,67};
		System.out.println(find_median(arr));
	}

}
