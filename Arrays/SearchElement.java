public class SearchElement
{
    public static void main (String args[])
    {
        int[][] array2D = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int target = 5;
        boolean found = false;

        for (int i = 0; i < array2D.length; i++)
        {
            for (int j = 0; j < array2D[i].length; j++)
            {
                if (array2D[i][j] == target)
                {
                    found = true;
                    System.out.println("Element " + target + " found at position (" + i + ", " + j + ")");
                    break;
                }
            }
            if (found)
            {
                break;
            }
        }

        if (!found)
        {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
    
}
