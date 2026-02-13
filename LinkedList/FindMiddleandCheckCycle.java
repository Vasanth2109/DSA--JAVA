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

public class FindMiddleandCheckCycle
{
static Node findMiddle(Node head)
{
Node slow = head;
Node fast = head;

while (fast != null && fast.next != null)
{
slow = slow.next;
fast = fast.next.next;
}

return slow;
}

static boolean hasCycle(Node head)
{
Node slow = head;
Node fast = head;

while (fast != null && fast.next != null)
{
slow = slow.next;
fast = fast.next.next;

if (slow == fast)
{
return true;
}
}
return false;
}

static void printList(Node head)
{
Node temp = head;
while (temp != null)
{
System.out.print(temp.data + " -> ");
temp = temp.next;
}
System.out.println("null");
}

public static void main(String[] args)
{

Node head = new Node(10);
head.next = new Node(20);
head.next.next = new Node(30);
head.next.next.next = new Node(40);
head.next.next.next.next = new Node(50);

System.out.print("List: ");
printList(head);

Node middle = findMiddle(head);
System.out.println("Middle Node: " + middle.data);

System.out.println("Has Cycle? " + hasCycle(head));
}
}
