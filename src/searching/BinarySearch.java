package searching;
import java.util.*;
public class BinarySearch {
//    ASCENDING ORDER
    static int search1(int[] arr, int target){
        int s=0,e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target>arr[mid]){
                s=mid+1;
            }
            else if(target<arr[mid]){
                e=mid-1;
            }
            else
                return mid;
        }
        return -1;
    }

//    DESCENDING ORDER
    static int search2(int[] arr, int target){
        int s=0,e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target>arr[mid]){
                e=mid-1;
            }
            else if(target<arr[mid]){
                s=mid+1;
            }
            else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter sorted array elements: ");
        for(int i=0;i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter number to be searched: ");
        int target= sc.nextInt();
        System.out.println("BINARY SEARCH ...");
        if(arr[0]<arr[n-1]){
            System.out.println(search1(arr, target));
        }else {
            System.out.println(search2(arr,target));
        }
    }

}

//TC
//BEST CASE: O(1)
//WORST CASE: O(log n)