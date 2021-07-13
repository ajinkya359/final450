package MyUtils;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={3412,4124 ,4124,211 ,21 ,-12,12 };
        int number=0;
        int ans=binarySearchRecursive(arr,number);
        System.out.println(ans);
    }
    public static int binarySearchIterative(int[] arr,int number)
    {
        MergeSort.mergeSort(arr, 0, arr.length - 1);
        ArrayMethods.printArray(arr);
        int start=0,last=arr.length-1;
        while(start<=last)
        {
            int pivot=(start+last)/2;
            if(arr[pivot]==number) return pivot;
            else if (arr[pivot]<number) start=pivot+1;
            else last=pivot-1;
        }
        return -1;
    }
    public static int binarySearchRecursive(int[] arr,int number){
        MergeSort.mergeSort(arr, 0, arr.length-1);
        return binarySearchRecursiveHelper(arr, number, 0, arr.length-1);
    }
    public static int binarySearchRecursiveHelper(int[] arr,int number,int start,int last)
    {
        if(start<=last)
        {
            int pivot=(start+last)/2;
            if(arr[pivot]==number) return pivot;
            else if(arr[pivot]<number) return binarySearchRecursiveHelper(arr, number, pivot+1, last);
            else return binarySearchRecursiveHelper(arr, number, start, pivot-1);
        }
        else return -1;
    }
}

