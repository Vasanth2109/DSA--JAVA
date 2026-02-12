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

public class ReverseLinkedList
{
static Node reverseIterative(Node head)
{

Node prev = null;
Node current = head;
Node next = null;

while (current != null)
{
next = current.next;      
current.next = prev;      
prev = current;           
current = next;           
}
return prev;
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

System.out.print("Original: ");
printList(head);

head = reverseIterative(head);
System.out.print("Reversed: ");
printList(head);
}
}
