package junit5test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserFalseTest {

	 @Test
	 void testIsNotAdult() {
		 User user = new User(10);
	 
	 
         boolean result = user.isAdult();
         
         assertFalse(result);
}
}