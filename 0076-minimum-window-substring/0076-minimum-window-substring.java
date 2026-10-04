class Solution {
    public String minWindow(String s, String t) {
        int start = 0,end = 0;

        if(s.length() < t.length()) return s.substring(start,end);

        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }   

        int count = t.length();
        int min = Integer.MAX_VALUE;

        int j = 0;
        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);
            int val = map.getOrDefault(ch,0);
            if(val > 0) count--;
            map.put(ch,val-1);

            while(count == 0 && j<=i){
                if(min > i-j+1){
                    min = i-j+1;
                    start = j;
                    end = i;
                }

                char left = s.charAt(j);
                int leftVal = map.getOrDefault(left,0);
                if(leftVal >=0) count++;
                map.put(left,leftVal+1);
                j++;

            }
        }

        if(min == Integer.MAX_VALUE) return "";

        return s.substring(start,end+1);
    }
}