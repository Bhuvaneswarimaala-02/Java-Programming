package recursion;
import java.util.*;
public class OrderOfPrinting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        fun(n);
    }
    static void fun(int n){
        if(n==0)
            return;
        System.out.println(n);
        fun(n-1);
        System.out.println(n);
    }
}
