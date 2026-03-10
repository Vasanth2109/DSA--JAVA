import java.util.*;

public class InterleaveQueue
{
public static void interleave(Queue<Integer> q)
{
int n = q.size();
Queue<Integer> firstHalf = new LinkedList<>();
for (int i = 0; i < n / 2; i++)
{
firstHalf.add(q.remove());
}
while (!firstHalf.isEmpty())
{
q.add(firstHalf.remove());
q.add(q.remove());
}
System.out.println(q);
}
public static void main(String[] args)
{
Queue<Integer> q = new LinkedList<>();
q.add(1);
q.add(2);
q.add(3);
q.add(4);
q.add(5);
q.add(6);
interleave(q);
}
}
