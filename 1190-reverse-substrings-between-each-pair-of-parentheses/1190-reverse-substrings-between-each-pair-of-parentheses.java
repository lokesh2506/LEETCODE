class Solution {
    public String reverseParentheses(String s) {
        int size = s.length();

        Stack<Integer> stack = new Stack<>();
        int[] pair = new int[size];

        for(int i=0;i<size;i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }else if(s.charAt(i) == ')'){
                int open = stack.pop();

                pair[open] = i;
                pair[i] = open;
            }
        }

        StringBuilder ans = new StringBuilder();

        int i=0;
        int direction = 1;  // +ve forward and -ve negative

        while(i<size){
            char ch = s.charAt(i);
            if(ch == '(' || ch == ')'){
                i = pair[i];
                direction = -direction;
            }else{
                ans.append(ch);
            }
            i += direction;
        }

        return ans.toString();

    }


    // public String reverseParentheses(String s) {
    //     Stack<Character> stack = new Stack<>();

    //     for(int i=0;i<s.length();i++){
    //         char ch = s.charAt(i);

    //         if(ch != ')'){
    //             stack.push(ch);
    //         }else{
    //             String str = "";

    //             while(!stack.isEmpty() && stack.peek() != '('){
    //                 str += stack.pop();
    //             }

    //             if(!stack.isEmpty()) stack.pop(); //remove the open bracket

    //             for(int j=0;j<str.length();j++){
    //                 stack.push(str.charAt(j));
    //             }
    //         }
    //     }


    //     // Now stack only contain character in the  order
    //     String ans = "";
    //     while(!stack.isEmpty()){
    //         ans = stack.pop()+ans;
    //     }

    //     return ans;
    // }
}