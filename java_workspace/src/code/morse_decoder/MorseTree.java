package code.morse_decoder;


public class MorseTree<E extends Comparable<E>> {


    private Node root;

    private class Node<E>{

        private Node left;

        private Node right;

        private E value;

        private Node(Node left, Node right, E value){
            this.left = left;
            this.right = right;
            this.value = value;
        }

    }

    public MorseTree(){
        root = new Node(null, null, null);
    }

    /**
     * Adds a character to the tree
     * @param symbol character to be added
     * @param code morse code corresponding to the symbol
     */
    public void add(String symbol, String code){
        Node current = root;
        for (int i=0; i<code.length(); i++){
            if (code.substring(i, i+1).equals(".")){
                if (current.left == null){
                    current.left = new Node(null, null, null);
                }
                current = current.left;
            }
            else if (code.substring(i, i+1).equals("-")){
                if (current.right == null){
                    current.right = new Node(null, null, null);
                }
                current = current.right;
            }
        }
        current.value = symbol;
    }

    /**
     * Decodes a morse code String
     * @param code morse code to be decoded
     * @return character represented by morse code
     */
    public String decode(String code){
        Node current = root;
        boolean exists = true;
        for (int i=0; (i<code.length() && exists); i++){
            if (code.substring(i, i+1).equals(".")){
                if (current.left == null){
                    exists = false;
                }
                current = current.left;
            }
            else if (code.substring(i, i+1).equals("-")){
                if (current.right == null){
                    exists = false;
                }
                current = current.right;
            }
        }
        if (exists){
            return (String) current.value;
        }
        return null;
    }

}