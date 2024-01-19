package LeetCode;

public class BST {

    Node root;
    static class Node{
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left= right=null;
        }
    }

    void insert(int data){
        if(root == null){
            root= new Node(data);
            return;
        }
        Node currentNode = root;
        while (true) {
            if (data < currentNode.data) {
                if (currentNode.left == null) {
                    currentNode.left = new Node(data);
                    break;
                }
                currentNode = currentNode.left;
            }
            else {
                if (currentNode.right == null) {
                    currentNode.right = new Node(data);
                    break;
                }
                currentNode = currentNode.right;
            }
        }
    }
    boolean search(int key) {
        Node currentNode = root;
        while (currentNode != null) {
            if (currentNode.data == key) {
                return true;
            } else if (currentNode.data < key) {
                currentNode = currentNode.right;
            } else {
                currentNode = currentNode.left;
            }
        }
        return false;
    }
    Node deleteNode(Node root, int key) {
        if (root == null) {
            return null; // Tree is empty
        }
        //three cases
        //1. if deleting leaf node then simply delete it
        //2. if deleting a node which has one node then exchange the values and remove that node
        //3. if it has two nodes, find the previous node and replace it with that

        if (key < root.data) {
            deleteNode(root.left, key);
        } else if (key > root.data) {
            deleteNode(root.right, key);
        } else {
            // if both left and right are null then delete the node
            if (root.left == null && root.right == null) {
                root = null;
            }
            // if either of the node exists, replace the value
            else if (root.left == null) {
                root = root.right;
            } else if (root.right == null) {
                root = root.left;
            }
            // if both left and right exists
            else {
                Node node = root.right;
                while (node.left != null) {
                    node = node.left;
                }
                root.data = node.data;
                root.right = deleteNode(root.right, node.data);
            }
        }
        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + "->");
            inorderRec(root.right);
        }
    }
    public static void main(String[] args)
    {
        BST bst = new BST();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);
        System.out.println("Inorder traversal of the constructed BST:");
        bst.inorder();
        System.out.println(bst.search(70));
        bst.deleteNode(bst.root,50);
        bst.inorder();
    }
}