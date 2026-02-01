public class SecondLargest
{
public static void main(String args[])
{
int[] array={35,7,33,34,20,37,38};
int result=findsecondlargest(array);
System.out.print(result);
}
public static int findsecondlargest(int[] array)
{
int largest=Integer.MIN_VALUE;
int secondlargest=Integer.MIN_VALUE;
for(int i=0;i<array.length;i++)
{
if(array[i]>largest)
{
secondlargest=largest;
largest=array[i];
}
else if(array[i]>secondlargest && array[i]!=largest)
{
secondlargest=array[i];
}
}
return secondlargest;
}
}

