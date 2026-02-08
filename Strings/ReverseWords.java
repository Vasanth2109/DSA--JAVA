public class ReverseWords
{
public static void main(String[] args)
{
String s = "java is fun";
String[] words = s.split(" ");
String result = "";
for (int i = words.length - 1; i >= 0; i--)
{
result += words[i] + " ";
}
System.out.println(result.trim());
}
}
