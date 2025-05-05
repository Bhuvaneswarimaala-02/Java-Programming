package dynamicProgramming;

import java.util.HashMap;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fibo(n));
    }
    public static int fibo(int n){
        return fibon(n, new HashMap<>());
    }
    public static int fibon(int n, HashMap<Integer, Integer> memo){
        if(n<2)
            return n;
        if(memo.containsKey(n))
            return memo.get(n);
        int result=fibon(n-1, memo)+fibon(n-2, memo);
        memo.put(n, result);
        return result;
    }
}
