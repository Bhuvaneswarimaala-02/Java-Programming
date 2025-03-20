package searching.bsProblems;
import java.util.*;
public class PositionInInfiniteArray {
    static int ans(int[] arr, int target){
        int s=0,e=1;
        while(target>arr[e]){
            int temp=e+1;
            e=e+2*(e-s+1);
            s=temp;
        }
        return binarySearch(arr, target, s, e);
    }
    static int binarySearch(int[] arr, int target, int s, int e){
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target>arr[mid])
                s=mid+1;
            else if(target<arr[mid])
                e=mid-1;
            else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array(infinite): ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the target: ");
        int target=sc.nextInt();

        System.out.println(ans(arr,target));
    }
}
