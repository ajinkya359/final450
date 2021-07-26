package Array;

public class Q34 {
	static boolean isPalindrome(int n) {
		int i=n,r=0;
		while(i!=0) {
			r=r*10+i%10;
			i=i/10;
		}
		i=n;
		while(i!=0&&r!=0)
		{
			if(i%10!=r%10)
			{
				return false;
			}
			i=i/10;
			r=r/10;
		}
		return true;
	}
	static int palinArray(int[] arr,int n) {
		for(int x:arr) {
			if(!isPalindrome(x))
				return 0;
		}
		return 1;
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome(1211));
	}
}
