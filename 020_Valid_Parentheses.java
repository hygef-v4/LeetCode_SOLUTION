import java.util.Stack;

class Solution {
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack();
    for (char c : s.toCharArray()) {
      if (c == '(' || c == '[' || c == '{') {
        stack.push(c);
      }
      // check condition dont have opening bracket
      else if (c == ')' || c == ']' || c == '}') {
        if (stack.isEmpty()) {
          return false;
        }

        char top = stack.pop();
        if ((c == ')' && top != '(')
            || (c == ']' && top != '[')
            || (c == '}' && top != '{')) {
          return false;
        }
      }
    }
    // if not empty -> return false
    return stack.isEmpty();
  }
}