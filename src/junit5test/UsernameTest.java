package junit5test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class UsernameTest {
	@Test
    void testUsernameIsValid() {
        String username = "user_123";
        assertTrue(isValidUsername(username));
        username = "user@123";
        assertFalse(isValidUsername(username));
    }

    boolean isValidUsername(String username) {
        return username.matches("^[a-zA-Z0-9_]+$");
    }
}

