class Solution {
    public int jump(int[] nums) {
        int len = nums.length;
        int[] check_arr = new int[len];
        for(int i =0; i<len; i++){
            check_arr[i] = Integer.MAX_VALUE;
        }
        check_arr[0] = 0;
        for(int i=0; i<len-1; i++){
            for(int j=i+1; j<=i+nums[i]; j++){
                if(j<len){
                    if(check_arr[i]+1 < check_arr[j]){
                        check_arr[j] = check_arr[i]+1;
                    }
                }
            }
        }
        return check_arr[len-1];
    }
}
