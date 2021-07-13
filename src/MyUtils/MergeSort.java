package MyUtils;
//Complexity WorstCase: O(nlogn) BestCase:O(nlogn)

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={2,34,-1234,214,53125,0,-31,-55555,-55555};
        mergeSort(arr,0,arr.length-1);
        ArrayMethods.printArray(arr);
    }
    public static void mergeSort(int[] arr,int low,int high){
        if(low<high){
            int middle = (low + high) / 2;

            mergeSort(arr, low, middle);
            mergeSort(arr, middle + 1, high);

            merge(arr, low, middle, high);
        }
    }
    static void merge(int[] arr,int low,int middle,int high)
    {
//        System.out.println("Low: "+low+" Middle: "+middle +" High: "+high);
//        for(int i=low;i<=high;i++)
//            System.out.print(arr[i]+" ");
//        System.out.println();
        int[] temp=new int[high-low+1];
        int i=low,j=middle+1,k=0;
        while(i<=middle&&j<=high)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
//                System.out.println("temp["+k+"]"+" = "+arr[i]);
                i++;
                k++;
            }
            else{
                temp[k]=arr[j];
//                System.out.println("temp["+k+"]"+" = "+arr[j]);
                j++;
                k++;
            }
        }
        while(i<=middle){
            temp[k]=arr[i];
//            System.out.println("temp["+k+"]"+" = "+arr[i]);
            i++;
            k++;
        }
        while(j<=high)
        {
            temp[k]=arr[j];
//            System.out.println("temp["+k+"]"+" = "+arr[j]);
            j++;
            k++;
        }
        k=0;

        for(i=low;i<=high;i++,k++)
        {
            arr[i]=temp[k];
//            System.out.print(temp[k]+" ");
        }
//        System.out.println();

    }

}
