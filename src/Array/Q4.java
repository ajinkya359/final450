package Array;

import MyUtils.ArrayMethods;

public class Q4 {
    public static void main(String[] args) {
        int[] arr= ArrayMethods.takeInput();
        int[] freq={0,0,0};
        for(int i=0;i<arr.length;i++) freq[arr[i]]++;
        int i=0;
        for(int j=0;j<3;j++)
        {
            for(int k=0;k<freq[j];k++)
                arr[i++]=j;
        }
        ArrayMethods.printArray(arr);
    }
}
