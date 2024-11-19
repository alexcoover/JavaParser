package TreePackage;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void setTree() {
        BinaryTree tree = new BinaryTree();
        tree.setTree(1,null, null);
        assertEquals(1, tree.getRootData());
    }

    @Test
    void setRootData() {
        BinaryTree tree = new BinaryTree(1);
        tree.setRootData(2);
        assertEquals(2, tree.getRootData());
    }

    @Test
    void getRootData() {
        BinaryTree tree = new BinaryTree(1);
        tree.setRootData(2);
        assertEquals(2, tree.getRootData());
    }

    @Test
    void isEmpty() {
        BinaryTree tree = new BinaryTree();
        assertTrue(tree.isEmpty());
    }

    @Test
    void clear() {
        BinaryTree tree = new BinaryTree(1);
        tree.clear();
        assertTrue(tree.isEmpty());
    }

    @Test
    void getHeight() {
        BinaryTree tree = new BinaryTree(1);
        assertEquals(1, tree.getHeight());
    }

    @Test
    void getNumberOfNodes() {
        BinaryTree tree = new BinaryTree(1);
        assertEquals(1, tree.getNumberOfNodes());
    }

    @Test
    void setRootNode() {
        BinaryTree tree = new BinaryTree(1);
        tree.setRootNode(null);
        assertNull(tree.getRootNode());
    }

    @Test
    void getRootNode() {
        BinaryTree tree = new BinaryTree(1);
        assertEquals(1, tree.getRootNode().getData());
    }

    @Test
    void getPreorderIterator() {
        BinaryTree tree = new BinaryTree(1);
        assertEquals(1, tree.getPreorderIterator().next());
    }

    @Test
    void getPostorderIterator() {
        BinaryTree tree = new BinaryTree(1);
        assertEquals(1, tree.getPostorderIterator().next());
    }

    @Test
    void getInorderIterator() {
        BinaryTree tree = new BinaryTree(1);
        assertEquals(1, tree.getInorderIterator().next());
    }

    @Test
    void getLevelOrderIterator() {
        BinaryTree tree = new BinaryTree(1);
        assertEquals(1, tree.getLevelOrderIterator().next());
    }

    @Test
    void iterativePreorderTraverse() {
        BinaryTree tree = new BinaryTree(1);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        tree.iterativePreorderTraverse();
        assertEquals("1 ", outContent.toString());
    }

    @Test
    void iterativeInorderTraverse() {
        BinaryTree tree = new BinaryTree(1);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        tree.iterativeInorderTraverse();
        assertEquals("1 ", outContent.toString());
    }
}