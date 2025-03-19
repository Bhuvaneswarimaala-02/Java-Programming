package searching.bsProblems;
import java.util.*;
public class NextGreaterChar {
    static char nextGreatChar(char[] letters, char target){
        int s=0, e=letters.length-1;
        while(s<=e){
            int  mid=s+(e-s)/2;
            if(target<letters[mid]){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return letters[s%letters.length];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        char[] letters=new char[n];
        System.out.println("Enter the letters of the array: ");
        for(int i=0; i<n; i++){
            letters[i]=sc.next().charAt(0);
        }
        System.out.println("Enter target character: ");
        char target=sc.next().charAt(0);
        System.out.println(nextGreatChar(letters,target));
    }
}
