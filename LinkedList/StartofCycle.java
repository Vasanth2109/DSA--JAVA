class Node
{
int data;
Node next;
Node(int data)
{
this.data = data;
this.next = null;
}
}

public class StartofCycle
{
static Node detectCycleStart(Node head)
{
Node slow = head;
Node fast = head;
while (fast != null && fast.next != null)
{
slow = slow.next;
fast = fast.next.next;
if (slow == fast)
{
slow = head;
while (slow != fast)
{
slow = slow.next;
fast = fast.next;
}
return slow;
}
}
return null;
}
public static void main(String[] args)
{
Node head = new Node(10);
Node second = new Node(20);
Node third = new Node(30);
Node fourth = new Node(40);
Node fifth = new Node(50);
head.next = second;
second.next = third;
third.next = fourth;
fourth.next = fifth;
fifth.next = third;

Node result = detectCycleStart(head);
if (result != null)
{
System.out.println("Cycle starts at: " + result.data);
}
else
{
System.out.println("No cycle found");
}
}
}
