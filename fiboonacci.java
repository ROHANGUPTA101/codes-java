import java.util.Scanner;
public class fiboonacci
{
public static void main(String args[])
        { 
            Scanner sc = new Scanner (System.in);
            System.out.println("enter till were you want fibonacci series");
             int n= sc.nextInt();
             int sum;
            int a =0;
            int b=1;
            System.out.print(a+" ");
            System.out.print(b+" ");
            for(int i=3;i<=n;i++)
              {
                sum= a+b;
                a=b;
                b=sum;
               System.out.print(sum+" ");
              }
    }
}