class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int[] temp_nums = new int[nums.length];
        temp_nums[k-1] = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                k++;
                temp_nums[k-1] = nums[i];
            }
        }
        for(int i = 0; i < k; i++){
            nums[i] = temp_nums[i];
        }
        return k;
    }
}
