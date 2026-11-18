class Solution {

    public String removeStars(String s) {
        int size = s.length();

        StringBuilder stack = new StringBuilder();

        for(int i=0;i<size;i++){
            char ch = s.charAt(i);
            if(ch == '*' && stack.length() > 0){
                stack.deleteCharAt(stack.length() - 1);
            }else{
                stack.append(ch);
            }
        }

        return stack.toString();
    }

    // public String removeStars(String s) {
    //     int size = s.length();

    //     Stack<Character> stack = new Stack<>();

    //     for(int i=0;i<size;i++){
    //         char ch = s.charAt(i);
    //         if(ch == '*' && !stack.isEmpty()){
    //             stack.pop();
    //         }else{
    //             stack.push(ch);
    //         }
    //     }

    //     StringBuilder ans = new StringBuilder();

    //     while(!stack.isEmpty()){
    //         ans.append(stack.pop());
    //     }

    //     return ans.reverse().toString();
    // }
}