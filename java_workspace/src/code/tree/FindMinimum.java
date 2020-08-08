package code.tree;

public class FindMinimum {

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
        FindMinimum tree = new FindMinimum();
        tree.root = new Node(1);
        tree.root.left = new Node(3);
        tree.root.right = new Node(7);
        tree.root.left.left = new Node(14);
        tree.root.left.right = new Node(25);
        System.out.println(findMinimum(tree.root));
    }

    private static int findMinimum(Node root) {
        if (root == null)
            return Integer.MAX_VALUE;

        int temp = root.data;
        int l = findMinimum(root.left);
        int r = findMinimum(root.right);

        if (l < r)
            r = l;
        if (r < temp)
            temp = r;
        return temp;

    }

}
