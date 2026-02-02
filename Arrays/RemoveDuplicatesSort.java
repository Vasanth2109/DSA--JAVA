public class RemoveDuplicatesSort 
{
    public static void main(String[] args) 
    {
        int[] arr = {1,1,2,2,3,4,4,5,5,6,7,8,8};
        int result = removeDuplicates(arr);
        System.out.println("Unique Count:" + result);
    }
    public static int removeDuplicates(int[] arr)
    {
        if(arr.length==0)
        {
            return 0;
        }
        int i=0;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=arr[i])
            {
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }

}
