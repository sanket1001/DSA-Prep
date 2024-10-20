class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        int len = nums.length;
        k = (len - (k%len))%len;
        for(int i = 0; i < nums.length; i++){
            temp[i] = nums[(k%nums.length)];
            k++;
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = temp[i];
        }
    }
}
