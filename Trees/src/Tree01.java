
// Linked Representation of Binarey tree.

class Node{
    int data;
    Node right;
    Node left;
}

public class Tree01 {

    static boolean flag = false;

    // Function for creation of Node.
    public Node create(int data) {
        Node node = new Node();
        node.data = data;
        node.right = null;
        node.left = null;
        return node;
    }

    // Function for PreOrder Traversal.
    public void PreOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            PreOrder(root.left);
            PreOrder(root.right);
        }
    }

    // Function for PostOrder Traversal.
    public void PostOrder(Node root) {
        if (root != null) {
            PreOrder(root.left);
            PreOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    // Function for InOrder Traversal.
    public void InOdrer(Node root) {
        if (root != null) {
            PreOrder(root.left);
            System.out.print(root.data + " ");
            PreOrder(root.right);
        }
    }

    // Function for seacrhing of an Element.
    public void search(Node root, int key) {
        if (root != null) {
            if (root.data == key) {
                flag = true;
            } 
            search(root.left, key);
            search(root.right, key);
        } 
    }
    public static void main(String[] args) {

        Tree01 tree = new Tree01();

        Node root = tree.create(4);
        Node n1 = tree.create(1);
        Node n2 = tree.create(5);
        Node n3 = tree.create(2);
        Node n4 = tree.create(6);

        root.left = n1;
        root.right = n4;
        n1.left = n2;
        n1.right = n3;

        // Function call for PreOrder, PostOrdre and Inorder Travresal.
        tree.PreOrder(root);
        System.out.println();
        tree.PostOrder(root);
        System.out.println();
        tree.InOdrer(root);
        System.out.println();

        // Function call for Search.
        tree.search(root, 1);
        if (flag) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }

    }

}
