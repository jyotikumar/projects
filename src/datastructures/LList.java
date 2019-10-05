package datastructures;

public class LList {
    Node head;

    void insertAtBeginning(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    void insertAtEnd(int data){
        Node node = new Node(data);
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }

    void insertInMiddle(int data){
        int n = findMiddlePosition();
        findNthNode(n);
        Node temp = head;
        int i =1;
        while (i <= n && temp.next!=null){
            temp = temp.next;
            i++;
        }
        Node node = new Node(data);
        Node tempNode = temp.next;
        temp.next = node;
        temp.next.next = tempNode;
    }

    int findNthNode(int n) {
        int i =1;
        Node temp = head;
        while (i<=n && temp.next != null){
            i++;
            temp = temp.next;
        }
        return temp.data;
    }

    int findMiddlePosition() {
        int i = 0;
        Node slow = head;
        Node fast = head.next;
        while (fast.next !=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            i++;
        }
        return i;
    }

    void insertAtNthPosition(int n, int data){
        Node node = new Node(data);
        Node temp = head;
        int i = 1 ;
        while(i!=n && temp.next != null){
            temp = temp.next;
            i++;
        }
        Node tempNode = temp.next;
        temp.next = node;
        temp.next.next = tempNode;
    }

    void deleteNodeAtNthPosition(int n){

    }

    void printList(){
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    void addNodes(int[] nodes) {
        for(int data : nodes){
            addNode(data);
        }
    }

    void addNode(int data) {
        Node node = new Node(data);
        if(head == null){
            head = node;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }


    public static void main(String[] args) {
        LList linkedList = new LList();
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
    }
}
