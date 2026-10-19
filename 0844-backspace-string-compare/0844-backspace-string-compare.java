
import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> first = new Stack<>();
        Stack<Character> second = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '#') {
                if (!first.isEmpty()) {
                    first.pop();
                }
            } else {
                first.push(ch);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (ch == '#') {
                if (!second.isEmpty()) {
                    second.pop();
                }
            } else {
                second.push(ch);
            }
        }

        return first.equals(second);
    }
}
