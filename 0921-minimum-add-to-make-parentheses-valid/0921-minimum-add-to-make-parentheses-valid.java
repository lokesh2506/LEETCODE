class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int ans = 0; // close without pair ")))" -> 3

        for(char ch : s.toCharArray()){
            if(ch == '('){
                open++;
            }else{
                if(open > 0){ // (( -> open 2  -> now close come )   (-1  ()-> valid
                    open--; // 
                }else{
                    ans++;
                }
            }
        }

        return open + ans;

    }
}