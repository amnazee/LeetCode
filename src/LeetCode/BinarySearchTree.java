package LeetCode;

public class BST {
    Node root;

    public BST() {
        root = null;
    }
}

class Node{
    Node left,right;
    int data;

    public Node(int data) {
        this.data=data;
        left=right=null;
    }
}
