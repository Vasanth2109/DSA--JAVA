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

public class HeightandCount
{
static int height(Node root)
{
if (root == null)
return 0;
int left = height(root.left);
int right = height(root.right);
return Math.max(left, right) + 1;
}
static int countNodes(Node root)
{
if (root == null)
return 0;
return countNodes(root.left) + countNodes(root.right) + 1;
}
public static void main(String[] args)
{
Node root = new Node(10);
root.left = new Node(20);
root.right = new Node(30);
root.left.left = new Node(40);
root.left.right = new Node(50);
System.out.println("Height: " + height(root));
System.out.println("Total Nodes: " + countNodes(root));
}
}
