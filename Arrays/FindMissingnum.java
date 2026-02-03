public class FindMissingnum 
{
    public static void main (String[] args) 
    {
        int[] arr = {0,1,2,3,5,6,7,8,9};
        int n = arr.length;
        int missingNumber = findMissingNumber(arr, n);
        System.out.println("Missing Number: " + missingNumber);
    }
    public static int findMissingNumber(int[] arr, int n) 
    {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) 
        {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
