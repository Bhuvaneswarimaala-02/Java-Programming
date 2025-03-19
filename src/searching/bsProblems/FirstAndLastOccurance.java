package searching.bsProblems;
import java.util.*;
public class FirstAndLastOccurance {
    static int firstOcc(int[] arr, int target){
        int s=0,e=arr.length-1,fo=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                fo=mid;
                e=mid-1;
            }
            else if(target < arr[mid]){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return fo;
    }

    static int lastOcc(int[] arr, int target){
        int s=0,e=arr.length-1,lo=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                lo=mid;
                s=mid+1;
            }
            else if(target < arr[mid]){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return lo;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter an element: ");
        int target=sc.nextInt();
        int f=firstOcc(arr,target);
        int l=lastOcc(arr,target);
        System.out.println(f+" "+l);
    }

}
