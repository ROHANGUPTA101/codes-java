public class invertedhalfpyramid
{
public static void main(String args[])
    {
        int n=4;
     
        for(int i=1;i<=n;i++)
        {
            for (int sp=1;sp<=n-i;sp++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
              System.out.print("*");
            }
              System.out.println();
        }
    }
}