public class ReverseArray
{
public static void main(String args[])
{
int[] nums={3,5,2,1,8};
int start=0;
int end=nums.length - 1;
while(start<end)
{
int temp=nums [start];
nums [start]=nums [end];
nums [end] =temp;
start++;
end--;
}
for(int i=0;i<nums.length;i++)
{
System.out.println(nums[i]+" ");
}
}
}
