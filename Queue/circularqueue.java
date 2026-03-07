class CircularQueue
{
int[] arr;
int front;
int rear;
int size;

CircularQueue(int size)
{
this.size = size;
arr = new int[size];
front = -1;
rear = -1;
}
boolean isFull()
{
return (rear + 1) % size == front;
}
boolean isEmpty()
{
return front == -1;
}
void enqueue(int value)
{
if (isFull())
{
System.out.println("Queue is Full");
return;
}
if (front == -1)
front = 0;
rear = (rear + 1) % size;
arr[rear] = value;
System.out.println(value + " inserted");
}
int dequeue()
{
if (isEmpty())
{
System.out.println("Queue is Empty");
return -1;
}
int result = arr[front];
if (front == rear)
{
front = rear = -1;
}
else
{
front = (front + 1) % size;
}
return result;
}
void display()
{
if (isEmpty())
{
System.out.println("Queue Empty");
return;
}
int i = front;
while (true)
{
System.out.print(arr[i] + " ");
if (i == rear)
break;
i = (i + 1) % size;
}
System.out.println();
}
}

public class circularqueue
{
public static void main(String[] args)
{
CircularQueue q = new CircularQueue(5);
q.enqueue(10);
q.enqueue(20);
q.enqueue(30);
q.enqueue(40);
q.display();
q.dequeue();
q.dequeue();
q.enqueue(50);
q.enqueue(60);
q.display();
}
}
