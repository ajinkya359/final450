package MyUtils;


public class HeapDataStructure {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
    public static void max_heapify(int[] arr,int i,int last){
        int left=2*i+1;
        int right=2*i+2;
        int n=last+1;
        int largest=i;
        if(left<n && arr[left]>arr[i])
            largest=left;
        if(right<n&&arr[right]>arr[largest])
            largest=right;
        if(largest!=i)
        {
            BasicUtils.swap(arr,i,largest);
            max_heapify(arr,largest,last);
        }
    }
    public static void min_heapify(int[] arr,int i,int last){
        int left=2*i+1;
        int right=2*i+2;
        int n=last+1;
        int smallest=i;
        if(left<n && arr[left]<arr[i])
            smallest=left;
        if(right<n&&arr[right]<arr[smallest])
            smallest=right;
        if(smallest!=i)
        {
            BasicUtils.swap(arr,i,smallest);
            min_heapify(arr,smallest,last);
        }
    }
    public static void arr_to_max_heap(int[] arr)
    {
        int n=arr.length;
        for(int i=n/2-1;i>=0;i--)
            max_heapify(arr,i,arr.length-1);

    }
    public static void arr_to_min_heap(int[] arr)
    {
        int n=arr.length;
        for(int i=n/2-1;i>=0;i--)
            min_heapify(arr,i,arr.length-1);
    }
}
