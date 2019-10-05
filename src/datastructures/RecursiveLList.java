package datastructures;

public class RecursiveLList {
    Node head;
    public static void main(String[] args) {
        RecursiveLList linkedList = new RecursiveLList();
        int [] nodes = {24, 83, 44, 12};
        linkedList.addNodes(nodes);
    }

    private void addNodes(int[] nodes) {
        for(int data : nodes){
            Node node = new Node(data);
            addNode(node);
        }
    }

    private void addNode(Node node) {

    }

    private void reverse(){

    }
}
