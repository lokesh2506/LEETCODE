class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();

        int number = 0; // handle multi digits more that 9 
        int result = 0;  // store the current result 
        int sign = 1; // store the opertor sign 

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                number = number * 10 + (ch - '0');
                // 122
            }else if(ch == '+'){
                result  += number * sign;

                number = 0;
                sign = 1;

            }else if(ch == '-'){
                result  += number * sign;

                number = 0;
                sign = -1;
            }else if(ch == '('){
                stack.push(result);
                stack.push(sign);

                result = 0;
                sign = 1; 
                //  num is already zero
            }else if(ch == ')'){
                // 3+(5+2)
                //  3 and + is in the stack [3,1]
                //  result is 5 and sign is + -1  number is 1   
                result  += number * sign;

                number = 0;

                result *= stack.pop();  // sign 2*-1
                result += stack.pop(); // 5-2
            }
        }

        return result + (number * sign);
    }
}