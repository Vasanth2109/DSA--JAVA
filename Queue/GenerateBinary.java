import java.util.*;

public class GenerateBinary
{
public static void main(String[] args)
{
int n = 5;
Queue<String> q = new LinkedList<>();
q.add("1");
for(int i = 1; i <= n; i++)
{
String current = q.remove();
System.out.println(current);
q.add(current + "0");
q.add(current + "1");
}
}
}
