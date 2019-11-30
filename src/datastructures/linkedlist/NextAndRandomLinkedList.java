package datastructures.linkedlist;

public class NextAndRandomLinkedList {

    private static void cloneListWithNextAndRandomPointer(Node orig) {
        Node cloneHead = cloneAsSimpleLinkedList(orig);

        printList(cloneHead);

        Node clone = cloneHead;
        while(clone != null){
            clone.random = orig.random.next;
            clone = clone.next;
        }

        printList(clone);
    }

    private static Node cloneAsSimpleLinkedList(Node origHead) {
        Node clonedHead = new Node(origHead.data);
        Node clone = clonedHead;
        Node head = null;
        while(origHead != null){
            clone.next = new Node(origHead.next.data);
            clone.random = new Node(0);
            head = origHead;
            head.next = clone;
            head = origHead.next;
            clone = clone.next;
            origHead=origHead.next;
        }
        return head;
    }

    static void printList(Node node){
        while(node != null && node.next != null){
            System.out.println("Node: "+ node.data + ", next: "+ node.next.data+ ", random: "+ node.random.data);
            node = node.next;
        }
        System.out.println("Node: "+ node.data + ", random: "+ node.random.data);
    }

    public static void main(String[] args) {
        Node start = new Node(1);
        start.next = new Node(2);
        start.next.next = new Node(3);
        start.next.next.next = new Node(4);
        start.next.next.next.next = new Node(5);

        start.random = start.next.next;
        start.next.random = start;
        start.next.next.random = start.next.next.next.next;
        start.next.next.next.random = start.next.next.next.next;
        start.next.next.next.next.random = start.next;

        printList(start);

        cloneListWithNextAndRandomPointer(start);
    }

    static class Node{
        int data;
        Node next, random;
        Node(int data){
            this.data = data;
            next = random = null;
        }
    }
}
