package junit5test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class assertTrue {

	 //@Test
	/* void testconditionistrue()
	 {
		boolean condition= 10>3;
		Assertions.assertTrue(condition);
	 }*/
	
	 
	@Test
	void testcondition() {
		
		boolean condition = (10 == 20);
		Assertions.assertTrue(condition);
	}
	
	
	@Test
	void testistrue() {
	 boolean A = ("Divya" == "Divy");
		Assertions.assertFalse(A);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
