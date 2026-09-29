class Solution {
    public String frequencySort(String s) {
        int freq[] = new int[128];
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            int ch = s.charAt(i);
            freq[ch]++;
        }

        while(sb.length() < s.length()){

            int maxIndx = 0;

            for(int i=1;i<128;i++){
                if(freq[maxIndx] <  freq[i]){
                    maxIndx = i;
                }
            }

            for(int i=0;i<freq[maxIndx];i++){
                sb.append((char) maxIndx);
            }

            freq[maxIndx] = 0;
        }

        return sb.toString();
    }
}