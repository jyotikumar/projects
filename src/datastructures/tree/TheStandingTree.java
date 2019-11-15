package datastructures.tree;

public class TheStandingTree {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        int[] arr = {10,8,12,6,15,4,2,5,18};
        Node root = new Node(10);
        binarySearchTree.insertNode(null, 10);
        for(int i =1; i<arr.length; i++) {
            binarySearchTree.insertNode(root, arr[i]);
        }
        System.out.println(root.data);
        binarySearchTree.isBinarySearchTree(root);
        binarySearchTree.traverseTree(root);
    }
}
