import java.util.Stack;

class MyQueue {
  private Stack<Integer> stack1;
  private Stack<Integer> stack2;

  public MyQueue() {
    stack1 = new Stack<>();
    stack2 = new Stack<>();

  }

  // push() : using stack1
  // pop(), peak() : using stack 2 (stack 2 = stack 1 in reversed order)
  // empty() : check both stack is empty
  public void push(int x) {
    stack1.push(x);
  }

  public int pop() {
    transferReversed();
    return stack2.pop();  
  }

  public int peek() {
    transferReversed();
    return stack2.peek(); 

  }

  public boolean empty() {
    if (stack1.empty() && stack2.isEmpty()){
      return true; 
    }
    return false; 
  }

  public void transferReversed() {
    if (stack2.isEmpty()) {
      while (!stack1.isEmpty()) {
        stack2.push(stack1.pop());
      }
    }
  }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */