class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String [] str= s.split("\\s+");
        s="";
        for(int i=str.length-1;i>=0;i--)
        {
            if(i==0){
                s += str[i];
            }else{
                s = s + str[i] + " ";
            }
        }
        return s;
    }
}