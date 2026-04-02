import java.util.*;

public class ClimbingStairs
{
static int climbStairs(int n)
{
if (n <= 2)
return n;
int[] dp = new int[n + 1];
dp[1] = 1;
dp[2] = 2;
for (int i = 3; i <= n; i++)
{
dp[i] = dp[i - 1] + dp[i - 2];
}
return dp[n];
}
static int climbStairsOptimized(int n)
{
if (n <= 2)
return n;
int prev2 = 1;
int prev1 = 2;
for (int i = 3; i <= n; i++)
{
int curr = prev1 + prev2;
prev2 = prev1;
prev1 = curr;
}
return prev1;
}
public static void main(String[] args)
{
int n = 5;
System.out.println("Using DP Array: " + climbStairs(n));
System.out.println("Space Optimized: " + climbStairsOptimized(n));
}
}
