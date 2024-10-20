class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int len = prices.size();
        vector<int> max_arr;
        max_arr.resize(len);
        vector<int> min_arr;
        min_arr.resize(len);
        int min_price = INT_MAX;
        int max_price = INT_MIN;
        int max_profit = INT_MIN;

        for(int i=0; i<len; i++){
            if(prices[i] < min_price){
                min_price = prices[i]; 
            }
            min_arr[i] = min_price;
            
            if(prices[len-i-1] > max_price){
                max_price = prices[len-i-1];
            }
            max_arr[len-i-1] = max_price;
        }

      


        for(int i=0; i<len; i++){
            if(max_arr[i] - min_arr[i] > max_profit){
                max_profit = max_arr[i] - min_arr[i];
            }
        }

        return max_profit;

    }
};
