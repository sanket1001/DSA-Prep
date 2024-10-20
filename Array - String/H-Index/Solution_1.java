class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        if(citations[citations.length - 1] == 0){
            return 0;
        }
        int i = 0;
        for(i = 0; i < citations.length; i++){
            if(citations[i] >= citations.length - i){
                break;
            }
        }
        return citations.length - i;

    }
}
