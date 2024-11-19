package TreePackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryNodeTest {

    @Test
    void getData() {
        BinaryNode binaryNode = new BinaryNode(1);
        assertEquals(1, binaryNode.getData());
    }

    @Test
    void setData() {
        BinaryNode binaryNode = new BinaryNode(1);
        binaryNode.setData(2);
        assertEquals(2, binaryNode.getData());
    }

    @Test
    void getLeftChild() {
        BinaryNode binaryNode = new BinaryNode(1);
        binaryNode.setLeftChild(new BinaryNode(2));
        assertEquals(2, binaryNode.getLeftChild().getData());
    }

    @Test
    void setLeftChild() {
        BinaryNode binaryNode = new BinaryNode(1);
        binaryNode.setLeftChild(new BinaryNode(2));
        assertEquals(2, binaryNode.getLeftChild().getData());
    }

    @Test
    void hasLeftChild() {
        BinaryNode binaryNode = new BinaryNode(1);
        binaryNode.setLeftChild(new BinaryNode(2));
        assertTrue(binaryNode.hasLeftChild());
    }

    @Test
    void getRightChild() {
        BinaryNode binaryNode = new BinaryNode(1);
        binaryNode.setRightChild(new BinaryNode(2));
        assertEquals(2, binaryNode.getRightChild().getData());
    }

    @Test
    void setRightChild() {
        BinaryNode binaryNode = new BinaryNode(1);
        binaryNode.setRightChild(new BinaryNode(2));
        assertEquals(2, binaryNode.getRightChild().getData());
    }

    @Test
    void hasRightChild() {
        BinaryNode binaryNode = new BinaryNode(1);
        binaryNode.setRightChild(new BinaryNode(2));
        assertTrue(binaryNode.hasRightChild());
    }

    @Test
    void isLeaf() {
        BinaryNode binaryNode = new BinaryNode(1);
        binaryNode.setLeftChild(new BinaryNode(2));
        assertTrue(binaryNode.getLeftChild().isLeaf());
    }

    @Test
    void getNumberOfNodes() {
        BinaryNode binaryNode = new BinaryNode(1);
        binaryNode.setLeftChild(new BinaryNode(2));
        binaryNode.setRightChild(new BinaryNode(3));
        assertEquals(3, binaryNode.getNumberOfNodes());
    }

    @Test
    void getHeight() {
        BinaryNode binaryNode = new BinaryNode(1);
        binaryNode.setLeftChild(new BinaryNode(2));
        assertEquals(2, binaryNode.getHeight());
    }

    @Test
    void copy() {
        BinaryNode binaryNode = new BinaryNode(1);
        binaryNode.setLeftChild(new BinaryNode(2));
        binaryNode.setRightChild(new BinaryNode(3));
        BinaryNode binaryNodeCopy = binaryNode.copy();
        assertEquals(binaryNode.getLeftChild().getData(), binaryNodeCopy.getLeftChild().getData());
    }
}