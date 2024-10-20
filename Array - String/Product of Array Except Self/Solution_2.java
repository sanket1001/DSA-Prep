class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int temp = nums[nums.length - 1];
        Arrays.fill(answer, 1);
        for(int i = 1; i < nums.length; i++){
            answer[i] = answer[i-1]*nums[i-1];
        }
        for(int i = nums.length - 2; i >= 0; i--){
            answer[i] = answer[i]*temp;
            temp = temp*nums[i];
        }
        return answer;
    }
}

