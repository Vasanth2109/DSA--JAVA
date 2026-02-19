class Stack
{
int arr[];
int top;
int capacity;

Stack(int size)
{
arr = new int[size];
capacity = size;
top = -1;
}

public void push(int value)
{
if (top == capacity - 1)
{
System.out.println("Stack Overflow");
return;
}
top++;
arr[top] = value;
System.out.println(value + " pushed");
}

public int pop()
{
if (top == -1)
{
System.out.println("Stack Underflow");
return -1;
}
int value = arr[top];
top--;
return value;
}

public int peek()
{
if (top == -1)
{
System.out.println("Stack is Empty");
return -1;
}
return arr[top];
}

public boolean isEmpty()
{
return top == -1;
}
}

public class StackbyArray
{
public static void main(String[] args)
{
Stack s = new Stack(5);
s.push(10);
s.push(20);
s.push(30);
System.out.println("Top element: " + s.peek());
System.out.println("Popped: " + s.pop());
System.out.println("Top element after pop: " + s.peek());
}
}
