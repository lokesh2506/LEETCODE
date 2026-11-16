class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch != ')'){
                stack.push(ch);
            }else{
                String str = "";

                while(!stack.isEmpty() && stack.peek() != '('){
                    str += stack.pop();
                }

                if(!stack.isEmpty()) stack.pop(); //remove the open bracket

                for(int j=0;j<str.length();j++){
                    stack.push(str.charAt(j));
                }
            }
        }


        // Now stack only contain character in the  order
        String ans = "";
        while(!stack.isEmpty()){
            ans = stack.pop()+ans;
        }

        return ans;
    }
}