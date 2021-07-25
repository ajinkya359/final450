package string;

import java.util.Scanner;

public class q5 {

    public static boolean areRotations(String str1,String str2){
        if(str1.length()!=str2.length()) return false;
        String temp=str1+str1;
        return (temp.contains(str2));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        System.out.println(areRotations(str1, str2));
        sc.close();
    }
    
}
