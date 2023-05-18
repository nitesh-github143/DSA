package linkedlist;

public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        int size = 0;
        void insertAtStart(int val){
            Node temp = new Node(val);
            if(head == null){
                head = tail = temp;
            }else{
                temp.next = head;
                head = temp;
            }
size++;
        }
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
            }else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }
        void insertAt(int idx, int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx == size){
                insertAtEnd(val);
                return;
            }
            else if(idx == 0){
                insertAtStart(val);
                return;
            }
            else if(idx < 0 || idx > size){
                System.out.println("Invalid Input");
                return;
            }
            for(int i = 1; i <= idx -1; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }
        int getAt(int idx){
            Node temp = head;
            if(idx < 0 || idx > size){
                System.out.println("Invalid Input");
                return -1;
            }
            for(int i = 1; i <= idx; i++){
                temp = temp.next;
            }
            return temp.data;
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.print("null");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(8);
        ll.insertAtEnd(18);
        ll.display();
//        System.out.println(ll.size());
        ll.insertAtEnd(10);
        ll.insertAtStart(1);
        ll.display();
//        System.out.println(ll.size());
        System.out.println(ll.getAt(3));
        System.out.println(ll.size);
    }
}
