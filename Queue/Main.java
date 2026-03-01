class QueueArray
{
int[] arr;
int front;
int rear;
int size;
int capacity;

QueueArray(int capacity)
{
this.capacity = capacity;
arr = new int[capacity];
front = 0;
rear = -1;
size = 0;
}
void enqueue(int value)
{
if (size == capacity)
{
System.out.println("Queue is Full");
return;
}
rear = (rear + 1) % capacity;
arr[rear] = value;
size++;
System.out.println(value + " inserted");
}
int dequeue()
{
if (size == 0)
{
System.out.println("Queue is Empty");
return -1;
}
int removed = arr[front];
front = (front + 1) % capacity;
size--;
return removed;
}
int peek()
{
if (size == 0)
{
System.out.println("Queue is Empty");
return -1;
}
return arr[front];
}
boolean isEmpty()
{
return size == 0;
}
boolean isFull()
{
return size == capacity;
}
}

public class Main
{
public static void main(String[] args)
{
QueueArray q = new QueueArray(5);
q.enqueue(10);
q.enqueue(20);
q.enqueue(30);
System.out.println("Removed: " + q.dequeue());
System.out.println("Front: " + q.peek());
}
}
