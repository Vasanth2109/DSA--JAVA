public class BoundaryElements
{
public static void main(String[] args)
{
int[][] arr ={
              {1, 2, 3},
              {4, 5, 6},
              {7, 8, 9}
             };
int lastRow = arr.length - 1;
int lastCol = arr[0].length - 1;
for (int i = 0; i < arr.length; i++)
{
for (int j = 0; j < arr[i].length; j++)
{
if (i == 0 || i == lastRow || j == 0 || j == lastCol)
{
System.out.print(arr[i][j] + " ");
}
else
{
System.out.print("  ");
}
}
System.out.println();
}
}
}
