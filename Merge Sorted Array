class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pt1 = 0, pt2 = 0;
        int[] num_temp = new int[n+m];
        for(int i=0; i<n+m; i++){
            num_temp[i] = nums1[i];
        }
        for(int i = 0; i<n+m; i++){
            if(pt1 == m){
                nums1[i] = nums2[pt2];
                pt2++;
                continue;
            }
            if(pt2 == n){
                nums1[i] = num_temp[pt1];
                pt1++;
                continue;
            }
            
            if(num_temp[pt1] < nums2[pt2]){
                nums1[i] = num_temp[pt1];
                pt1++;
            }else{
                nums1[i] = nums2[pt2];
                pt2++;
            }
        }
        
    }
}
