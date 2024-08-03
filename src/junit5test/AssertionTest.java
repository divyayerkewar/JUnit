package junit5test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import JUnit5example.Calculator;

public class AssertionTest {
             Calculator calc;
             @BeforeEach
             public void init () {
            	 calc = new Calculator();
            	 
             }
             @Test
             public void assertequalsTest()
             {
            	 int sum = calc.add(2, 2);
            	 assertEquals(3,sum,"failure message");
             }
             @Test
             public void assertNotequalsTest()
             {
            	 int sum = calc.add(2, 2);
            	 assertNotEquals(4,sum,"failure message");
             }
             
             @Test
             public void assertArrayEqualsTest()
             {
            	 Assertions.assertArrayEquals(new int[] {1,2,3}, new int[] {5,6,7,8});
             }
             
             @Test
             public void assertNullTest()
             {
            	 String divya= " y";
            	
            	 Assertions.assertNotNull(divya);
             }
             @Test
             public void assertTrueTest()
             {
            	boolean trueValue =true;
            	boolean falseValue = false;
            	Assertions.assertTrue(falseValue);
             }
             @Test
             public void assertFalseTest()
             {
            	boolean trueValue =true;
            	boolean falseValue = false;
            	Assertions.assertFalse(trueValue,"test failed ");
             }
}
