class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int cost = 0;

        int max = Integer.MIN_VALUE;

        int j = 0;
        for(int i=0;i<s.length();i++){
            cost += Math.abs(s.charAt(i) - t.charAt(i));

            while(cost > maxCost && j<s.length()){
                cost -= Math.abs(s.charAt(j) - t.charAt(j));
                j++;
            }

            if(cost <= maxCost){
                max = Math.max(max,i-j+1);
            }
        }

        return max;
    }
}