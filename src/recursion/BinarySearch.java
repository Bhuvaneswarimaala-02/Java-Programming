package recursion;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        System.out.println("Enter the array elements: ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target=sc.nextInt();
        System.out.println(search(arr, target, 0, arr.length-1));
    }
    static int search(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[m]<target){
            return search(arr, target, m, e);
        }
        return search(arr, target, s, m);
    }
}
