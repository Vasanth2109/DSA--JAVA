public class Column_wise_sum
{
    public static void main (String args[])
    {
        int[][] array2D = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int j = 0; j < array2D[0].length; j++)
        {
            int colSum = 0;
            for (int i = 0; i < array2D.length; i++)
            {
                colSum += array2D[i][j];
            }
            System.out.println("Sum of column " + j + ": " + colSum);
        }
    }
    
}
