package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    @Test
    public void isPalindrome() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        assertTrue(palindromeNumber.isPalindrome(121));
        assertFalse(palindromeNumber.isPalindrome(10));
        assertEquals(true, palindromeNumber.isPalindrome(12321));
    }
}//class