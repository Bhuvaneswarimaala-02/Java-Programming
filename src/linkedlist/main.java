package linkedlist;
import java.util.*;
import linkedlist.LL;
import linkedlist.DLL;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        LL list=new LL();
//        list.insertFirst(2);
//        list.insertFirst(4);
//        list.insertLast(5);
//        list.insertLast(10);
//        list.insert(20,2);
//
//        list.display();
//        System.out.println();
//
//        list.deleteFirst();
//        list.display();
//        System.out.println();
//
////        list.get(2);
//
//        list.deleteLast();
//        list.display();
//        System.out.println();
//
//        list.delete(1);
//        list.display();
//        System.out.println();
//
//        list.find(5);



//        DLL list2=new DLL();
//        list2.insertFirst(2);
//        list2.insertFirst(4);
//        list2.insertLast(5);
//        list2.insertLast(6);
//        list2.insert(2,100);
////        list2.insertLast(5);
////        list2.insertLast(10);
////        list2.insert(20,2);
//        list2.display();
//        list2.displayRev();


        CLL list3=new CLL();
        list3.insert(1);
        list3.insert(2);
        list3.insert(3);
        list3.insert(4);
        list3.display();
        list3.delete(3);
        list3.display();

    }


}
