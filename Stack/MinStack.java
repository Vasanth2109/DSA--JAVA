import java.util.Stack;

class MinStack
{
Stack<Integer> mainStack;
Stack<Integer> minStack;

public MinStack()
{
mainStack = new Stack<>();
minStack = new Stack<>();
}
public void push(int val)
{
mainStack.push(val);
if (minStack.isEmpty() || val <= minStack.peek())
{
minStack.push(val);
}
}

public void pop()
{
if (mainStack.isEmpty())
{
System.out.println("Stack Empty");
return;
}
int removed = mainStack.pop();
if (removed == minStack.peek())
{
minStack.pop();
}
}

public int top()
{
return mainStack.peek();
}

public int getMin()
{
return minStack.peek();
}
}

public class MinStackDemo
{
public static void main(String[] args)
{
MinStack stack = new MinStack();
stack.push(5);
stack.push(3);
stack.push(7);
System.out.println("Min: " + stack.getMin());
stack.pop();
System.out.println("Min: " + stack.getMin());
stack.pop();
System.out.println("Min: " + stack.getMin());
}
}
