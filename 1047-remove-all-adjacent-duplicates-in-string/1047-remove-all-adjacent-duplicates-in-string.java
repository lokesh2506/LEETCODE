class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            boolean status = true;

            while(!stack.isEmpty() && stack.peek() == ch){
                stack.pop();
                status = false; // no need to add a incomming in the stack
            }


            if(status) stack.push(ch);
        }

        StringBuilder ans = new StringBuilder();

        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }

        return ans.reverse().toString();

    }
}