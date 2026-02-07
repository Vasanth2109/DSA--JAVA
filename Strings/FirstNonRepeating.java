public class FirstNonRepeating
{
public static void main(String[] args)
{
String s = "swiss";
int[] freq = new int[256];
for (int i = 0; i < s.length(); i++)
{
freq[s.charAt(i)]++;
}
for (int i = 0; i < s.length(); i++)
{
if (freq[s.charAt(i)] == 1)
{
System.out.println(s.charAt(i));
break;
}
}
}
}
