class Solution {
    public boolean leftPalindrome(String s){
        boolean deletion = false;
        char ch[] = s.toCharArray();

        int size = s.length();

        int i=0,j = size-1;

        while(i<j){
            if(ch[i] != ch[j] && !deletion){
                if(i<j && ch[i+1] == ch[j]){
                    i++;
                }else if(i<j && ch[i] == ch[j-1]){
                    j--;
                }
                deletion = true;
            }else if(ch[i] != ch[j] && deletion){
                return false;
            }
            else{
                i++;
                j--;
            }

        }

        return true;
    }

    public boolean rightPalindrome(String s){
        boolean deletion = false;
        char ch[] = s.toCharArray();

        int size = s.length();

        int i=0,j = size-1;

        while(i<j){
            if(ch[i] != ch[j] && !deletion){
                if(i<j && ch[i] == ch[j-1]){
                    j--;
                }
                else if(i<j && ch[i+1] == ch[j]){
                    i++;
                }
                deletion = true;
            }else if(ch[i] != ch[j] && deletion){
                return false;
            }
            else{
                i++;
                j--;
            }

        }

        return true;
    }
    public boolean validPalindrome(String s) {


        return leftPalindrome(s) || rightPalindrome(s);

    }
}