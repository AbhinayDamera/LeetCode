import java.util.*;

class Solution {
    public String makeGood(String s) {

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(!stack.isEmpty() &&
               Character.toLowerCase(ch) == Character.toLowerCase(stack.peek()) &&
               ch != stack.peek())
            {
                stack.pop();
            }
            else {
                stack.push(ch);
            }
        }

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < stack.size(); i++) {
            result.append(stack.get(i));
        }

        return result.toString();
    }
}