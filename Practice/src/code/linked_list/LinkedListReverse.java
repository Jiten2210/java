package code.linked_list;

public class LinkedListReverse {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        LinkedListReverse list = new LinkedListReverse();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse();
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
        reverse();
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    private static Node reverse() {
        Node prev = null;
        Node next = null;
        Node current = head;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;

    }

    private void push(int i) {
        Node new_node = new Node(i);
        new_node.next = head;
        head = new_node;

    }
}
