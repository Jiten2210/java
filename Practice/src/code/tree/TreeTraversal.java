package code.tree;

public class TreeTraversal {
	Node root;

	public static void main(String[] args) {
		TreeTraversal tree = new TreeTraversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		System.out.println("--- In Order----");
		tree.printInOrder();
		System.out.println("--- Pre Order----");
		tree.printPreOrder();
		System.out.println("--- Post Order----");
		tree.printPostOrder();
	}

	private void printPreOrder() {
		printPreorder(root);

	}

	private void printPostOrder() {
		printPostorder(root);
	}

	private void printInOrder() {
		printInorder(root);

	}

	private void printPostorder(Node root) {
		if (root == null)
			return;
		printPostorder(root.left);
		printPostorder(root.right);
		System.out.println(root.data);

	}

	private void printPreorder(Node root) {

		if (root == null)
			return;
		System.out.println(root.data);
		printPreorder(root.left);
		printPreorder(root.right);

	}

	private void printInorder(Node root) {

		if (root == null)
			return;
		printInorder(root.left);
		System.out.println(root.data);
		printInorder(root.right);

	}

}
