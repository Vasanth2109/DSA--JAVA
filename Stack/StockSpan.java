import java.util.Stack;

public class StockSpan
{
public static void calculateSpan(int price[])
{
int n = price.length;
int span[] = new int[n];
Stack<Integer> stack = new Stack<>();
span[0] = 1;
stack.push(0);
for (int i = 1; i < n; i++)
{
while (!stack.isEmpty() && price[stack.peek()] <= price[i])
{
stack.pop();
}
if (stack.isEmpty())
{
span[i] = i + 1;
}
else
{
span[i] = i - stack.peek();
}
stack.push(i);
}
for (int i = 0; i < n; i++)
{
System.out.println(price[i] + " → " + span[i]);
}
}
public static void main(String[] args)
{
int price[] = {100, 80, 60, 70, 60, 75, 85};
calculateSpan(price);
}
}
