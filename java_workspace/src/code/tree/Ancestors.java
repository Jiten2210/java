package code.tree;

public class Ancestors {
    Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Ancestors tree = new Ancestors();
        tree.root = new Node(1);
        tree.root.left = new Node(3);
        tree.root.right = new Node(7);
        tree.root.left.left = new Node(14);
        tree.root.left.right = new Node(25);
        printAncestors(tree.root, 25);
    }

    private static boolean printAncestors(Node root, int i) {
        if (root == null)
            return false;

        if (root.data == i)
            return true;

        if (printAncestors(root.left, i) || (printAncestors(root.right, i))) {
            System.out.println(root.data);
            return true;
        }
        return false;

    }
}
