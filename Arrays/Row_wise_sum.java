public class Row_wise_sum
{
    public static void main (String args[])
    {
        int[][] array2D = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < array2D.length; i++)
        {
            int rowSum = 0;
            for (int j = 0; j < array2D[i].length; j++)
            {
                rowSum += array2D[i][j];
            }
            System.out.println("Sum of row " + i + ": " + rowSum);
        }
    }
    
}
