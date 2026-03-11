import java.util.*;

class Pair
{
int row;
int col;

Pair(int r, int c)
{
row = r;
col = c;
}
}

public class RottenOranges
{
public static int orangesRotting(int[][] grid)
{
Queue<Pair> q = new LinkedList<>();
int fresh = 0;
int time = 0;
for (int i = 0; i < grid.length; i++)
{
for (int j = 0; j < grid[0].length; j++)
{
if (grid[i][j] == 2)
q.add(new Pair(i, j));
if (grid[i][j] == 1)
fresh++;
}
}
int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
while (!q.isEmpty() && fresh > 0)
{
int size = q.size();
time++;
for (int i = 0; i < size; i++)
{
Pair p = q.remove();
for (int[] d : directions)
{
int r = p.row + d[0];
int c = p.col + d[1];
if (r >= 0 && c >= 0 && r < grid.length && c < grid[0].length && grid[r][c] == 1)
{
grid[r][c] = 2;
fresh--;
q.add(new Pair(r, c));
}
}
}
}
if (fresh == 0)
return time;
return -1;
}
public static void main(String[] args)
{
int[][] grid = {
                {2,1,1},
                {1,1,0},
                {0,1,1}
        };
System.out.println(orangesRotting(grid));
}
}
