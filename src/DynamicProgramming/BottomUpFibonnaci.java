package DynamicProgramming;

import java.util.Scanner;

public class BottomUpFibonnaci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(bottomUpFibonnaci(n));
        sc.close();

    }
    //TC: O(n)
    public static int bottomUpFibonnaci(int n){
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++)
            dp[i]=dp[i-1]+dp[i-2];
        return dp[n];
    }
}
