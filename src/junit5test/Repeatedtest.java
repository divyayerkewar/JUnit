package junit5test;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class Repeatedtest {
         // @Test
          @RepeatedTest(2)
          public void repeatedtestMethod()
          {
        	 System.out.println("I am executing this test multiple times."); 
          }
          @RepeatedTest(value=7,name  = "{displayName}")
          public void repeatedtestmethod1()
          
          {
        	  System.out.println("I am executing this test multiple times."); 
          }
         
}
