package datastructures;

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
    }
}
