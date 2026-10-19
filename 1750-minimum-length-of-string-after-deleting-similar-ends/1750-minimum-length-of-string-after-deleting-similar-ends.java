class Solution {
    public int minimumLength(String s) {
        int i=0,j=s.length()-1;

        while(i<j){
            char left = s.charAt(i);
            char right = s.charAt(j);
            if(left != right){
                break;
            }
            while(i<j && s.charAt(i) == s.charAt(i+1)){
                i++;
            }
            while(i<j && s.charAt(j) == s.charAt(j-1)){
                j--;
            }

            i++;
            j--;

        }

        return i<=j ? j-i+1 : 0;
    }
}