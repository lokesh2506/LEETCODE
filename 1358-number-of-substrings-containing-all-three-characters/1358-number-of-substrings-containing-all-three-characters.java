class Solution {
    public int numberOfSubstrings(String s) {
        // stores the last position of the index of each character
        int position[] = {-1,-1,-1};

        int valid = 0;

        for(int i=0;i<s.length();i++){
            // update new position of the character
            position[s.charAt(i) - 'a'] = i;

            valid += Math.min(position[0],Math.min(position[1],position[2]))+1;

        }

        return valid;


    }
}