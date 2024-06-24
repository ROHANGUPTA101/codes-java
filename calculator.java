import java .util.*;
 public class calculator {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the operation for calculator");
        String c = sc.nextLine();
        System.out.println("ENTER THE NO.");
        int a = sc.nextInt();
        int b = sc.nextInt();

        switch (c) {
            case "+": System.out.println("sum is " + (a+b));
                       break;
            case "-": System.out.println("substraction is"+ (a-b));
                       break;
            case "*": System.out.println("multiplication is " + (a*b));
                       break;
            case "/": System.out.println("division is " + (a/b));
                       break;
             case "%": System.out.println("remainder is " + (a%b));
                       break;
            default: System.out.println("error");
                break;
        }
    }
 }