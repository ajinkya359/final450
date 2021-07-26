package DynamicProgramming;

public class ZeroOneKnapSackProblem {
    public static void main(String[] args) {
        int[] val = { 1, 6, 18, 22, 28 };
        int[] wt = { 1, 2, 5, 6, 7 };
        int W =11;
        System.out.println(knapSackTabulation(W,wt,val));
    }
    //O(2^n)
    public static int knapSackBruteForce(int max_weight,int[] weights,int[] values,int last)
    {
        if(last<0) return 0;
        if(weights[last]<=max_weight) return Math.max(values[last]+knapSackBruteForce(max_weight-weights[last], weights, values, last-1),knapSackBruteForce(max_weight, weights, values, last-1));
        else return knapSackBruteForce(max_weight, weights, values, last-1);
    }
    //O(n*w) It is TopDown
    public static int knapSackMemoization(int max_weight,int[] weights,int[] values,int last){
        int[][] dp=new int[values.length][max_weight+1];
        for(int i=0;i<values.length;i++)
        {
            for(int j=0;j<=max_weight;j++)
                dp[i][j]=-1;
        }
        return knapSackMemoizationHelpet(max_weight, weights, values, values.length-1,dp);
    }
    private static int knapSackMemoizationHelpet(int max_weight,int[] weights,int[] values,int last,int[][] dp)
    {
        if(last<0)return 0;
        if(weights[last]<=max_weight)
        {
            if(dp[last][max_weight]!=-1) return dp[last][max_weight];
            else{
                dp[last][max_weight]=Math.max(values[last]+knapSackMemoizationHelpet(max_weight-weights[last], weights, values, last-1,dp),knapSackMemoizationHelpet(max_weight, weights, values, last-1,dp));
                return dp[last][max_weight];
            }
            
        }
        else {
            dp[last][max_weight]=knapSackMemoizationHelpet(max_weight, weights, values, last-1, dp);
            return dp[last][max_weight];
        }
    }
    //O(n*w) it is bottom up approach
    public static int knapSackTabulation(int max_weight,int[] weights,int[] values)
    {
        int[][] arr= new int[weights.length][max_weight+1];
        for(int i=0;i<weights.length;i++) arr[i][0]=0;
        for(int i=0;i<weights.length;i++){
            for(int j=0;j<=max_weight;j++){
                if(i==0)
                {
                    if(j<weights[i]) arr[i][j]=0;
                    else arr[i][j]=values[i];
                }
                else{
                    if(j<weights[i]) arr[i][j]=arr[i-1][j];
                    else arr[i][j]=Math.max(arr[i-1][j],values[i]+arr[i-1][j-weights[i]]);
                }
            }
        }
        int i=weights.length-1,j=max_weight;
        // System.out.println(i + " " + j);

        while(i>=1&&j>=0)
        {
            // System.out.println(i + " " + j);

            if(arr[i][j]!=arr[i-1][j]){
                System.out.println("Item at index: "+i+" is chosen."+arr[i][j]);
                j=j-weights[i];
                i = i - 1;
            }
            else i--;
        }
        // for( i=0;i<weights.length;i++)
        // {
        //     for(j=0;j<=max_weight;j++)
        //         System.out.print(arr[i][j]+" ");
        //     System.out.println();
        // }
        return arr[weights.length-1][max_weight];
    }
}
