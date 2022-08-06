package easy;

public class Task121 {
    public int maxProfit(int[] prices) {
        /*int max = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                if (prices[i] < prices[j] && max < prices[j]-prices[i]){
                    max = prices[j] - prices[i];
                }
            }
        }*/
        int max = 0, min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (min < prices[i]) {
                max = Math.max(prices[i] - min, max);
            } else {
                min = prices[i];
            }
        }
        return max;
    }
}