package code.linked_list;

public class MiddleElement {

    static Node head;

    static class Node {
        int item;
        Node next;

        Node(int data) {
            item = data;
            next = null;
        }
    }

    public static void main(String[] args) {
        MiddleElement list = new MiddleElement();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(6);
        list.push(7);
        findMiddleElement();
    }

    private static void findMiddleElement() {
        Node slow_ptr = head;
        Node fast_ptr = head;
        if (head != null) {
            while (fast_ptr != null && fast_ptr.next != null) {
                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
            }
            System.out.println(slow_ptr.item);
        }

    }

    private void push(int i) {
        Node new_node = new Node(i);
        new_node.next = head;
        head = new_node;
    }
}
