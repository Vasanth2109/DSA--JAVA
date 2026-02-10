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

public class InsertEndBegin
{
static Node insertAtBeginning(Node head, int data)
{
Node newNode = new Node(data);
newNode.next = head;
return newNode;
}
static Node insertAtEnd(Node head, int data)
{
Node newNode = new Node(data);

if (head == null)
{
return newNode;
}

Node temp = head;
while (temp.next != null)
{
temp = temp.next;
}

temp.next = newNode;
return head;
}

static int length(Node head)
{
int count = 0;
Node temp = head;

while (temp != null)
{
count++;
temp = temp.next;
}
return count;
}

public static void main(String[] args)
{

Node head = null;
head = insertAtEnd(head, 10);
head = insertAtEnd(head, 20);
head = insertAtEnd(head, 30);

head = insertAtBeginning(head, 5);

System.out.println("Length = " + length(head));
}
}
