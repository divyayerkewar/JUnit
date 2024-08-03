package junit5test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class NumberTest {
	@Test
    void testNumberIsPositive() {
        int number = 5;
        assertTrue(number > 0);
        number = -5;
        assertFalse(number > 0);
    }
	
	 @Test
	 void testnumberispositive() {
		 
	 }
	 
	
	
}

