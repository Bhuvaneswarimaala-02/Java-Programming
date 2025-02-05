// ip: a1b10   op: abbbbbbbbbb

import java.util.*;
public class StringPattern1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.next().toLowerCase();
        System.out.println(pattern(str));
    }
    static String pattern(String str){
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            if (Character.isLetter(str.charAt(i))) {
                char ch = str.charAt(i);
                i++;
                // Extract full number (handling multi-digit numbers)
                StringBuilder num = new StringBuilder();
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    num.append(str.charAt(i));
                    i++;
                }
                // Convert number string to integer
                if (num.length() > 0) {
                    int n = Integer.parseInt(num.toString());
//                    result.append(String.valueOf(ch).repeat(n)); // Append 'ch' n times
                    for(int j=0; j<n; j++){
                        result.append(ch);
                    }
                }
            }
        }
        return result.toString();
    }
}
