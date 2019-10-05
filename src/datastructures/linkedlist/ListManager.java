package datastructures.linkedlist;

import static datastructures.linkedlist.LinkedList.printList;

public class ListManager {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        int [] nodes = {24, 83, 44, 12};
        linkedList.addNodes(nodes);
        linkedList.insertAtBeginning(37);
        linkedList.insertAtEnd(28);
        linkedList.insertAtEnd(33);
        linkedList.insertAtBeginning(20);

        //Test Result
        linkedList.printList();
        System.out.println(linkedList.findMiddlePosition());
        System.out.println(linkedList.findNthNode(linkedList.findMiddlePosition()));

        linkedList.insertAtNthPosition(3, 29);
        linkedList.printList();
        linkedList.insertInMiddle(18);
        linkedList.printList();
        System.out.println(linkedList.findNthNode(7));

        linkedList.deleteFirstNode();
        linkedList.printList();
        linkedList.deleteLastNode();
        linkedList.printList();
        linkedList.deleteNodeAtNthPosition(4);
        linkedList.printList();

        linkedList.reverseList();
        linkedList.printList();

        /*MergeTwoSortedLinkedList sortedList = new MergeTwoSortedLinkedList();
        LinkedList list1 = new LinkedList();
        int [] nodes1 = {10, 50, 50, 70, 90, 100};
        list1.addNodes(nodes1);
        LinkedList list2 = new LinkedList();
        int [] nodes2 = {20, 30, 40, 50, 60, 80};
        list2.addNodes(nodes2);
        Node node = sortedList.mergeTwoSortedList(list1, list2);
        printList(node);*/
    }
}
