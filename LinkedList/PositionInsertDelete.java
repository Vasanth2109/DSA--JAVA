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

public class PositionInsertDelete
{
static Node insertAtPosition(Node head, int data, int pos)
{
if (pos == 1)
{
Node newNode = new Node(data);
newNode.next = head;
return newNode;
}

Node temp = head;
for (int i = 1; i < pos - 1 && temp != null; i++)
{
temp = temp.next;
}
if (temp == null)
{
System.out.println("Position out of range");
return head;
}

Node newNode = new Node(data);
newNode.next = temp.next;
temp.next = newNode;

return head;
}

static Node deleteAtPosition(Node head, int pos)
{
if (head == null)
{
return null;
}
if (pos == 1)
{
return head.next;
}

Node temp = head;
for (int i = 1; i < pos - 1 && temp.next != null; i++)
{
temp = temp.next;
}
if (temp.next == null)
{
System.out.println("Position out of range");
return head;
}
temp.next = temp.next.next;
return head;
}

static Node deleteByValue(Node head, int key)
{
if (head == null)
{
return null;
}
if (head.data == key)
{
return head.next;
}

Node temp = head;
while (temp.next != null && temp.next.data != key)
{
temp = temp.next;
}
if (temp.next == null)
{
System.out.println("Value not found");
return head;
}
temp.next = temp.next.next;
return head;
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
Node head = null;
head = insertAtPosition(head, 10, 1);
head = insertAtPosition(head, 20, 2);
head = insertAtPosition(head, 30, 3);

System.out.print("Initial List: ");
printList(head);

head = insertAtPosition(head, 15, 3);
System.out.print("After inserting 15 at position 3: ");
printList(head);

head = deleteAtPosition(head, 2);
System.out.print("After deleting position 2: ");
printList(head);

head = deleteByValue(head, 30);
System.out.print("After deleting value 30: ");
printList(head);
}
}
