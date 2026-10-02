class Solution {
    public boolean checkInclusion(String s1, String s2) {
        boolean result = false;

        HashMap<Character,Integer>map = new HashMap<>();

        for(char ch : s1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int count = s1.length();

        int j=0;
        for(int i=0;i<s2.length();i++){
            char ch = s2.charAt(i);
            int val = map.getOrDefault(ch,0);
            
            if(val>0) count--;
            map.put(ch,val-1);

            if(i-j+1 > s1.length()){
                char left = s2.charAt(j);
                int leftVal = map.get(left);
                if(leftVal>=0) count++;
                map.put(left,leftVal+1);
                j++;
            } 

            if(count ==0) return true;
        }

        return result;
    }
}