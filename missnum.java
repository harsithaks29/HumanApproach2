import java.io.*;
class missnum
{
		public static void main(String args[])
		{
			int arr[]={7,5,1,2,3,6};
		                 int sumarr=0;
                                                   int n=7;
                                                  int sum=sum=(n*(n+1))/2;
                                                  for(int i=0;i<arr.length;i++)
			{
				sumarr=sumarr+arr[i];
			}
			System.out.println(sumarr);
	                                   int missnum=sum-sumarr;
                                                   System.out.print(missnum);
  		}
}
