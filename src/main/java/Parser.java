import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import TreePackage.*;
import java.util.Scanner;

public class Parser {
    private ArrayList<String> reservedArray;
    private ArrayList<String> identifiers;
    private BinarySearchTree<String> reservedTree;
    private BinarySearchTree<String> userTree;

    public Parser() {
        reservedArray = new ArrayList<>();
        identifiers = new ArrayList<>();
        reservedTree = new BinarySearchTree<>();
        userTree = new BinarySearchTree<>();
        initializeReservedWords();
        getIdentifiers();
    }

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

    public void getIdentifiers() {
        File file = new File("src/Palindrome.java");
        file.toString();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (!reservedTree.contains(word)) {
                    identifiers.add(scanner.next());
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        setBalancedBST(identifiers, userTree);
    }

    public void setBalancedBST(ArrayList<String> list, BinarySearchTree<String> tree) {
        for (String s : list) {
            tree.add(s);
        }
        reservedTree.iterativePreorderTraverse();
        reservedTree.balanceBST();
        System.out.println();
        reservedTree.iterativePreorderTraverse();
    }

}