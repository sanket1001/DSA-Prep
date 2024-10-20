class Solution {
    public boolean canJump(int[] nums) {
        boolean[] nums_check = new boolean[nums.length];
        for(int i = 0; i < nums.length; i++){
            nums_check[i] = false;
        }
        nums_check[0] = true;
        for(int i = 0; i <nums.length; i++){
            if(nums_check[i]){
                for(int j = i+1; j<= i+nums[i]; j++){
                    if(j < nums.length){
                        nums_check[j] = true;
                    }
                }
            }
        }
        if(nums_check[nums.length - 1]){
            return true;
        }else{
            return false;
        }
    }
}
