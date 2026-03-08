import java.util.*;

public class SlidingWindowMax
{
public static void maxSlidingWindow(int[] nums, int k)
{
Deque<Integer> dq = new LinkedList<>();
for (int i = 0; i < nums.length; i++)
{
if (!dq.isEmpty() && dq.peekFirst() == i - k)
dq.pollFirst();
while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i])
dq.pollLast();
dq.addLast(i);
if (i >= k - 1)
System.out.print(nums[dq.peekFirst()] + " ");
}
}
public static void main(String[] args)
{
int[] arr = {1,3,-1,-3,5,3,6,7};
int k = 3;
maxSlidingWindow(arr, k);
}
}
