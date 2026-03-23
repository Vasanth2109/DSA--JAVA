import java.util.*;

public class GraphbyDFS
{
static void addEdge(ArrayList<ArrayList<Integer>> graph, int u, int v)
{
graph.get(u).add(v);
graph.get(v).add(u);
}
static void dfs(ArrayList<ArrayList<Integer>> graph, int node, boolean[] visited)
{
visited[node] = true;
System.out.print(node + " ");
for (int neighbor : graph.get(node))
{
if (!visited[neighbor])
{
dfs(graph, neighbor, visited);
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
boolean[] visited = new boolean[V];
dfs(graph, 0, visited);
}
}
