
package LinkedList;

public class PalindromeLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public boolean isPalindrome(Node head){

        if(head == null || head.next == null){
            return true;
        }

                                                                //Find middle
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prev = null;                                      //Reverse second half
        Node curr = slow;

        while (curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        Node right = prev;                                    //compare both halves
        Node left = head;

        while (right != null){
            if(left.data != right.data){
                return false;
            }

            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {

        PalindromeLinkedList list = new PalindromeLinkedList();

        Node head = list.new Node(10);
        head.next = list.new Node(20);
        head.next.next = list.new Node(20);
        head.next.next.next = list.new Node(10);

        System.out.println(list.isPalindrome(head));

    }
}
