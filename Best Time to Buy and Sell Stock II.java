class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int curr[] = new int[2];
        int ahead[] = new int[2];

        ahead[0] = 0; 
        ahead[1] = 0; 

        for (int ind = n - 1; ind >= 0; ind--) {
            for (int have = 0; have <= 1; have++) {
                if (have == 0) {
                    curr[have] = Math.max(-prices[ind] + ahead[1], 0 + ahead[0]);
                } else {
                    curr[have] = Math.max(prices[ind] + ahead[0], 0 + ahead[1]);
                }
            }
            ahead = curr; 
        }

        return ahead[0]; 
    }
}
