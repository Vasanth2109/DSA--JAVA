public class LongestWord
{
public static void main(String[] args)
{
String s = "I love competitive programming";
String[] words = s.split(" ");
String longest = words[0];
for (int i = 1; i < words.length; i++)
{
if (words[i].length() > longest.length())
{
longest = words[i];
}
}
System.out.println(longest);
}
}
