package searching.bsProblems;
import java.util.*;
//Searching for a number and returning its floor or ceil value
//as per users choice, if that target does not exist

public class CeilOrFloor {
    static int compute(int[] arr, int target, int sw){
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
        if(sw==1) return s;
        else return e;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        System.out.println("Enter array elements: ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter number to be searched: ");
        int target=sc.nextInt();
        System.out.println("Enter '1' for CEIL value and '2' for FLOOR value: ");
        int sw=sc.nextInt();
        System.out.println(compute(arr, target, sw));
    }
}
