//Creating stack using array

package Stack;

public class ArrayStack {
  private int capacity;
  private int arr[];
  private int top = -1;

  ArrayStack(int capacity) {
    this.capacity = capacity;
    arr = new int[this.capacity];
  }

  public void push(int element) throws Exception {
    if (this.capacity == (top + 1)) {
      throw new Exception("Stack is fulled");
    } else {
      arr[++top] = element;
      System.out.println("element added successfully");
    }
  }

  public int top() throws Exception {
    if (top == -1) {
      throw new Exception("Stack is empty");
    } else {
      return arr[top];
    }
  }

  public int pop() throws Exception {
    if (top == -1) {
      throw new Exception("Stack is empty");
    } else {
      int element = arr[top];
      arr[top--] = Integer.MIN_VALUE;
      return element;
    }
  }

  public static void main(String[] args) throws Exception {
    ArrayStack stack = new ArrayStack(5);
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    System.out.println(stack.top());
    stack.push(5);
    System.out.println(stack.top());
    System.out.println(stack.pop());
  }
}