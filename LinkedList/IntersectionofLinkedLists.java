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

public class IntersectionofLinkedLists
{
static Node getIntersectionNode(Node headA, Node headB)
{
if (headA == null || headB == null)
return null;

Node pointerA = headA;
Node pointerB = headB;

while (pointerA != pointerB)
{
if (pointerA == null)
pointerA = headB;

else
pointerA = pointerA.next;

if (pointerB == null)
pointerB = headA;

else
pointerB = pointerB.next;
}
return pointerA;
}

public static void main(String[] args)
{
Node common1 = new Node(7);
Node common2 = new Node(8);
Node common3 = new Node(9);

common1.next = common2;
common2.next = common3;

Node headA = new Node(1);
headA.next = new Node(2);
headA.next.next = new Node(3);
headA.next.next.next = common1;

Node headB = new Node(4);
headB.next = new Node(5);
headB.next.next = common1;

Node result = getIntersectionNode(headA, headB);

if (result != null)
System.out.println("Intersection at node: " + result.data);
else
System.out.println("No intersection");
}
}
