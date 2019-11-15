package datastructures.tree;

public class BinarySearchTree {

    public void insertNode(Node root, int data){
        if(root == null){
            root = new Node(data);
            return;
        }
        if(data < root.data){
            if(root.left == null){root.left = new Node(data);}
            else insertNode(root.left, data);
        }
        else if(data > root.data){
            if(root.right == null){root.right = new Node(data);}
            else insertNode(root.right, data);
        }
    }

    public void traverseTree(Node root){
        if(root != null){
            traverseTree(root.left);
            System.out.print(root.data+" ");
            traverseTree(root.right);
        }
    }

    public boolean isBinarySearchTree(Node root){
        return true;
    }

    public boolean isTreeBalanced(Node root){
        return false;
    }
}
