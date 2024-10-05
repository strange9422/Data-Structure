package Stack;

class ListNode {
  int data;
  ListNode next;

  ListNode(int data) {
    this.data = data;
    this.next = null;
  }
}

public class LinkedListStack {

  int length;
  ListNode top;

  LinkedListStack() {
    this.length = 0;
    this.top = null;
  }

  public boolean isEmpty() {
    return (length == 0);
  }

  public void push(int data) {
    ListNode node = new ListNode(data);
    node.next = top;
    top = node;
    length++;
    System.out.println("element added");
  }

  public int pop() throws Exception {
    if (isEmpty()) {
      throw new Exception("stack is empty");
    } else {
      int data = top.data;
      top = top.next;
      top.next = null;
      length--;
      return data;
    }
  }

  public int topelement() throws Exception {
    if (isEmpty()) {
      throw new Exception("stack is empty");
    } else {
      return top.data;
    }
  }

  public int size() {
    return length;
  }

  public static void main(String[] args) throws Exception {
    LinkedListStack stack = new LinkedListStack();

    System.out.println(stack.size());
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.push(6);
    System.out.println(stack.topelement());
    System.out.println(stack.size());

  }
}
