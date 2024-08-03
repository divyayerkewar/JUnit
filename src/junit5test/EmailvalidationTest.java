package junit5test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmailvalidationTest {
	private EmailvalidationService emailvalidationservice;
	
	
@BeforeEach
public void setup() {
	emailvalidationservice = new EmailvalidationService();
}
@Test
public void testvalidemail(){
	assertTrue(emailvalidationservice.isvalidemail("test@example.com"));
	
}
	

@Test
public void testinvalidemail() {
	assertFalse(emailvalidationservice.isvalidemail("testexamplecom"));
}
	}


