class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int len = nums.size();
        k = k % len;
        k = (len - k)%len;
        vector <int> ans;
        for(int i=0; i<len; i++)
        {
            ans.push_back(nums[k]);
            k++;
            k = k % len;
        }
        for(int i=0; i<len; i++)
        {
            nums[i] = ans[i];
        }
    }
};
