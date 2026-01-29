public class LinearSearch
{
public static void main(String args[])
{
int[] array={3,5,2,9,6,8};
int target=8;
int index=Lsearch(array,target);
System.out.println(index);
}
public static int Lsearch(int[] array,int target)
{
for(int i=0;i<array.length;i++)
{
if(array[i]==target)
{
return i;
}
}
return -1;
}
}
