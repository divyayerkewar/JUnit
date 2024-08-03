package junit5test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest  {
       
	 /*@Test
	 public void assumeTrueTest()
	 {
		 Assumptions.assumeTrue(true);
		// if(true)
	   // Assertions.assertTrue(true);
         System.out.println("Executing as Assumption is true");
	 }

}*/
	
	
	@Test
	void testonlydevenvironment() {
		Assumptions.assumeTrue("Dev".equals(System.getenv("ENV")));
	}
	

}