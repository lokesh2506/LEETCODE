class Solution {
    public boolean canArrange(int[] arr, int k) {
        int size = arr.length;

        int freq [] = new int[k];

        for(int i = 0;i<size;i++){
            int reminder = arr[i] % k;
            if(reminder < 0){
                reminder = (reminder + k) % k;
            }
            freq[reminder]++;
        }

        if(freq[0] % 2 != 0) return false;

        for(int i=1;i<=k/2;i++){
            if(freq[i] != freq[k-i]) return false;
        }

        return true;

        
    }
}