import java.util.*;

public class ShortestPath
{
static void bfs(ArrayList<ArrayList<Integer>> graph, int start)
{
int V = graph.size();
int[] dist = new int[V];
Arrays.fill(dist, -1);
Queue<Integer> q = new LinkedList<>();
dist[start] = 0;
q.add(start);
while (!q.isEmpty())
{
int node = q.remove();
for (int neighbor : graph.get(node))
{
if (dist[neighbor] == -1)
{
dist[neighbor] = dist[node] + 1;
q.add(neighbor);
}
}
}
for (int i = 0; i < V; i++)
{
System.out.println("Distance from " + start + " to " + i + " = " + dist[i]);
}
}
public static void main(String[] args)
{
int V = 4;
ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
for (int i = 0; i < V; i++)
graph.add(new ArrayList<>());
graph.get(0).add(1);
graph.get(1).add(0);
graph.get(0).add(2);
graph.get(2).add(0);
graph.get(1).add(3);
graph.get(3).add(1);
graph.get(2).add(3);
graph.get(3).add(2);
bfs(graph, 0);
}
}
