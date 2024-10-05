package Stack;

public class DynamicArrayStack {
  private int capacity;
  private int arr[];
  private int top = -1;

  DynamicArrayStack(int capacity) {
    this.capacity = capacity;
    arr = new int[this.capacity];
  }

  public int size() {
    return arr.length;
  }

  public void push(int element) throws Exception {
    if (this.capacity == (top + 1)) {
      expand();
    }
    arr[++top] = element;
    System.out.println("element added successfully");

  }

  private void expand() {
    this.capacity = this.capacity * 2;
    int newarr[] = new int[this.capacity];
    for (int i = 0; i < arr.length; i++) {
      newarr[i] = arr[i];
    }
    arr = newarr;

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
    DynamicArrayStack stack = new DynamicArrayStack(5);
    System.out.println(stack.size());
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.push(6);
    System.out.println(stack.top());
    System.out.println(stack.size());

  }
}
