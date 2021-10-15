package code.dsa;

public class Trie {

    private Node root;

    public Trie() {
        root = new Node('\0');
    }

    public void insert(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (current.children[c - 'a'] == null) {
                current.children[c - 'a'] = new Node(c);
            }
            current = current.children[c - 'a'];


        }
        current.isword = true;
    }

    private Node getNode(String word) {
        Node current = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (current.children[c - 'a'] == null) return null;
            current = current.children[c - 'a'];

        }
        return current;
    }

    public boolean search(String word) {
        Node node = getNode(word);
        return node != null && node.isword;
    }

    public boolean startsWith(String prefix) {
        return getNode(prefix) != null;
    }

    class Node {
        public char c;
        public boolean isword;
        public Node[] children;
        public Node(char c) {
            this.c = c;
            isword = false;
            children = new Node[26];
        }
    }
}
