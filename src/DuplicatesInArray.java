// arr[] = {1,1,1,1,0,2,2,4,5,5}   op:{1,2,5} - order in result array does not matter
import java.util.*;
public class DuplicatesInArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] arr={1,1,1,1,0,2,2,4,5,5};
//        System.out.println(duplicates(arr));
        int[] result=duplicates(arr);
        for(int i=0;i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
//    static int[] duplicates(int arr[]) {
//        Set<Integer> set = new HashSet<>();
//
//        Arrays.sort(arr);
//        for(int i=0; i<arr.length-1; i++){
//            if(arr[i]==arr[i+1]){
//                set.add(arr[i]);
//            }
//        }
//        int[] result=new int[set.size()];
//        int ind=0;
//        for(int num:set){
//            result[ind] = num;
//            ind++;
//        }
//        return result;
//    }

    static int[] duplicates(int arr[]){
        Arrays.sort(arr);
        int result[]=new int[arr.length];
        int index=0;
        for(int i=1; i<arr.length-1; i++){
            if(arr[i]==arr[i+1]){
                if(index==0 || arr[i]!=result[index-1]) {
                    result[index++] = arr[i];
                }
            }
        }
        return result;
    }
}
