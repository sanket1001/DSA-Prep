class Solution {
    public int majorityElement(int[] nums) {
        Stack<Integer> stk = new Stack<>();
        stk.push(nums[0]);
        for(int i = 1; i<nums.length; i++){
            if(stk.empty()){
                stk.push(nums[i]);
                continue;
            }
            int temp = stk.peek();
            if(temp == nums[i]){
                stk.push(nums[i]);
            }else{
                stk.pop();
            }
        }
        return stk.peek();
    }
}
