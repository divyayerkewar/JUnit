package junit5test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class assertArray {
	@Test
    void testIntegerArrayEquality() {
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        assertArrayEquals(expected, actual, "Arrays should be equal");
    }
	@Test
	void testNullArrays() {
	    int[] expected = {1};
	    int[] actual = null;
	    assertArrayEquals(expected, actual, "Both arrays should be null");
}

	
	@Test
	void testArray() {
		int [] expected = {11,12};
		int [] actual = {11,12};
		Assertions.assertArrayEquals(expected,actual);
	}
	
	
	@Test
	void String() {
		String expected = "HEllo";
		String actual = "World";
		 Assertions.assertEquals(expected, actual);
		
	}
	
	
	
}