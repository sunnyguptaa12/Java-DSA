package LinkedList;

public class MiddleOfLinkedList {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    void findMiddle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle Node: " + slow.data);
    }

    public static void main(String[] args) {

        MiddleOfLinkedList list = new MiddleOfLinkedList();

            Node head = list.new Node(10);
            head.next = list.new Node(20);
            head.next.next = list.new Node(30);
            head.next.next.next = list.new Node(40);
            head.next.next.next.next = list.new Node(50);
            head.next.next.next.next.next = list.new Node(60);

            list.findMiddle(head);
    }
}
