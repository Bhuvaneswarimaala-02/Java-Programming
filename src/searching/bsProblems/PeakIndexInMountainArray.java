package searching.bsProblems;
import java.util.*;
public class PeakIndexInMountainArray {
    static int mountain(int[] arr){
        int s=0,e=arr.length-1;
        while(s<=e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] > arr[mid + 1])
                e = mid - 1;
            else
                s = mid+1;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
//        sc.nextLine(); // Flush the input buffer

        System.out.println(mountain(arr));
    }
}
