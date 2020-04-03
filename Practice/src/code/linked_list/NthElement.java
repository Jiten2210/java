package code.linked_list;

public class NthElement {
    static Node head;

    static class Node {
        int item;
        Node next;

        Node(int i) {
            item = i;
            next = null;
        }
    }

    public static void main(String[] args) {

        NthElement list = new NthElement();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        System.out.println("Nth element is : ----- > " + getNth(3));
    }

    private static int getNth(int i) {
        return getNthElement(head, i);
    }

    private void push(int i) {
        Node new_node = new Node(i);
        new_node.next = head;
        head = new_node;

    }

    static int getNthElement(Node head, int n) {
        int count = 1;
        if (count == n)
            return head.item;
        return getNthElement(head.next, n - 1);
    }

}
