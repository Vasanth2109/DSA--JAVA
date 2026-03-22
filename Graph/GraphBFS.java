import java.util.*;

public class GraphBFS
{
static void addEdge(ArrayList<ArrayList<Integer>> graph, int u, int v)
{
graph.get(u).add(v);
graph.get(v).add(u);
}
static void bfs(ArrayList<ArrayList<Integer>> graph, int start)
{
boolean[] visited = new boolean[graph.size()];
Queue<Integer> q = new LinkedList<>();
visited[start] = true;
q.add(start);
while (!q.isEmpty())
{
int node = q.remove();
System.out.print(node + " ");
for (int neighbor : graph.get(node))
{
if (!visited[neighbor])
{
visited[neighbor] = true;
q.add(neighbor);
}
}
}
}

public static void main(String[] args)
{
int V = 4;
ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
for (int i = 0; i < V; i++)
graph.add(new ArrayList<>());
addEdge(graph, 0, 1);
addEdge(graph, 0, 2);
addEdge(graph, 1, 3);
addEdge(graph, 2, 3);
bfs(graph, 0);
}
}
