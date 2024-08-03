package junit5test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserTest {

	@Test
    void testIsAdult() {
        // Arrange
        User user = new User(17);

        // Act
        boolean result = user.isAdult();

        // Assert
        assertTrue(result, "The user should be an adult");
    }
	}


