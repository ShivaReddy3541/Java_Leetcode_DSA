import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        // 1. Create a stack to hold Character objects
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            
            // 2. If it's an opening bracket, push it onto the stack
            if (current == '{' || current == '[' || current == '(') {
                stack.push(current);
            } 
            // 3. If it's a closing bracket
            else {
                // If the stack is empty, we have a closing bracket with no opening partner
                if (stack.isEmpty()) {
                    return false;
                }
                
                // Pop the most recent opening bracket from the top of the stack
                char top = stack.pop();
                
                // Check if the current closing bracket matches the popped opening bracket
                if (current == '}' && top != '{') return false;
                if (current == ']' && top != '[') return false;
                if (current == ')' && top != '(') return false;
            }
        }
        
        // 4. If the stack is completely empty, all brackets matched perfectly!
        return stack.isEmpty();
    }
}

