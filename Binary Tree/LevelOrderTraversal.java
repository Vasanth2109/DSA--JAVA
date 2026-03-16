import java.util.*;

class Node
{
int data;
Node left;
Node right;
Node(int data)
{
this.data = data;
left = null;
right = null;
}
}

public class LevelOrderTraversal
{
static void levelOrder(Node root)
{
if (root == null)
return;
Queue<Node> q = new LinkedList<>();
q.add(root);
while (!q.isEmpty())
{
Node current = q.remove();
System.out.print(current.data + " ");
if (current.left != null)
q.add(current.left);
if (current.right != null)
q.add(current.right);
}
}
public static void main(String[] args)
{
Node root = new Node(10);
root.left = new Node(20);
root.right = new Node(30);
root.left.left = new Node(40);
root.left.right = new Node(50);
levelOrder(root);
}
}
