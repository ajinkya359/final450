package DynamicProgramming;

import java.util.Scanner;

public class FibonacciBruteForce{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fibonacciBruteForce(n));
        sc.close();
    }
    //TC=O(2^n)
    public static int fibonacciBruteForce(int n){
        if(n<=1) return n;
        else return fibonacciBruteForce(n-1)+fibonacciBruteForce(n-2);
    }
}