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
public class RootToLeaf
{
static void printPaths(Node root, List<Integer> path)
{
if (root == null)
return;
path.add(root.data);
if (root.left == null && root.right == null)
{
System.out.println(path);
}
else
{
printPaths(root.left, path);
printPaths(root.right, path);
}
path.remove(path.size() - 1);
}
public static void main(String[] args)
{
Node root = new Node(10);
root.left = new Node(20);
root.right = new Node(30);
root.left.left = new Node(40);
root.left.right = new Node(50);
printPaths(root, new ArrayList<>());
}
}
