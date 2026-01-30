public class BinarySearch
{
public static void main(String args[])
{
int[] array={2,4,6,8,10};
int target=8;
int index=binarysearch(array,target);
System.out.println(index);
}
public static int binarysearch(int[] array,int target)
{
int left=0;
int right=array.length-1;
while(left<=right)
{
int mid=left+(right-left)/2;
if(array[mid]==target)
{
return mid;
}
if(array[mid]<target)
{
left=mid+1;
}
else
{
right=mid-1;
}
}
return -1;
}
}
