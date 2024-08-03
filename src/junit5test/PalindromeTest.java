package junit5test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class PalindromeTest {
	 @Test
	    void testStringIsPalindrome() {
	        String str = "madam";
	        assertTrue(isPalindrome(str));
	        str = "hello";
	        assertFalse(isPalindrome(str));
	    }

	    boolean isPalindrome(String str) {
	        String reversed = new StringBuilder(str).reverse().toString();
	        return str.equals(reversed);
	    }

}
