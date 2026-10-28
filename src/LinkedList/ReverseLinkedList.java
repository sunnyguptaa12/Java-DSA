package LinkedList;

public class ReverseLinkedList {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node reverse(Node head){

        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null){
            next = curr.next;       // Store next node
            curr.next = prev;       // Reverse the current link
            prev = curr;            // Move prev one step forward
            curr = next;            // Move curr one step forward
        }
        return prev;
    }

    public static void display(Node head){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {


        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.print("original List: ");
        display(head);

        System.out.print("Reversed List: ");
        display(reverse(head));
    }
}
