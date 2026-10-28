class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int count  = 0;

        int zeros = 0;
        int ones = 0;


        int left = 0;
        for(int right = 0;right < s.length();right++){

            if(s.charAt(right) == '0'){
                zeros++;
            }else{
                ones++;
            }

            // both need to exceed the limit only you need to reduce/move the left pointer

            while(ones > k && zeros >k){
                if(s.charAt(left) == '0'){
                    zeros--;
                }

                if(s.charAt(left) =='1'){
                    ones--;
                }

                left++;
            }

            count += right - left + 1;
        }

        return count;
    }
}