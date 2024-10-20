class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int len = nums.size();
        k = k % len;
        vector<int> ans;
        int i = 0;
        k = (len - k)%len;
        while(i<len)
        {
            ans.push_back(nums[k]);
            k++;
            k = k%len;
            i++;
        }
        
        while(i>0)
        {
            nums[i-1]=ans[i-1];
            i--;
        }
    }
};
