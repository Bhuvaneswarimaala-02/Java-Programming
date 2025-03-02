package linkedlist;
import java.util.*;
import org.w3c.dom.ls.LSOutput;

public class LL {

    private class Node{
        private int val;
        private Node next;

//        default constructor
        public Node(){
        }

        public Node(int val){
            this.val=val;
        }

        public Node(int val, Node next){
            this.val=val;
            this.next=next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
    }

//    INSERT FIRST OPERATION
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        //if the list is initially empty, both head and tail must point to the same node
        if(tail==null){
            tail=head;
        }
        size+=1;
    }

//   DISPLAY THE LL
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.print("END");
    }

//    INSERT LAST OPERATION
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

//    INSERT AT ANT INDEX
    public void insert(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp=head;
        for(int i=1; i<index; i++){
            temp=temp.next;
        }
        Node node=new Node(val, temp.next);
        temp.next=node;
        size++;
    }

//    DELETE FROM THE FIRST
    public int deleteFirst(){
        int val=head.val;
        head=head.next;
        //if the list becomes empty after deleting the head, tail must also become null
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

//    Getting a node
    public Node get(int index){
        Node node=head;
        for(int i=0; i<index; i++) {
            node = node.next;
        }
//        System.out.println(node.val);
        return node;
    }

//    DELETE FROM THE LAST
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        int value=tail.val;
        tail=secondLast;
        tail.next=null;
        size--;
        return value;
    }

//    DELETE FROM ANY POSITION
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev=get(index-1);
        int value=prev.next.val;
        prev.next=prev.next.next;
        return value;
    }

//    FINDING A NODE
    public Node find(int value){
        int index=0;
        Node node=head;
        while(node!=null){
            if(node.val==value){
                System.out.println("Node found at index: "+index);
                return node;
            }
            index++;
            node=node.next;
        }
        System.out.println("Node not found");
        return null;
    }
}
