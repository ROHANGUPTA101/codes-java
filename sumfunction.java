import java.util.*;
public class sumfunction
{
    //public static void sum(int a, int b)
    {
       // int sum = a+b;
        //return sum;
    }
    public static int prod(int a,int b) 
    {
       return a * b;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two no. for prod");
        int a =sc.nextInt();
        int b= sc.nextInt(); 
       // sum(a, b);
      
      
      //  System.out.println("sum of two no."+ sum);
        System.out.println("product of two no."+ prod(a, b));  
    }
}