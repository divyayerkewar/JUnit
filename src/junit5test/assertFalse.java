package junit5test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class assertFalse {
	/*@Test
	void testConditionIsFalse() {
	    boolean condition = (2 < 3);
	    Assertions.assertFalse(condition, "5 should not be less than 3");
	}
	
	*/
	
	@Test
	void testString() {
		
		boolean condition = ("divya" =="divya");
		Assertions.assertTrue(condition);
	}
	



        @Test
        void testnumber() {
        	boolean condition = 11<10;
        	Assertions.assertTrue(condition);
        	
        }
        
        
        
        
}