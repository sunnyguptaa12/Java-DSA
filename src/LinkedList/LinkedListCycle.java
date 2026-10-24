package LinkedList;

public class LinkedListCycle {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

     boolean detectCycle(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;                              //cycle detected
            }
        }
        return false;                                     //no cycle
    }

    public static void main(String[] args) {
        LinkedListCycle list = new LinkedListCycle();

        Node head = list.new Node(10);
        head.next = list.new Node(20);
        head.next.next = list.new Node(30);
        head.next.next.next = list.new Node(40);


        head.next.next.next.next = head.next;             //create a cycle

        if(list.detectCycle(head)){
            System.out.println("cycle detected ");
        }else {
            System.out.println("No cycle detected" );
        }
    }
}
