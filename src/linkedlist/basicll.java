package linkedlist;

public class basicll {

    public static void display(Node head) {
        if(head == null){
            return;
        }
        System.out.print(head.data + " ");
        display(head.next);

    }
    public static class Node{
        int data; // value
        Node next; //address of next node
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
//        Node f = new Node(20);
//        System.out.println(a.data);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
//        System.out.println(a.next.next.next.next.data);
       display(a);
    }
}
