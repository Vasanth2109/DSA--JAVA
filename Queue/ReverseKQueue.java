import java.util.*;

public class ReverseKQueue
{
public static void reverseK(Queue<Integer> q, int k)
{
Stack<Integer> stack = new Stack<>();
for(int i = 0; i < k; i++)
{
stack.push(q.remove());
}
while(!stack.isEmpty())
{
q.add(stack.pop());
}
int size = q.size();
for(int i = 0; i < size - k; i++)
{
q.add(q.remove());
}
System.out.println(q);
}
public static void main(String[] args)
{
Queue<Integer> q = new LinkedList<>();
q.add(10);
q.add(20);
q.add(30);
q.add(40);
q.add(50);
reverseK(q, 3);
}
}
