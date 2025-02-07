import java.util.*;
public class Coprime {
    public static int GCD(int x,int y)
    {
        for(int i=2;i<=x;i++)
        {
            if(x%i==0)
            {
                if(y%i==0)
                    return 0;
            }
        }
        return 1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int count=0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                int a=arr[i];
                int b=arr[j];
                boolean flag=isCoPrime(a,b);
                if(flag==true) count++;
            }
        }
        System.out.print(count);
    }
}
