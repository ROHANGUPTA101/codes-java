public class butterfly
{
public static void main(String args[])
    {
      
      int n=4;
      //upper part of butterfly
        for(int i=1;i<=n;i++)
        {
            
            for (int j=1;j<=i;j++)
            { 
              System.out.print("*");
            }
            for(int sp=(2*(n-i));sp>=0;sp--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
              System.out.print("*");
            }
            System.out.println(); 
        } 
        //now bottom part pf butterfly
        for(int i=n;i>=1;i--)
        {
            for (int j=i;j>=1;j--)
            {
                System.out.print("*");
            }
            for(int sp =0;sp<=(2*(n-i));sp++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}