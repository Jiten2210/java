package code.tree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    Node left;
    Node right;
    int data;
}

class BinaryTree {

    public void printSumLevelWise(Node node) {
        if (node == null) {
            return;
        }

        Queue<Node> q = new LinkedList<Node>();
        q.add(node);

        while (true) {
            int size = q.size();
            if (size == 0) {
                break;
            }
            int sum = 0;
            while (size > 0) {
                Node t = q.remove();
                sum = sum + t.data;

                if (t.left != null) {
                    q.add(t.left);
                }

                if (t.right != null) {
                    q.add(t.right);
                }

                size--;
            }
            System.out.println(sum);
        }

        return;
    }

    public Node newNode(int val) {
        Node newNode = new Node();
        newNode.data = val;
        newNode.left = null;
        newNode.right = null;
        return newNode;
    }
}

public class LevelSum {

    public static void main(String[] args) {

        BinaryTree a = new BinaryTree();

        Node root = a.newNode(2);
        root.left = a.newNode(7);
        root.right = a.newNode(5);
        root.left.left = a.newNode(2);
        root.left.right = a.newNode(6);
        root.left.right.left = a.newNode(5);
        root.left.right.right = a.newNode(11);
        root.right.right = a.newNode(9);
        root.right.right.left = a.newNode(4);

        a.printSumLevelWise(root);
    }

}
