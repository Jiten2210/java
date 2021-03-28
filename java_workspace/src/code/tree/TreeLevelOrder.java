package code.tree;

import java.util.Queue;
import java.util.LinkedList;

public class TreeLevelOrder {

    private static class Node {
        private int value;
        private Node left;
        private Node right;

        private Node(int value) {
            this.value = value;
        }
    }

    public static void traverse(Node tree) {
        if (tree == null) return;

        Queue<Node> toVisit = new LinkedList<Node>();
        toVisit.add(tree);

        while (!toVisit.isEmpty()) {
            Node curr = toVisit.remove();
            System.out.println(curr.value);
            if (curr.left != null) toVisit.add(curr.left);
            if (curr.right != null) toVisit.add(curr.right);
        }
    }

    public static void main(String[] args) {
        Node n = new Node(1);
        n.left = new Node(2);
        n.right = new Node(3);
        n.left.left = new Node(4);
        n.left.right = new Node(5);
        n.right.left = new Node(6);
        n.right.right = new Node(7);

        traverse(n);
    }
}
