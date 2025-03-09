package searching;
import java.util.*;
public class LinearSearch {
    public static int search1(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target)
                return arr[i];
        }
        return -1;
    }
    public static int[] search2(int[][] arr, int target){
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col]==target)
                    return new int[]{row,col};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for 1D array and 2 for 2D: ");
        int c=sc.nextInt();
        switch (c){
            case 1:
            {
                System.out.println("Array size: ");
                int n=sc.nextInt();
                System.out.println("Enter array elements: ");
                int[] arr=new int[n];
                for(int i=0; i<n; i++){
                    arr[i]=sc.nextInt();
                }
                System.out.println("Enter target: ");
                int target=sc.nextInt();
                System.out.println("LINEAR SEARCH ...");
                System.out.println(search1(arr,target));
                break;
            }
            case 2:
            {
                System.out.println("Enter Dimensions:");
                int m=sc.nextInt();
                int n=sc.nextInt();
                int[][] arr=new int[m][n];
                System.out.println("Enter array elements: ");
                for(int i=0; i<m; i++){
                    for(int j=0; j<n; j++){
                        arr[i][j]=sc.nextInt();
                    }
                }
                System.out.println("Enter target: ");
                int target=sc.nextInt();
                System.out.println("LINEAR SEARCH 2D ...");
                System.out.println(Arrays.toString(search2(arr,target)));
            }
        }

    }

}

