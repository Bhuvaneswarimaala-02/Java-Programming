package stacksAndQueues.Questions;

import java.util.*;

public class MainClass1 extends TwoStacks{
    public static void main(String[] args){
//        TwoStacks obj=new TwoStacks();
        Scanner sc=new Scanner(System.in);
//        int t=sc.nextInt();
//        for(int i=0; i<t; i++){
        System.out.println("enter stack 1 length");
            int n=sc.nextInt();
        System.out.println("enter stack 2 length");
            int m=sc.nextInt();
        System.out.println("enter max total sum");
            int x=sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[m];
        System.out.println("enter "+n+"elements for array1");
            for(int j=0; j<n; j++) {
                a[j] = sc.nextInt();
            }
        System.out.println("enter "+m+"elements for array2");
            for(int j=0; j<m; j++){
                b[j]=sc.nextInt();
            }
            System.out.println("Output is: "+twoStacks(x, a, b));
//        }
    }
}

class TwoStacks{
    static int twoStacks(int x, int[] a, int[] b){
        return twoStacks(x,a,b,0,0)-1;
    }
    private static int twoStacks(int x, int[] a, int[] b, int sum, int count){
//        base condition
        if(sum>x){
            return count;
        }
        if(a.length==0 || b.length==0){
            return count;
        }
        int ans1=twoStacks(x, Arrays.copyOfRange(a, 1, a.length), b, sum+a[0], count+1);
        int ans2=twoStacks(x, a, Arrays.copyOfRange(b,1, b.length), sum+a[0], count+1);

        return Math.max(ans1, ans2);
    }
}
