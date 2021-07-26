package Array;

public class Q16 {
	static int maxProfit(int[] prices) {
		if(prices.length==0) return 0;
		else {
			int minPrice=Integer.MAX_VALUE;
			int maxProfit=0;
			for(int i=0;i<prices.length;i++) {
				if(prices[i]<minPrice) {
					minPrice=prices[i];
				}
				else {
					if(prices[i]-minPrice>maxProfit)
						maxProfit=prices[i]-minPrice;
				}
			}
			return maxProfit;
		}
	}
}
