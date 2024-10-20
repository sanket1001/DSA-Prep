class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int left = 0, right = len - 1;
        int k = 0;
        for(int i = 0; i<len; i++){
            
            if(nums[right] == val){
                k++;
                right--;
                continue;
            }
            if(right <= left){
                break;
            }
            if(nums[left] == val){
                nums[left] = nums[right];
                nums[right] = val;
                right--;
                k++;
            }
            left++;
            
        }
        return len-k;
    }
}
