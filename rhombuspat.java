public class rhombuspat
{
public static void main(String args[])
    {
      int n=5;
        
     
        for(int i=1;i<=n;i++)
        {
            for(int sp=n;sp>i;sp-- )
            {
                System.out.print("_");
            }
            for (int j=1;j<=n;j++)
            {
              System.out.print("*");
            }
              System.out.println();
        }
    }
}