class Solution {
    public int expand(String s,int left,int right){
        int count = 0;
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
            count++;
        }
        return count;
    }
    public int countSubstrings(String s) {
        int size = s.length();

        int count = 0;

        for(int i=0;i<size;i++){
            count += expand(s,i,i); //odd length
            count += expand(s,i,i+1); //even length
        }

        return count;
    }
}