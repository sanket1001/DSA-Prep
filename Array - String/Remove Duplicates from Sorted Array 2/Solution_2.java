class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len < 3){
            return len;
        }
        int j = 2;
        for(int i = 2; i<len; i++){
            if(nums[i] != nums[j-2]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
