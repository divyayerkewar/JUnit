package junit5test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import JUnit5example.Calculator;

public class Nestedtest {
	
           Calculator calc;
           @BeforeEach
           public void init()
           {
        	   calc = new Calculator();
           }
           @Nested
           class addPositiveNumber
           {
        	   @Test
               public void addSmallPositiveNUmber()
               {
            	   int sum = calc.add(2,3);
            	   System.out.println(sum);
               }
               @Test
               public void addBigPositiveNUmber()
               {
            	   int sum = calc.add(100,50);
            	   System.out.println(sum);
           }
           @Nested
           class addNegativeNumber
           {
        	   @Test
               public void addBigNegativeNUmber()
               {
            	   int sum = calc.add(-100,-50);
            	   System.out.println(sum);
               }
               @Test
               public void addNegativezeroNUmber()
               {
            	   int sum = calc.add(-0,-0);
            	   System.out.println(sum);
               } 
           }
           }
}