class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int[] answer1 = new int[nums.length];
        int[] right_arr = new int[nums.length];
        Arrays.fill(answer, 1);
        Arrays.fill(answer1, 1);
        Arrays.fill(right_arr, 1);
        for(int i = 1; i < nums.length; i++){
            answer[i] = answer[i-1]*nums[i-1];
        }
        for(int i = nums.length-2; i >= 0; i--){
            right_arr[i] = right_arr[i+1]*nums[i+1];
        }
        for(int i = 0; i<nums.length; i++){
            answer1[i] = answer[i]*right_arr[i];
        }
        return answer1;
    }
}
