package MyUtils;
//WorstCase When last element is picked always: O(n^2)
//Best case when middle element is selected always: O(nlogn)
public class QuickSort {
    public static void main(String[] args) {
        int[] arr=ArrayMethods.takeInput();
        quickSort(arr,0,arr.length-1);
        ArrayMethods.printArray(arr);
    }
    static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<=high-1;j++)
        {
            if(arr[j]<pivot){
                i++;
                BasicUtils.swap(arr,i,j);
            }
        }
        BasicUtils.swap(arr,i+1,high);
        return i+1;
    }
    static void quickSort(int[] arr,int low,int high)
    {
        if(low<high){
            int pi=partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }

}
