import TreePackage.BinarySearchTree;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

    @Test
    void initializeReservedWords() {
        Parser parser = new Parser("src/main/java/Palindrome.java");
        assertNotNull(parser.reservedArray);
        assertNotNull(parser.reservedTree);
        assertTrue(parser.reservedTree.contains("boolean"));
    }

    @Test
    void getIdentifiers() {
        Parser parser = new Parser("src/main/java/Palindrome.java");
        assertNotNull(parser.identifiers);
        assertNotNull(parser.userTree);
        assertTrue(parser.userTree.contains("Palindrome"));
    }

    @Test
    void setBalancedBST() {
        Parser parser = new Parser();
        parser.identifiers.add("a");
        parser.identifiers.add("b");
        parser.identifiers.add("c");
        parser.setBalancedBST(parser.identifiers, parser.userTree);
        assertEquals(parser.userTree.getRootData(), "b");
    }
}