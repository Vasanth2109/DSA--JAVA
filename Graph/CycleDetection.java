import java.util.*;

public class CycleDetection
{
static boolean dfs(ArrayList<ArrayList<Integer>> graph,int node,boolean[] visited,int parent)
{
visited[node] = true;
for (int neighbor : graph.get(node))
{
if (!visited[neighbor])
{
if (dfs(graph, neighbor, visited, node))
return true;
}
else if (neighbor != parent)
{
return true;
}
}
return false;
}
public static void main(String[] args)
{
int V = 3;
ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
for (int i = 0; i < V; i++)
graph.add(new ArrayList<>());

graph.get(0).add(1);
graph.get(1).add(0);
graph.get(1).add(2);
graph.get(2).add(1);
graph.get(2).add(0);
graph.get(0).add(2);
boolean[] visited = new boolean[V];
boolean hasCycle = false;
for (int i = 0; i < V; i++)
{
if (!visited[i])
{
if (dfs(graph, i, visited, -1))
{
hasCycle = true;
break;
}
}
}
System.out.println("Cycle Present: " + hasCycle);
}
}
