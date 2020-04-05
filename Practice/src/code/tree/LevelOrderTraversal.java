package code.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    static Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }


    public static void main(String[] args) {
        LevelOrderTraversal tree = new LevelOrderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(3);
        tree.root.right = new Node(7);
        tree.root.left.left = new Node(14);
        tree.root.left.right = new Node(25);
        printLevelOrder(tree.root);
    }

    private static void levelOrderTraversal(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.println(temp.data);

            if (temp.left != null)
                q.add(temp.left);

            if (temp.right != null)
                q.add(temp.right);

        }
    }

    private static int height(Node root) {
        if (root == null)
            return 0;
        return Math.max(height(root.left), height(root.right)) + 1;

    }

    private static void printLevelOrder(Node root) {
        int h = height(root);
        System.out.println("height " + " " + h);
        for (int i = 0; i <= h; i++)
            printLevel(root, i);
    }

    private static void printLevel(Node root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.println(root.data);

        else if (level > 1) {
            printLevel(root.left, level - 1);
            printLevel(root.right, level - 1);
        }

    }

}
