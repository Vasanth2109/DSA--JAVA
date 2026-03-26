import java.util.*;

public class DirectedCycle
{
static boolean dfs(ArrayList<ArrayList<Integer>> graph,int node,boolean[] visited,boolean[] recStack)
{
visited[node] = true;
recStack[node] = true;
for (int neighbor : graph.get(node))
{
if (!visited[neighbor])
{
if (dfs(graph, neighbor, visited, recStack))
return true;
}
else if (recStack[neighbor])
{
return true;
}
}
recStack[node] = false;
return false;
}
public static void main(String[] args)
{
int V = 3;
ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
for (int i = 0; i < V; i++)
graph.add(new ArrayList<>());
graph.get(0).add(1);
graph.get(1).add(2);
graph.get(2).add(0);
boolean[] visited = new boolean[V];
boolean[] recStack = new boolean[V];
boolean hasCycle = false;
for (int i = 0; i < V; i++)
{
if (!visited[i])
{
if (dfs(graph, i, visited, recStack))
{
hasCycle = true;
break;
}
}
}
System.out.println("Cycle Present: " + hasCycle);
}
}
