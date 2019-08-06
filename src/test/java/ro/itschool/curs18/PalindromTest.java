package ro.itschool.curs18;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromTest {
    protected Palindrom palindrom;

    @BeforeEach
    void setup() {
        palindrom = new Palindrom1Index();
    }

    @Test
    @DisplayName("mama is not palindrome")
    void notPalindrome() {
        assertFalse(palindrom.check("mama"));
    }

    @Test
    @DisplayName("Ana is palindrome")
    void correctPalindrome() {
        assertTrue(palindrom.check("Ana"));
    }

    @Test
    @DisplayName("a is palindrome")
    void singleLetter() {
        assertTrue(palindrom.check("a"));
    }

    @Test
    @DisplayName("'' is palindrome")
    void emptyString() {
        assertTrue(palindrom.check(""));
    }

    @Test
    @DisplayName("null is not palindrome")
    void nullNotPalindrome() {
        assertFalse(palindrom.check(null));
    }

}