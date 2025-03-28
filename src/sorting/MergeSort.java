package sorting;
import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(mergesort(arr)));
    }
    static int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] first=mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] second=mergesort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(first, second);
    }
    private static int[] merge(int[] first, int[] second){
        int[] mix= new int[first.length+second.length];
        int i=0, j=0, k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }
            else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }

        while(i<first.length){
            mix[k]=first[i];
            i++;k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            k++; j++;
        }
        return mix;
    }
}
