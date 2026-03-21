import java.util.*;

class Node
{
int data;
Node left, right;

Node(int data)
{
this.data = data;
}
}

public class TreeViews
{
static void leftView(Node root)
{
if (root == null)
return;
Queue<Node> q = new LinkedList<>();
q.add(root);
while (!q.isEmpty())
{
int size = q.size();
for (int i = 0; i < size; i++)
{
Node curr = q.remove();
if (i == 0)
System.out.print(curr.data + " ");
if (curr.left != null)
q.add(curr.left);
if (curr.right != null)
q.add(curr.right);
}
}
}
static void rightView(Node root)
{
if (root == null)
return;
Queue<Node> q = new LinkedList<>();
q.add(root);
while (!q.isEmpty())
{
int size = q.size();
for (int i = 0; i < size; i++)
{
Node curr = q.remove();
if (i == size - 1)
System.out.print(curr.data + " ");
if (curr.left != null)
q.add(curr.left);
if (curr.right != null)
q.add(curr.right);
}
}
}

public static void main(String[] args)
{
Node root = new Node(10);
root.left = new Node(20);
root.right = new Node(30);
root.left.left = new Node(40);
root.left.right = new Node(50);
root.right.right = new Node(60);
System.out.print("Left View: ");
leftView(root);
System.out.print("\nRight View: ");
rightView(root);
}
}
