package code.linked_list;

public class DeleteAlternateNodes {

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

        DeleteAlternateNodes list = new DeleteAlternateNodes();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.deleteAlternateNode();
        list.printList();
    }

    private void deleteAlternateNode() {
        {
            if (head == null)
                return;
            Node prev = head;
            Node now = head.next;

            while (prev != null && now != null) {
                prev.next = now.next;
                now = null;
                prev = prev.next;
                if (prev != null)
                    now = prev.next;
            }
        }

    }

    private void push(int i) {
        Node new_node = new Node(i);
        new_node.next = head;
        head = new_node;

    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.item + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
