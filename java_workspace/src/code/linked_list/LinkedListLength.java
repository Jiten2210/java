package code.linked_list;

public class LinkedListLength {
    Node head;

    static class Node {
        int item;
        Node next;

        Node(int i) {
            item = i;
            next = null;
        }
    }

    public static void main(String[] args) {
        LinkedListLength list = new LinkedListLength();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);

        System.out.println("Length of Linked list is:  " + list.getLength() + " ===== " + list.getListLength());
    }

    private int getLength() {
        Node n = head;
        int length = 0;
        while (n != null) {
            length++;
            n = n.next;
        }
        return length;
    }

    public int getCount(Node node) {
        if (node == null)
            return 0;
        return 1 + getCount(node.next);
    }

    public int getListLength() {
        return getCount(head);
    }

    private void push(int i) {
        Node new_node = new Node(i);
        new_node.next = head;
        head = new_node;

    }
}
