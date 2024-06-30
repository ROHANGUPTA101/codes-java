import java. util.*;
public class greatestcommondev
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      System .out.println("enter the two no. for greatest common devisor");
      int a = sc.nextInt();
      int b =sc.nextInt();
      while(a!=b)
      {
        if(a>b)
        {
            a=a-b;
        }
        else
        {
            b=b-a;
        }
      }
      System.out.println("gcd "+ b);

    }
}  