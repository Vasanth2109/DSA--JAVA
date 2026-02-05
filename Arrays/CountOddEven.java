public class CountOddEven
{
public static void main(String args[])
{
int[][] array={
               {1,2,3},
               {4,5,6},
               {7,8,9}
              };
int evencount=0;
int oddcount=0;
for(int i=0;i<array.length;i++)
{
for(int j=0;j<array[0].length;j++)
{
if(array[i][j]%2==0)
{
evencount++;
}
else
{
oddcount++;
}
}
}
System.out.println("Even Count :" + evencount);
System.out.print("Odd Count :" + oddcount);
}
}