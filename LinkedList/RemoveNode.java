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

public class RemoveNode
{

static Node removeNthFromEnd(Node head, int n)
{
Node dummy = new Node(0);
dummy.next = head;
Node slow = dummy;
Node fast = dummy;

for (int i = 0; i <= n; i++)
{
fast = fast.next;
}
while (fast != null)
{
slow = slow.next;
fast = fast.next;
}
slow.next = slow.next.next;
return dummy.next;
}

static void printList(Node head)
{
Node temp = head;
while (temp != null)
{
System.out.print(temp.data + " → ");
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

System.out.print("Original: ");
printList(head);
head = removeNthFromEnd(head, 2);
System.out.print("After removing 2nd from end: ");
printList(head);
}
}
