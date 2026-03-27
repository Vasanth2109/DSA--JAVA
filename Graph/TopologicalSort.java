import java.util.*;

public class TopologicalSort
{
public static void main(String[] args)
{
int V = 6;
ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
for (int i = 0; i < V; i++)
graph.add(new ArrayList<>());
graph.get(5).add(2);
graph.get(5).add(0);
graph.get(4).add(0);
graph.get(4).add(1);
graph.get(2).add(3);
graph.get(3).add(1);
int[] indegree = new int[V];
for (int i = 0; i < V; i++)
{
for (int neighbor : graph.get(i))
{
indegree[neighbor]++;
}
}
Queue<Integer> q = new LinkedList<>();
for (int i = 0; i < V; i++)
{
if (indegree[i] == 0)
q.add(i);
}
while (!q.isEmpty())
{
int node = q.remove();
System.out.print(node + " ");
for (int neighbor : graph.get(node))
{
indegree[neighbor]--;
if (indegree[neighbor] == 0)
q.add(neighbor);
}
}
}
}
