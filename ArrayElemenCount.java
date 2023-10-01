import java.util.*;
class ArrayElemenCount
{
      	public static void main(String args[])
	{
		Scanner is=new Scanner(System.in);
                                   System.out.println("Enter x value:");
		int x=is.nextInt();
		int arr[]={1,1,2,2,2,2,3};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(x==arr[i])
			{
				count=count+1;
			}
		}
		if(count==0)
		{
			System.out.println(-1);
    		}
		else
		{
			System.out.print(count);
		}
                       }
}