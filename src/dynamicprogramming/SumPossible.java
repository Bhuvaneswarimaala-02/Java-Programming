package dynamicProgramming;

import java.util.HashMap;
import java.util.Scanner;

public class SumPossible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        int n=sc.nextInt();
        System.out.println("Enter the array elements: ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the amount: ");
        int amount=sc.nextInt();
        System.out.println(isSum(amount, arr));
    }
    public static boolean isSum(int amt, int[] arr){
        return isSum(amt, arr, new HashMap<>());
    }
    public static boolean isSum(int amt, int[] arr, HashMap<Integer, Boolean> memo){
        if(amt==0) return true;
        if(amt<0) return false;
        if(memo.containsKey(amt)) return memo.get(amt);

        for(int num: arr){
            int subAmt=amt-num;
            if(isSum(subAmt, arr, memo)){
                memo.put(amt, true);
                return true;
            }
        }
        memo.put(amt, false);
        return false;
    }
}
