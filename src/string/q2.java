package string;

public class q2 {
    int isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return 0;
            }
        }
        return 1;
    }

}
