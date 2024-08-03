package junit5test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import JUnit5example.Calculator;

public class Beforeandaftertest {
	Calculator calc;
	@BeforeEach
	public void init()
	{
		calc = new Calculator();
		System.out.println("Initializing the calculator instance");
	}
	
	
	@Test
    public void testMethod()
    {
  	  
  	  int sum = calc.add(10,20);
  	  System.out.println("The total is: " + sum);
  			 
    }
    @Test
    public void testmethod2()
    {
  	 
  	  int sum = calc.add(-20, -30);
  	  System.out.println("The total is: " + sum);
    }
    @AfterEach
    public void teatDown()
    {
    	System.out.println("Test Method executed success");
    }
}
