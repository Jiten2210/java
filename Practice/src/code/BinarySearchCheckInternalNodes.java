package code;

import java.util.ArrayList;

class BSTNode {
    BSTNode left, right;
    int data;

    public BSTNode() {
        left = null;
        right = null;
        data = 0;
    }

    public BSTNode(int n) {
        left = null;
        right = null;
        data = n;
    }

    public void setLeft(BSTNode n) {
        left = n;
    }

    public void setRight(BSTNode n) {
        right = n;
    }

    public BSTNode getLeft() {
        return left;
    }

    public BSTNode getRight() {
        return right;
    }

    public void setData(int d) {
        data = d;
    }

    public int getData() {
        return data;
    }
}

class BST {
    private BSTNode root;

    public BST() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    private BSTNode insert(BSTNode node, int data) {
        if (node == null)
            node = new BSTNode(data);
        else {
            if (data <= node.getData())
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        return node;
    }

    public int countNodes() {
        return countNodes(root);
    }

    private int countNodes(BSTNode r) {
        if (r == null)
            return 0;
        else {

            return countNodes(r.getLeft()) + 1 + countNodes(r.getRight());

        }
    }

    public boolean search(int val) {
        return search(root, val);
    }

    private boolean search(BSTNode r, int val) {
        boolean found = false;
        while ((r != null) && !found) {
            int rval = r.getData();
            if (val < rval)
                r = r.getLeft();
            else if (val > rval)
                r = r.getRight();
            else {
                found = true;
                break;
            }
            found = search(r, val);
        }
        return found;
    }

    public void inorder() {
        inorder(root);
    }

    ArrayList<Integer> arr = new ArrayList<Integer>();

    private void inorder(BSTNode r) {
        if (r != null) {
            inorder(r.getLeft());
            System.out.print(r.getData() + " ");
            inorder(r.getRight());
        }
    }

    public void maxHeight() {
        int x = findMaxHeight(root) - 1;
        System.out.println("Max Height : " + x);
    }

    public int findMaxHeight(BSTNode root) {
        if (root == null)
            return 0;

        else {
            int left = 1 + findMaxHeight(root.getLeft());
            int right = 1 + findMaxHeight(root.getRight());

            if (left < right)
                return right;

            else
                return left;
        }
    }

    public void largestTree() {
        findLargestSubTree(root.getLeft());
        findLargestSubTree(root.getRight());
    }

    int count = 0;

    private void findLargestSubTree(BSTNode root) {
        if (root != null) {
            findLargestSubTree(root.getLeft());
            inorder(root);
            int length = arr.size();
            if (length > count)
                count = length;
            System.out.println("size is : " + length);
            arr.clear();
            //System.out.println("size is : "+arr.size());
            findLargestSubTree(root.getRight());
        }
    }

    public void sumGreater() {
        sumGreaterNodes(root, 0);
    }

    private void sumGreaterNodes(BSTNode root, int sum) {
        if (root != null) {
            sumGreaterNodes(root.getRight(), sum);
            root.data = root.getData() + sum;
            sum = root.data;
            sumGreaterNodes(root.getLeft(), sum);
        }
    }

    public void checkInternalNodes() {
        checkInternalNodesHasOneChild(root);
    }

    private void checkInternalNodesHasOneChild(BSTNode root) {
        while (root != null) {
            if (root.getLeft() != null && root.getRight() == null) {
                root = root.getLeft();
            } else if (root.getLeft() == null && root.getRight() != null) {
                root = root.getRight();
            } else if (root.getLeft() != null && root.getRight() != null) {
                System.out.println("not a one node tree");
                break;
            } else if (root.getLeft() == null && root.getRight() == null) {
                System.out.println("yeahhhhh its a one node tree!!!");
                break;
            }

        }
    }
}

public class BinarySearchCheckInternalNodes {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        BST bst = new BST();
        //BST bst1=new BST();
        System.out.println("Binary Search Tree Test\n");
        bst.insert(20);
        bst.insert(10);
        bst.insert(11);
        bst.insert(13);
        bst.insert(12);
        //bst.insert(0);


        System.out.print("\nIn order : ");
        bst.inorder();
        //bst.maxHeight();
        System.out.println("\n");
        //bst.betweenRange(3,6);
        //bst.largestTree();
        //System.out.println("Largest subtree size is : "+bst.count);
        //bst.sumGreater();
        //bst.ceil(7);
        bst.checkInternalNodes();
        bst.inorder();

    }
}