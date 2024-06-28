import java.util.Scanner;
public class countposnegzero
{
public static void main(String args[])
        { 
            Scanner sc = new Scanner (System.in);
             int n= sc.nextInt();
      
             int c,c1,c2;
             c=0;c1=0;c2=0;
        
            for(int i=1;i<=n;i++)
              {
                int a= sc.nextInt();
                if(a>0)
                c++;
                else if(a<0)
                c1++;
                else
                c2++;
               }
               System.out.println("no.of positive integer are"+c);
               System.out.println("no.of negative integer are"+c1);
               System.out.println("no.of zero are"+c2);
          
           
        }
    }