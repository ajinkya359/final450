package DynamicProgramming;

import java.util.Scanner;


public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String str1,str2;
        Scanner sc=new Scanner(System.in);
        str1=sc.nextLine();
        str2=sc.nextLine();
        int ans=lcsTabulation(str1, str2);
        System.out.println(ans);
        sc.close();
    }
    //O(2^n)
    public static int lcsBruteForce(String str1,String str2,int i,int j){
        if(i>=str1.length()||j>=str2.length()) return 0;
        
        if(str1.charAt(i)==str2.charAt(j))
            return 1+lcsBruteForce(str1, str2, i+1, j+1);
        else return Math.max(lcsBruteForce(str1, str2, i+1, j),lcsBruteForce(str1, str2, i, j+1));
    }

    //O(m*n) top to down
    public static int lcsMemoization(String str1,String str2)
    {
        int[][] dp=new int[str1.length()][str2.length()];
        for(int i=0;i<str1.length();i++)
            for(int j=0;j<str2.length();j++)
                dp[i][j]=-1;
        int ans=lcsMemoizationHelper(str1, str2,dp,0,0);
        return ans;
    }
    private static int lcsMemoizationHelper(String str1,String str2,int[][] dp,int i,int j)
    {
        if(i>=str1.length()||j>=str2.length()) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        else{
            if(str1.charAt(i)==str2.charAt(j))
            {
                dp[i][j]=1+lcsMemoizationHelper(str1, str2, dp, i+1,j+1);
                return dp[i][j];
            }
            else{
                dp[i][j]=Math.max(lcsMemoizationHelper(str1, str2,dp,i+1,j), lcsMemoizationHelper(str1, str2, dp, i, j+1));
                return dp[i][j];
            }
        }
    }   
    //O(m*n) bottom up approach
    public static int lcsTabulation(String str1,String str2){
        int[][] dp=new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<str1.length()+1;i++)
            dp[i][0]=0;
        for(int i=0;i<str2.length()+1;i++)
            dp[0][i]=0;
        for(int i=1;i<=str1.length();i++)
        {
            for(int j=1;j<=str2.length();j++)
            {
                if(str1.charAt(i-1)==str2.charAt(j-1))
                    dp[i][j]=1+dp[i-1][j-1];
                else dp[i][j]=Math.max(dp[i][j-1], dp[i-1][j]);
            }
        }
        StringBuilder lcs= new StringBuilder("");
        int i=str1.length(),j=str2.length();
        while(i>=1&&j>=1)
        {
            if(dp[i][j]==dp[i][j-1]) j--;
            else{
                lcs.append(str1.charAt(i-1));
                i--;
                j--;
            }
        }
        System.out.println(lcs.reverse());
        return dp[str1.length()][str2.length()];
    }


}
