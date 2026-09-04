class Solution {
    public boolean palidromeCheck(int i,int j,String str){
        if(i>=j){
            return true;
        }

        char ch1= str.charAt(i);
        char ch2 = str.charAt(j);

        if(!((ch1 >= 'A' && ch1 <= 'Z') ||(ch1 >= 'a' && ch1 <= 'z') ||(ch1 >= '0' && ch1 <= '9'))){
            i++;
        }else if(!((ch2 >= 'A' && ch2 <= 'Z') || (ch2 >= 'a' && ch2 <= 'z') || (ch2 >= '0' && ch2 <= '9'))){
            j--;
        }else{
            if(ch1>='A' && ch1<='Z') ch1+=32;
            if(ch2>='A' && ch2<='Z') ch2+=32;

            if(ch1!=ch2) return false;
            i++;
            j--;
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