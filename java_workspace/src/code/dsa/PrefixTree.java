package code.dsa;
public class PrefixTree
{
    static TrieNode createTree()
    {
        return(new TrieNode('\0'));
    }

    static void insertWord(TrieNode root, String word)
    {
        int offset = 97;
        int l = word.length();
        char[] letters = word.toCharArray();
        TrieNode curNode = root;

        for (int i = 0; i < l; i++)
        {
            if (curNode.links[letters[i]-offset] == null)
                curNode.links[letters[i]-offset] = new TrieNode(letters[i]);
            curNode = curNode.links[letters[i]-offset];
        }
        curNode.fullWord = true;
    }

    static boolean find(TrieNode root, String word)
    {
        char[] letters = word.toCharArray();
        int l = letters.length;
        int offset = 97;
        TrieNode curNode = root;

        int i;
        for (i = 0; i < l; i++)
        {
            if (curNode == null)
                return false;
            curNode = curNode.links[letters[i]-offset];
        }

        if (i == l && curNode == null)
            return false;

        if (curNode != null && !curNode.fullWord)
            return false;

        return true;
    }

    static void printTree(TrieNode root, int level, char[] branch)
    {
        if (root == null)
            return;

        for (int i = 0; i < root.links.length; i++)
        {
            branch[level] = root.letter;
            printTree(root.links[i], level+1, branch);
        }

        if (root.fullWord)
        {
            for (int j = 1; j <= level; j++)
                System.out.print(branch[j]);
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        TrieNode tree = createTree();

        String[] words = {"an", "ant", "all", "allot", "alloy", "aloe", "are", "ate", "be"};
        for (int i = 0; i < words.length; i++)
            insertWord(tree, words[i]);

        char[] branch = new char[50];
        printTree(tree, 0, branch);

        String searchWord = "all";
        if (find(tree, searchWord))
        {
            System.out.println("The word was found");
        }
        else
        {
            System.out.println("The word was NOT found");
        }
    }
}

class TrieNode
{
    char letter;
    TrieNode[] links;
    boolean fullWord;

    TrieNode(char letter)
    {
        this.letter = letter;
        links = new TrieNode[26];
        this.fullWord = false;
    }
}