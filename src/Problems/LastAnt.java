package Problems;
import java.util.*;
public class LastAnt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the Plank: ");
        int L=sc.nextInt();

        System.out.println("Enter the number of Ants: ");
        int N=sc.nextInt();

        System.out.println("Enter the positions of the Ants: ");
        int[] positions=new int[N];
        for(int i=0; i<N; i++){
            positions[i]=sc.nextInt();
        }

        System.out.println("Enter the directions: ");
        char[] directions = new char[N];
        for(int i=0;i<N; i++){
            directions[i]=sc.next().charAt(0);
        }


    }
}
