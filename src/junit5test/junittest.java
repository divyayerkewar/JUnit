package junit5test;

import org.junit.jupiter.api.Test;

import JUnit5example.Calculator;

public class junittest {
	          @Test
              public void testMethod()
              {
            	  Calculator calc = new Calculator();
            	  int sum = calc.add(10,20);
            	  System.out.println("The total is: " + sum);
            			 
              }
              @Test
              public void testmethod2()
	          {
	        	  Calculator calc = new Calculator();
	        	  int sum = calc.add(-20, -30);
	        	  System.out.println("The total is: " + sum);
	          }
            	   
              }

