package linkedlist;

public class DLL {
    private class Node{
        int val;
        Node prev;
        Node next;
        public Node(){

        }
        public Node(int val){
            this.val=val;
        }
        public Node(int val, Node prev, Node next){
            this.val=val;
            this.prev=prev;
            this.next=next;
        }
    }

    private Node head;

//    INSERT AT FIRST
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
    }

//    DISPLAY THE LIST
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }

//    INSERT AT LAST POSITION
    public void insertLast(int val){
        Node node=new Node(val);
        node.next=null;
        //incase of empty nodes
        if(head==null){
            node.prev=null;
            head=node;
            return;
        }
        Node last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;
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

    public void insert(int after, int val){
        Node p=find(after);
        if(p==null){
            System.out.println("Does not exits!");
            return;
        }
        Node node=new Node(val);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null){
            node.next.prev=node;
        }
    }

    //    DISPLAYING IN REVERSE
    public void displayRev(){
        Node node=head;
        Node last=null;
        while(node!=null){
            last=node;
            node=node.next;
        }
        while(last!=null){
            System.out.print(last.val+"->");
            last=last.prev;
        }
        System.out.println("START");
    }
}
