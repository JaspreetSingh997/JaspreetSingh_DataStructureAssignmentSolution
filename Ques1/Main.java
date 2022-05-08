class Node {

    public int data;
    public Node left, right;

    public Node(int data) {
        left = right = null;
        this.data = data;
    }
}

public class Main {

    Node node;


    void convert(Node root) {
        if (root == null)
            return;

        convert(root.left);

        if (head == null) {
            head = root;
            root.left = null;
            prev = root;
        } else {
            prev.right = root;
            root.left = null;
            prev = root;
        }
        convert(root.right);

    }

    void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");

        preOrder(root.right);
    }

    Node head;
    Node prev;

    public static void main(String[] args) {

        Main tree = new Main();
        tree.node = new Node(50);
        tree.node.left = new Node(30);
        tree.node.right = new Node(60);
        tree.node.left.left = new Node(10);
        tree.node.right.left = new Node(55);

        tree.convert(tree.node);

        tree.preOrder(tree.head);
    }
}