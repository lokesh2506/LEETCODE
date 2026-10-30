class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return ans;
        }

        Map<Integer, String> digitToLetters = new HashMap<>();
        digitToLetters.put(2, "abc");
        digitToLetters.put(3, "def");
        digitToLetters.put(4, "ghi");
        digitToLetters.put(5, "jkl");
        digitToLetters.put(6, "mno");
        digitToLetters.put(7, "pqrs");
        digitToLetters.put(8, "tuv");
        digitToLetters.put(9, "wxyz");

        solve(digits, 0, new StringBuilder(),digitToLetters,ans);

        return ans;
    }

    public void solve(String digits,int index, StringBuilder curr, Map<Integer,String> digitToLetters, List<String> ans){
        if(index == digits.length()){
            ans.add(curr.toString());
            return;
        }

        int key = digits.charAt(index) - '0';

        String letters = digitToLetters.get(key);

        for(int i=0;i<letters.length();i++){
            curr.append(letters.charAt(i));
            solve(digits, index +1, curr,digitToLetters,ans);
            curr.deleteCharAt(curr.length()-1);
        }


    }
}