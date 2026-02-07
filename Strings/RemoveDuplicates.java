public class RemoveDuplicates
{
public static void main(String[] args)
{
String s = "programming";
boolean[] seen = new boolean[256];
String result = "";
for (int i = 0; i < s.length(); i++)
{
char ch = s.charAt(i);
if (!seen[ch])
{
result += ch;
seen[ch] = true;
}
}
System.out.println(result);
}
}
