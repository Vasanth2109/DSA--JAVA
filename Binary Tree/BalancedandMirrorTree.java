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

public class BalancedandMirrorTree
{
static int height(Node root)
{
if (root == null)
return 0;
return Math.max(height(root.left), height(root.right)) + 1;
}
static boolean isBalanced(Node root)
{
if (root == null)
return true;
int left = height(root.left);
int right = height(root.right);
if (Math.abs(left - right) > 1)
return false;
return isBalanced(root.left) && isBalanced(root.right);
}
static Node mirror(Node root)
{
if (root == null)
return null;
Node left = mirror(root.left);
Node right = mirror(root.right);
root.left = right;
root.right = left;
return root;
}
public static void main(String[] args)
{
Node root = new Node(10);
root.left = new Node(20);
root.right = new Node(30);
root.left.left = new Node(40);
root.left.right = new Node(50);
System.out.println("Balanced: " + isBalanced(root));
mirror(root);
System.out.println("Tree mirrored!");
}
}
