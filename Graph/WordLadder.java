import java.util.*;

public class WordLadder
{
static int ladderLength(String beginWord, String endWord, List<String> wordList)
{
Set<String> set = new HashSet<>(wordList);
if (!set.contains(endWord))
return 0;
Queue<String> q = new LinkedList<>();
q.add(beginWord);
int level = 1;
while (!q.isEmpty())
{
int size = q.size();
for (int i = 0; i < size; i++)
{
String word = q.remove();
if (word.equals(endWord))
return level;
char[] arr = word.toCharArray();
for (int j = 0; j < arr.length; j++)
{
char original = arr[j];
for (char c = 'a'; c <= 'z'; c++)
{
arr[j] = c;
String newWord = new String(arr);
if (set.contains(newWord))
{
q.add(newWord);
set.remove(newWord);
}
}
arr[j] = original;
}
}
level++;
}
return 0;
}
public static void main(String[] args)
{
String beginWord = "hit";
String endWord = "cog";
List<String> wordList = Arrays.asList("hot","dot","dog","lot","log","cog");
System.out.println(ladderLength(beginWord, endWord, wordList));
}
}
