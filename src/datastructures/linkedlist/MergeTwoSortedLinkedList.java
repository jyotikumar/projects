package datastructures.linkedlist;

public class MergeTwoSortedLinkedList {

    public Node mergeTwoSortedList(LinkedList list1, LinkedList list2) {
        Node head1 = list1.head;
        Node head2 = list2.head;
        Node node1 = head1, node2 = head2, head, merged;

        if(head1 == null) return head2;
        if(head2 == null) return head1;

        if (node1.data <= node2.data) {
            merged = node1;
            node1 = node1.next;
        } else {
            merged = node2;
            node2 = node2.next;
        }
        head = merged;

        while (node1!=null && node2!=null){
            if(node1.data <= node2.data){
                merged.next = node1;
                merged = node1;
                node1 = merged.next;
            }
            else {
                merged.next = node2;
                merged = node2;
                node2= merged.next;
            }
        }

        if(node1 == null) merged.next = node2;
        if(node2 == null) merged.next = node1;

        return head;
    }
}
