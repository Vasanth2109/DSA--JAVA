public class MoveZero
{
public static void main(String args[])
{
int[] array={0,2,0,5,7,0};
moveZeros(array);
for(int num:array)
{
System.out.print(num + " ");
}
}
public static void moveZeros(int[] array)
{
int j=0;
for(int i=0;i<array.length;i++)
{
if(array[i]!=0)
{
int temp=array[i];
array[i]=array[j];
array[j]=temp;
j++;
}
}
}
}
