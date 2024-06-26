public class diamond
{
public static void main(String args[])
    {
      int n= 4;
//upper half of the diamond  
        for(int i=1;i<=n;i++)
        {
            for(int sp=n-i;sp>=0;sp--)
            {
                System.out.print(" ");
            }
              for(int j=1;j<=2*i-1;j++)
              {
                System.out.print("*");
              }
        
        System.out.println();
    }
//lower half of the diamond
    for(int i=n;i>=1;i--)
    {
        for(int sp=0;sp<=n-i;sp++)
        {
            System.out.print(" ");
        }
          for(int j=2*i-1;j>=1;j--)
          {
            System.out.print("*");
          }
    
    System.out.println();
   }
 }
}
