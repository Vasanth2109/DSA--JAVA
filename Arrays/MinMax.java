public class MinMax
{
public static void main(String args[])
{
int[] array={5,4,8,3,9,7};
int max=array[0];
int min=array[0];
for(int i=1;i<array.length;i++)
{
if(array[i]>max)
{
max=array[i];
}
if(array[i]<min)
{
min=array[i];
}
}
System.out.println("the smallest number is:"+min);
System.out.println("the largest number is:"+max);
}
}
