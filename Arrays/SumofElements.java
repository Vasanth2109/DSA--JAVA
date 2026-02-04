public class SumofElements 
{
    public static void main (String args[])
    {
        int[][] array2D = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;
        for (int i = 0; i < array2D.length; i++)
        {
            for (int j = 0; j < array2D[i].length; j++)
            {
                sum += array2D[i][j];
            }
        }

        System.out.println("Sum of all elements: " + sum);
    }
    
}
