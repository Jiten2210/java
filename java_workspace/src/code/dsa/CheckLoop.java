package code.dsa;

class Link {
    public int data1;
    public Link nextLink;

    public Link(int d1) {
        data1 = d1;

    }

    public void printLink() {
        System.out.print(data1 + " ");
    }
}

class LinkList {
    private Link first;
    private int maxSize = 20;
    private int[] stackArray = new int[maxSize];
    private int top = -1;

    public void push(int j) {
        stackArray[++top] = j;
    }

    public int pop() {
        return stackArray[top--];
    }

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insert(int d1) {
        Link link = new Link(d1);
        link.nextLink = first;
        first = link;
    }

    public Link delete() {
        Link temp = first;
        first = first.nextLink;
        return temp;
    }

    public void printList() {
        Link currentLink = first;
        System.out.print("List: ");
        while (currentLink != null) {
            currentLink.printLink();
            currentLink = currentLink.nextLink;
        }
        System.out.println("");
    }

    public void checkLoop() {
        Link head = first;
        Link slow = head;
        Link fast = head.nextLink;
        while (slow != null && fast != null) {
            if (slow == fast) {
                System.out.println("loop found");
                break;
            }
            slow = slow.nextLink;
            fast = (fast.nextLink != null) ? fast.nextLink.nextLink : fast.nextLink;
        }
        System.out.println("Yippi   No loop found!!");
    }
}

class CheckLoop {
    public static void main(String[] args) {
        LinkList list = new LinkList();

        list.insert(1);
        list.insert(2);
        list.insert(1);
        list.insert(1);
        list.insert(2);
        list.insert(1);

        list.printList();
        list.checkLoop();


    }
}