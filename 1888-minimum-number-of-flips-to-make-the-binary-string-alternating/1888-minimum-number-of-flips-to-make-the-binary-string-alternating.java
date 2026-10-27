class Solution {
    public int minFlips(String s) {
        int size = s.length();
        s += s;
        // we are combinig 2 string for circular search

        int count = 0;
        int ans = Integer.MAX_VALUE;

        // we are check if the array is in this position 010101
        // if char is not in that position mean increment the count

        for(int i=0;i<s.length();i++){
            // only even contains 0;
            char expected = (i % 2 == 0) ? '0' : '1';

            if(expected != s.charAt(i)){
                count++;
            }

            // we need to remove the last char from the previous window
            if(i >= size){
                char leftChar = ((i-size) % 2 == 0) ? '0' : '1';

                if(leftChar != s.charAt(i-size)){
                    count--;
                }
            }

            if(i >=size -1){
                ans = Math.min(ans,Math.min(count, size - count));
            }
        }

        return ans;

    }
}