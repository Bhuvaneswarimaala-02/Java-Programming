import java.util.*;
public class StringReverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("String Reversal");
        System.out.println("Enter a String: ");
        String s=sc.next();
        char[] carray=s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<=j){
            char temp=carray[i];
            carray[i]=carray[j];
            carray[j]=temp;
            i++;
            j--;
        }
        String result= new String(carray);
        System.out.println("Reversed Array: "+result);
    }
}
