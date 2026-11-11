class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();

        solve(0,0,"",n,ans);

        return ans;
    }

    public void solve(int open,int close, String current,int n,  List<String> ans){
        if(current.length() == n*2){
            ans.add(current);
            return;
        }


        // open bracket
        if(open < n){
            solve(open+1, close, current + "(", n, ans);
        }

        // close bracket
        if(close < open){
            solve(open, close+1, current + ")", n, ans);
        }
    
        // Initially open condition only satifies 0 < 0 for close fails 
        // always we need a open bracket
    }
}