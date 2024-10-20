class Solution {
    public int jump(int[] nums) {
        if(nums.length <=2){
            return nums.length-1;
        }
        int left = 0, right = 0, jumps = 1;
        left = 1;
        right = 0+nums[0];
        while(true){
            int temp = 0;
            if(right >= nums.length-1){
                break;
            }
            for(int i = left; i<= right; i++){
                if(nums[i]+i > temp){
                    temp = nums[i] + i;
                }
            }
            left = right+1;
            right = temp;
            jumps++;
        }
        return jumps;
    }
}
