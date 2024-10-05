package Stack;

import java.util.Stack;

public class ParanthesesChecker {
  public boolean checker(String data) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < data.length(); i++) {
      if (data.charAt(i) == '(') {
        stack.push('(');
      } else if (!stack.isEmpty() && data.charAt(i) == ')') {
        stack.pop();
      }
    }
    if (stack.isEmpty()) {
      return true;

    } else {
      return false;
    }

  }

  public static void main(String[] args) {
    ParanthesesChecker obj = new ParanthesesChecker();
    String data = ")()()((()))";
    System.out.println(obj.checker(data));

  }
}
