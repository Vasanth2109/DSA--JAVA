import java.util.*;

class Pair
{
int node, dist;
Pair(int node, int dist)
{
this.node = node;
this.dist = dist;
}
}

public class Dijkstra
{
static void dijkstra(ArrayList<ArrayList<Pair>> graph, int src)
{
int V = graph.size();
int[] dist = new int[V];
Arrays.fill(dist, Integer.MAX_VALUE);
PriorityQueue<Pair> pq =
new PriorityQueue<>((a, b) -> a.dist - b.dist);
dist[src] = 0;
pq.add(new Pair(src, 0));
while (!pq.isEmpty())
{
Pair current = pq.poll();
int node = current.node;
for (Pair neighbor : graph.get(node))
{
int newDist = dist[node] + neighbor.dist;
if (newDist < dist[neighbor.node])
{
dist[neighbor.node] = newDist;
pq.add(new Pair(neighbor.node, newDist));
}
}
}
for (int i = 0; i < V; i++)
{
System.out.println("Distance from " + src + " to " + i + " = " + dist[i]);
}
}
public static void main(String[] args)
{
int V = 4;
ArrayList<ArrayList<Pair>> graph = new ArrayList<>();
for (int i = 0; i < V; i++)
graph.add(new ArrayList<>());
graph.get(0).add(new Pair(1, 4));
graph.get(0).add(new Pair(2, 1));
graph.get(2).add(new Pair(1, 2));
graph.get(1).add(new Pair(3, 1));
graph.get(2).add(new Pair(3, 5));
dijkstra(graph, 0);
}
}
