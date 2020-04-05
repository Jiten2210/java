package code.tree;

public class TreeSize {
	Node root;

	public static void main(String[] args) {
		TreeSize tree = new TreeSize();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		System.out.println("the size of a tree is " + tree.size());
	}

	private int size() {
		return size(root);
	}

	private int size(Node root) {
		if (root == null)
			return 0;
		else
			return size(root.left) + size(root.right) + 1;
	}

}

   class Node {
	int data;
	Node left, right;

	Node(int d) {
		data = d;
		left = right = null;
	}

}