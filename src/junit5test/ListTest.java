package junit5test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ListTest {
    
	@Test
	void testlisisempty()
	{
		List<String> list = new ArrayList<>();
		assertTrue(list.isEmpty());
	//	list.add("JUnit");
		assertFalse(list.isEmpty());
	}

	
	}
	
	
