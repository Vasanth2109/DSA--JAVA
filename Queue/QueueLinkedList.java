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

class QueueLinkedList
{
Node front;
Node rear;
void enqueue(int value)
{
Node newNode = new Node(value);
if (rear == null)
{
front = rear = newNode;
return;
}
rear.next = newNode;
rear = newNode;
}
int dequeue()
{
if (front == null)
{
System.out.println("Queue is Empty");
return -1;
}
int removed = front.data;
front = front.next;
if (front == null)
{
rear = null;
}
return removed;
}
int peek()
{
if (front == null)
{
System.out.println("Queue is Empty");
return -1;
}
return front.data;
}
boolean isEmpty()
{
return front == null;
}
}

public class Main
{
public static void main(String[] args)
{
QueueLinkedList q = new QueueLinkedList();
q.enqueue(10);
q.enqueue(20);
q.enqueue(30);
System.out.println("Removed: " + q.dequeue());
System.out.println("Front: " + q.peek());
}
}
