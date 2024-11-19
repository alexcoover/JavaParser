import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import TreePackage.*;
import java.util.Scanner;

/**
 * Parser class parses a file and determines which words or numbers
 * are "reserved" or "user identifiers"
 */

public class Parser {
    ///List for storing reserved words
    public ArrayList<String> reservedArray;
    ///list for storing user words
    public ArrayList<String> identifiers;
    ///BST for storing reserved words
    public BinarySearchTree<String> reservedTree;
    ///BST for storing user words
    public BinarySearchTree<String> userTree;

    ///Empty constructor that initializes lists and trees
    public Parser() {
        reservedArray = new ArrayList<>();
        identifiers = new ArrayList<>();
        reservedTree = new BinarySearchTree<>();
        userTree = new BinarySearchTree<>();
    }

    /**
     * Constructor that receives
     * @param filepath - the file to be parsed
     * and calls the function to initialize reserved words
     * then the function to find the user identifiers in the file
     */
    public Parser(String filepath) {
        reservedArray = new ArrayList<>();
        identifiers = new ArrayList<>();
        reservedTree = new BinarySearchTree<>();
        userTree = new BinarySearchTree<>();
        initializeReservedWords();
        getIdentifiers(filepath);
    }

    /**
     * Initializes the reserved words from the "src/reservedWords.txt" file
     * and adds them to the reservedTree
     *
     * @throws RuntimeException if the file cannot be found.
     */
    public void initializeReservedWords() {
        File file = new File("src/reservedWords.txt");

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                reservedArray.add(scanner.next());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        setBalancedBST(reservedArray, reservedTree);
    }

    /**
     * Extracts user identifiers from
     * @param filepath - the file being parsed.
     *
     * Identifiers are extracted using a delimiter that excludes non-alphanumeric
     * characters. Reserved words are excluded from the user identifiers.
     *
     * @throws RuntimeException if the file cannot be found.
     */
    public void getIdentifiers(String filepath) {
        File file = new File(filepath);
        try {
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("[^a-zA-Z0-9]+");
            while (scanner.hasNext()) {
                String word = scanner.next();

                if (!reservedTree.contains(word)) {
                    identifiers.add(word);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        setBalancedBST(identifiers, userTree);
    }

    /**
     * Migrates elements from list to BST
     * before calling the balanceBST function
     *
     * @param list - the elements to be added to the BST
     *
     * @param tree - the BST that will be balanced
     */
    public void setBalancedBST(ArrayList<String> list, BinarySearchTree<String> tree) {
        for (String s : list) {
            tree.add(s);
        }
        tree.balanceBST();
    }
}