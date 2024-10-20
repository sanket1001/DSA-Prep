class Solution {
    public int hIndex(int[] citations) {
        int[] freq = new int[citations.length+1];
        Arrays.fill(freq, 0);

        for(int i = 0; i < citations.length; i++){
            if(citations[i] > citations.length){
                freq[citations.length]++;
            }else{
                freq[citations[i]]++;
            }
        }
        int totalValue = 0;
        for(int i = citations.length; i >= 0; i--){
            totalValue = totalValue + freq[i];
            if(totalValue >= i){
                return i;
            }
        }
        return 0;
    }
}
