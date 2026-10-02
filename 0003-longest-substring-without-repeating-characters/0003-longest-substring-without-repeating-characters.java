class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxSubString = 0;

        int size = s.length();

        HashMap<Character,Integer> map = new HashMap<>();

        int j=0;
        for(int i=0;i<size;i++){
            char ch = s.charAt(i);

            if(map.containsKey(ch)){
                j = Math.max(j,map.get(ch)+1);
            }

            map.put(ch,i);
            maxSubString = Math.max(maxSubString,i-j+1);
        }

        return maxSubString;
    }
}