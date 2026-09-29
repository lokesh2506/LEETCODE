class Solution {
    public String largestOddNumber(String num) {
        int size = num.length();

        int j = size-1;
        while(j >= 0){
            char ch = num.charAt(j);
            if(Integer.valueOf(ch) % 2 == 1) return  num.substring(0,j+1);
            j--; 
        }

        return "";
    }
}