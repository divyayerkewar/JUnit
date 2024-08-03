package junit5test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AuthTest {
      private Authservice authservice;
      @BeforeEach
      public void setup() {
    	  authservice = new Authservice();
	
	}
      
      @Test
      public void testValidUserCredentials() {
          // Test with valid credentials
          assertTrue(authservice.auth("user1", "password1"), "Valid credentials should return true");
      }

      @Test
      public void testInvalidUserCredentials() {
          // Test with invalid credentials
          assertFalse(authservice.auth("user1", "wrongpassword"), "Invalid credentials should return false");
      }

      @Test
      public void testNonExistentUser() {
          // Test with non-existent user
          assertFalse(authservice.auth("nonexistentuser", "password"), "Non-existent user should return false");
      }

}
