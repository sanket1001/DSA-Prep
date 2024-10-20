class Solution {
    public boolean canJump(int[] nums) {
        int max_ind = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(i > max_ind){
                return false;
            }else{
                if(i + nums[i] > max_ind){
                    max_ind = i+nums[i];
                }
            }

        }
        if(max_ind >= nums.length-1){
            return true;
        }else{
            return false;
        }
    }
}
