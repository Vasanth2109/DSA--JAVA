import java.util.*;

public class FirstNonRepeating
{
public static void main(String[] args)
{
String stream = "aabc";
Queue<Character> q = new LinkedList<>();
nt[] freq = new int[26];
for(int i = 0; i < stream.length(); i++)
{
char ch = stream.charAt(i);
freq[ch - 'a']++;
q.add(ch);
while(!q.isEmpty() && freq[q.peek() - 'a'] > 1)
{
q.remove();
}
if(q.isEmpty())
{
System.out.println(-1);
}
else
{
System.out.println(q.peek());
}
}
}
}
