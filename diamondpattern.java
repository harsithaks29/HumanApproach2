import java.io.*;
class diamondpattern{
         public static void main(String args[])
          {
              int i,sp,j,k,l,d,m,n=5;
               for(i=1;i<=n*2;i++)
             {
                     if(i<=n)
                    {
                         for(j=n;j>=i;j--)
                         {
                                 System.out.print("*");
                        }
                     for(d=1;d<=i*2-2;d++)
                      {
                       System.out.print(" ");
                      }
                         for(k=i;k<=n;k++)
	       {
                               System.out.print("*");
	       }
                     System.out.println();
                     }
              else
             {
                     for(l=1;l<=i-n;l++)
                      {
                            System.out.print("*");
                       }
          	     for(sp=1;sp<=n*2-i;sp++)
                      {
                           System.out.print("  ");
                      }
                     for(m=1;m<=i-n;m++)
                      {
                             System.out.print("*");
                      }
                      System.out.println();
                      }
             }
  	}
            }