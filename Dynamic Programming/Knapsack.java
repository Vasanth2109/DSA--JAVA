import java.util.*;

public class Knapsack
{
static int knapsack(int[] wt, int[] val, int W)
{
int n = wt.length;
int[][] dp = new int[n + 1][W + 1];
for (int i = 1; i <= n; i++)
{
for (int w = 0; w <= W; w++)
{
if (wt[i - 1] <= w)
{
int take = val[i - 1] + dp[i - 1][w - wt[i - 1]];
int skip = dp[i - 1][w];
dp[i][w] = Math.max(take, skip);
}
else
{
dp[i][w] = dp[i - 1][w];
}
}
}
return dp[n][W];
}
public static void main(String[] args)
{
int[] wt = {1, 3, 4, 5};
int[] val = {1, 4, 5, 7};
int W = 7;
System.out.println("Max Value = " + knapsack(wt, val, W));
}
}
