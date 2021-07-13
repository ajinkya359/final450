package Array;


import MyUtils.ArrayMethods;

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        int[] a= ArrayMethods.takeInput();
        int[] b=ArrayMethods.takeInput();
        System.out.println(doUnion(a,a.length,b,b.length));
    }
    public static int doUnion(int []a, int n, int[] b, int m)
    {
        int result=0;
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0;
        while(i<n&&j<m)
        {
            if(a[i]==b[j])
            {
                int temp=a[i];
                result++;
//                System.out.println("For: "+temp);
                while(i<n&&a[i]==temp) i++;
                while(j<m&&b[j]==temp) j++;
            }
            else if (a[i]<b[j]){
                int temp=a[i];
                result++;
//                System.out.println("For: "+temp);
                while (i<n&&a[i]==temp) {
                    i++;
                }
            }
            else{
                int temp=b[j];
//                System.out.println("For: "+temp);
                result++;
                while (j<m&&b[j]==temp) {
                    j++;
                }
            }
        }
        while(i<n)
        {
            --j;
            if(a[i]==b[j]){
                i++;
                continue;
            }
            int temp=a[i];
            while (i<n&&a[i]==temp) {
//                System.out.println("For: "+temp);
                result++;
                i++;
            }
        }
        while (j<m)
        {
            --i;
            if(a[i]==b[j]){
                j++;
                continue;
            }
            int temp=b[j];
            while (j<m&&b[j]==temp) {
//                System.out.println("For: "+temp);
                result++;
                j++;
            }
        }
        return result;
    }
}
