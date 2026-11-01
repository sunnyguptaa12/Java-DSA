package LinkedList;

public class MergeTwoSortedList {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node merge(Node list1, Node list2){

        Node dummy = new Node(0);
        Node temp = dummy;

        while (list1 != null && list2 != null){                      // Traverse both lists and link the smaller node
            if(list1.data <= list2.data){
                temp.next = list1;
                list1 = list1.next;
            }else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if(list1 != null){                                           //remaining nodes
            temp.next = list1;
        }else {
            temp.next = list2;
        }
        return dummy.next;
    }

    public static void printlist(Node head){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data + "  ->  ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node list1 = new Node(10);
        list1.next = new Node(30);
        list1.next.next = new Node(50);

        Node list2 = new Node(20);
        list2.next = new Node(40);
        list2.next.next = new Node(60);

        Node result = merge(list1, list2);
        System.out.print("Merged List :  ");
        printlist(result);
    }
}
