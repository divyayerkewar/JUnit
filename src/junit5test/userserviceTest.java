package junit5test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class userserviceTest {
	private userservice userService;

    @BeforeEach
    void setUp() {
        userService = new userservice();
        userService.registerusername("existingUser");
    }

    @Test
    void testUsernameIsAvailable() {
        String newUsername = "newUser";
        assertTrue(userService.isusernameavaliable(newUsername), "The username should be available");
   
}
	
	}


