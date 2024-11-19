import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PalindromeTest {

    @Test
    void testMain(){
        Palindrome.main(new String[]{});
    }

    @Test
    void isPalindrome() {
        assertTrue(Palindrome.isPalindrome("racecar"));
    }
}