class Solution {
    public boolean palidromeCheck(int i,int j,String str){
        if(i>=j){
            return true;
        }

        if(!Character.isLetterOrDigit(str.charAt(i))){
            i++;
        }else if(!Character.isLetterOrDigit(str.charAt(j))){
            j--;
        }else{
            if(Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))){
                return false;
            }
            i++;j--;
        }
        
        return palidromeCheck(i,j,str);
    }
    public boolean isPalindrome(String s) {
        s.trim();

        if(s.length()==0){
            return true;
        }

        return palidromeCheck(0,s.length()-1,s);

    }
}