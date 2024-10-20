class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int[] p_max = new int[len];
        int[] p_min = new int[len];
        int mn = prices[0];
        p_min[0] = prices[0];

        int mx = prices[len-1];
        p_max[0] = prices[len-1];

        for(int i = 1; i<len; i++){
            if(prices[i] < mn){
                mn = prices[i];
            }
            p_min[i] = mn;
        }

        for(int i = len - 1; i>0; i--){
            if(prices[i]>mx){
                mx = prices[i];
            }
            p_max[i] = mx;
        }

        int max_profit = 0;
        for(int i = 0; i<len; i++){
            if(p_max[i] - p_min[i] > max_profit){
                max_profit = p_max[i] - p_min[i];
            }
        }
        return max_profit;
    }
}
