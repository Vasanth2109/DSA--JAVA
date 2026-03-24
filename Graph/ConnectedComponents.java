import java.util.*;

public class ConnectedComponents
{
static void dfs(ArrayList<ArrayList<Integer>> graph, int node, boolean[] visited)
{
visited[node] = true;
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
int V = 5;
ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
for (int i = 0; i < V; i++)
graph.add(new ArrayList<>());
graph.get(0).add(1);
graph.get(1).add(0);
graph.get(3).add(4);
graph.get(4).add(3);
boolean[] visited = new boolean[V];
int count = 0;
for (int i = 0; i < V; i++)
{
if (!visited[i])
{
dfs(graph, i, visited);
count++;
}
}
System.out.println("Connected Components: " + count);
}
}
