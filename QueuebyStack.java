import java.util.Stack;

class QueueUsingStacks
{
Stack<Integer> stack1 = new Stack<>();
Stack<Integer> stack2 = new Stack<>();
void enqueue(int value)
{
stack1.push(value);
}
int dequeue()
{
if (stack1.isEmpty() && stack2.isEmpty())
{
System.out.println("Queue is Empty");
return -1;
}
if (stack2.isEmpty())
{
while (!stack1.isEmpty())
{
stack2.push(stack1.pop());
}
}
return stack2.pop();
}
int peek()
{
if (stack1.isEmpty() && stack2.isEmpty())
{
System.out.println("Queue is Empty");
return -1;
}
if (stack2.isEmpty())
{
while (!stack1.isEmpty())
{
stack2.push(stack1.pop());
}
}
return stack2.peek();
}
}

public class QueuebyStack
{
public static void main(String[] args)
{
QueueUsingStacks q = new QueueUsingStacks();
q.enqueue(10);
q.enqueue(20);
q.enqueue(30);
System.out.println(q.dequeue());
System.out.println(q.peek());   
}
}
