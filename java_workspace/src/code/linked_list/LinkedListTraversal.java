package code.linked_list;

public class LinkedListTraversal {
    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        LinkedListTraversal list = new LinkedListTraversal();
        list.head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        list.head.next = n1;
        n1.next = n2;
        list.traverseList();
    }

    private void traverseList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
