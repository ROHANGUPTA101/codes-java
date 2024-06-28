import java.util.*;
public class function
{
    
    public static void factorial(int a) 
    { 
        if(a<=0)
        {
            System.out.println("invalid number");
            return;
        }
        int f=1;
       for(int i=a;i>=1;i--)
       {
           f=f*i;
       }
       System.out.println("factorial is "+f);  
       return ;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no. for factorial");
        int a =sc.nextInt();
        factorial(a);
       
    }
}