package MyUtils;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr=ArrayMethods.takeInput();
        heapSort(arr);
        ArrayMethods.printArray(arr);
    }
    public static void heapSort(int[] arr)
    {
        HeapDataStructure.arr_to_max_heap(arr);
        int last=arr.length-1;
        while(last>0){
            BasicUtils.swap(arr,0,last);
            last--;
            HeapDataStructure.max_heapify(arr,0,last);
        }
    }
}
