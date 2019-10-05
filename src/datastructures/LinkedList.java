package datastructures;

public class LinkedList {
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
        Node prevNode = head;
        for(int i =0; prevNode != null && i<n-1; i++){
            prevNode = prevNode.next;
        }
        Node temp = prevNode.next.next;
        prevNode.next = null;
        prevNode.next = temp;
    }

    void printList(){
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println(temp.data);
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

    void deleteFirstNode() {
        Node temp = head.next;
        head.next = null;
        head = temp;
    }

    void deleteLastNode(){
        Node temp = head;
        while (temp.next!=null && temp.next.next != null){
            temp = temp.next;
        }
        Node preNode = temp;
        preNode.next = null;
    }

    void reverseList(){

    }
}
