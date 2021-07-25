package string;

import java.util.Scanner;

public class q6 {

    public static boolean isValidShuffle(String str1,String str2,String result){


        int[] small=new int[26];
        int[] capital=new int[26];
        int[] numbers=new int[10];
        for(int i=0;i<26;i++){
            small[i]=0;
            capital[i]=0;
        }
        for(int i=0;i<10;i++)numbers[i]=0;
        for(int i=0;i<str1.length();i++){
            int currentAscii=(int)str1.charAt(i);
            if(currentAscii<=57)
            {
                numbers[currentAscii-48]++;
            }
            else if(currentAscii<97){
                capital[currentAscii-65]++;
            }
            else{
                small[currentAscii-97]++;
            }
                 
        }

        for (int i = 0; i < str2.length(); i++) {
            int currentAscii = (int) str2.charAt(i);
            if (currentAscii <= 57) {
                numbers[currentAscii - 48]++;
            }
            else if (currentAscii < 97) {
                capital[currentAscii - 65]++;
            } else {
                small[currentAscii - 97]++;
            }

        }

        for(int i=0;i<result.length();i++){
            int currentAscii = (int) result.charAt(i);
            if (currentAscii <= 57) {
                numbers[currentAscii - 48]--;
            }
            else if(currentAscii<97){
                capital[currentAscii-65]--;
            }
            else small[currentAscii-97]--;
        }
        
        for(int i=0;i<26;i++){
            if(small[i]!=0) return false;
            if(capital[i]!=0) return false;
        }
        for(int i=0;i<10;i++) {
            if(numbers[i]!=0) return false;
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        String result=sc.next();
        System.out.println(isValidShuffle(str1, str2, result));
        sc.close();
    }
    
}
