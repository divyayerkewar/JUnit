package junit5test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class assertNotEquals {
     @Test
     void testsubstraction()
     {
    	 int unexpected = 0;
    	 int actual = 2-2;
    	 Assertions.assertNotEquals(unexpected,actual);
     }
     @Test
     void teststring()
     {
      String unexpected = "divya";
      String actual = "World";
      Assertions.assertNotEquals(unexpected,actual);
     }
     
     @Test
     void testString() {
    	 String expected = "D";
    	 String actual = "D";
    	 Assertions.assertEquals(expected, actual);
    	 
     }
     
}


