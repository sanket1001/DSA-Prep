class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k%len;
        if(k>0){
            int j = len - 1;
            for(int i = 0; i < len/2; i++){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
            j = k - 1;
            for(int i = 0; i < k/2; i++){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
            j = len - 1;
            for(int i = k; i < (len + k)/2; i++){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
        
    }
}
