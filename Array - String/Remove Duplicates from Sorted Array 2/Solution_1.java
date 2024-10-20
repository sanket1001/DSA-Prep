class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int right = len - 1;
        int k = 1, rep = 1;
        int[] ans = new int[len];
        int key = nums[0];
        int i = 1;
        for(i = 1; i<=right;i++){
            if(nums[i] == nums[i-1]){
                rep++;
            }else{
                if(rep > 2){
                    key = nums[i-1];
                    for(int j=i; j<= right; j++){
                        nums[j - rep + 2] = nums[j];  
                    }
                    right = right - rep + 2;
                    i = i - rep + 2;
                }
                rep=1;

            }
        }
        if(rep > 2){
            right = right - rep + 2;
        }
        return right+1;
    }
}
