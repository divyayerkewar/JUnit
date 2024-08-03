package junit5test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertEqualsexample {
               @Test
                void testaddition()
                {
            	  int expected  = 5;
                  int actual = 2 + 3;
                  assertEquals(expected,actual);
            	  }
                
                   
             @Test
             void teststring()
             {
              String expected = "Divya";
              String actual = "World";
              assertEquals(expected,actual);
             }
             @Test
             void testArray()
             {
            	int[] expected = {1,2,3};
            	int[] actual = {1,2,3};
            	assertArrayEquals(expected,actual);
             }
          @Test   
        void testname()
        {
        	int expected  = 7;
        	int actual = 6+1;
        	assertEquals(expected,actual);
        }
             @Test
             void testnumber() {
            	 int [] expected = {8};
            	 int [] actual = {7};
            	 Assertions.assertArrayEquals(expected,actual);
            			 
             }
        
             }