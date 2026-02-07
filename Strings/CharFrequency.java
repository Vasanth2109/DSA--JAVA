public class CharFrequency
{
public static void main(String[] args)
{
String s = "banana";
int[] freq = new int[256];
for (int i = 0; i < s.length(); i++)
{
char ch = s.charAt(i);
freq[ch]++;
}
for (int i = 0; i < s.length(); i++)
{
char ch = s.charAt(i);
if (freq[ch] != 0)
{
System.out.println(ch + " : " + freq[ch]);
freq[ch] = 0; // avoid duplicate printing
}
}
}
}
