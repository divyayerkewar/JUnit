package junit5test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class StringTest {

	@Test
	void teststringcontainssubstring() {
		String str = "JUnit 5 is great";
		assertTrue(str.contains("JUnit"));
	    assertFalse(str.contains("5"));
	}
	
	
	
}
