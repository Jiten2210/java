package code.linked_list;

class SearchElement {

    static Node head;

    static class Node {
        int value;
        Node next;

        Node(int d) {
            value = d;
            next = null;
        }
    }

    public static boolean search(Node head, int num) {
        // Base case
        if (head == null) {
            return false;
        }

        // Recursive case
        else {
            if (head.value == num) {
                return true;
            } else {
                return search(head.next, num);
            }
        }
    }

    public static void main(String args[]) {
        /* Start with the empty list */
        SearchElement list = new SearchElement();
        list.insertAtHead(0);
        list.insertAtHead(3);
        list.insertAtHead(1);
        list.insertAtHead(6);
        list.insertAtHead(4);

        System.out.println("Linked List: ");
        for (Node i = list.head; i != null; i = i.next) {
            System.out.print(i.value + " ");
        }

        System.out.println(" ");
        int searchFor = 4;
        boolean result = search(list.head, searchFor);
        System.out.println("Is " + searchFor + " present in the list? : " + result);
    }

    private void insertAtHead(int i) {
        Node new_node = new Node(i);
        new_node.next = head;
        head = new_node;
    }
}