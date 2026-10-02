class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxSubString = 0;

        int size = s.length();

        HashMap<Character,Integer> map = new HashMap<>();

        int j=0;
        for(int i=0;i<size;i++){
            char ch = s.charAt(i);
             map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.getOrDefault(ch,0) > 1){
                char leftChar = s.charAt(j);
                map.put(leftChar,map.get(leftChar)-1);
                if(map.get(leftChar) == 0) map.remove(leftChar);

                j++;
            }
            maxSubString = Math.max(maxSubString,i-j+1);
        }

        return maxSubString;
    }
}