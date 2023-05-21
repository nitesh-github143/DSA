package linkedlist;

public class nthNodeFromEnd {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(13);
        Node d = new Node(5);
        Node e = new Node (12);
        Node f = new Node (10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        int x = 3;
        Node temp = nthNode(a, x);
        Node temp2 = nthNodeInOneTraversal(a, x);
        System.out.println(temp.data);
        System.out.println(temp2.data);
    }

    public static Node nthNode(Node head, int n) {
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        int a = size - n ;
        temp = head;
        for(int i = 0; i <= a-1; i++){
            temp = temp.next;
        }
        return temp;
    }

    public static Node nthNodeInOneTraversal(Node head, int n) {
        if(head == null){
            return head;
        }
        Node slow = head;
        Node fast = head;
        for(int i = 1; i <= n; i++){
            fast = fast.next;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return slow;
    }
}
