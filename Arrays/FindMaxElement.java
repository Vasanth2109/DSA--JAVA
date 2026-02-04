public class FindMaxElement
 {
    public static void main (String args[])
    {
        int[][] array2D = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int maxElement = array2D[0][0];
        for (int i = 0; i < array2D.length; i++)
        {
            for (int j = 0; j < array2D[i].length; j++)
            {
                if (array2D[i][j] > maxElement)
                {
                    maxElement = array2D[i][j];
                }
            }
        }

        System.out.println("Maximum element in the 2D array: " + maxElement);
    }
}
