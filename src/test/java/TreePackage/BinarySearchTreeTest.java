package TreePackage;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    @Test
    void setTree() {
        BinarySearchTree tree = new BinarySearchTree();
        BinaryTreeInterface binaryTree = new BinaryTree(1);
        BinaryTreeInterface binaryTree2 = new BinaryTree(2);
        assertThrows(UnsupportedOperationException.class,
                () -> tree.setTree(3, binaryTree, binaryTree2));
    }

    @Test
    void getEntry() {
        BinarySearchTree tree = new BinarySearchTree(1);
        assertEquals(1, tree.getEntry(1));
    }

    @Test
    void contains() {
        BinarySearchTree tree = new BinarySearchTree(1);
        assertTrue(tree.contains(1));
    }

    @Test
    void add() {
        BinarySearchTree tree = new BinarySearchTree(1);
        tree.add(2);
        assertTrue(tree.contains(2));
    }

    @Test
    void remove() {
        BinarySearchTree tree = new BinarySearchTree(1);
        tree.remove(1);
        assertFalse(tree.contains(1));
    }

    @Test
    void balanceBST() {
        BinarySearchTree tree = new BinarySearchTree("a");
        tree.add("b");
        tree.add("c");
        tree.add("d");
        tree.add("e");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        tree.balanceBST();
        tree.iterativePreorderTraverse();
        assertEquals("c a b d e ", outContent.toString());

    }
}