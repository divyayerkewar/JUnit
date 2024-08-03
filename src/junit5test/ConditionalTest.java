package junit5test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;

import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ConditionalTest {
          @Test
          @EnabledOnOs(OS.WINDOWS)
          public void conditionOnOS()
          {
        	  System.out.println("Execute this test only in Window machine");
          }
          @Test
          @EnabledForJreRange(min =JRE.JAVA_11,max = JRE.JAVA_20)
          public void conditionONJreRange()
          {
        	  System.out.println("Execute this test only for range 11-21");
          }
          @Test
          public void conditionOnSystemProperty()
          {
        	  System.out.println(System.getProperty("user.dir"));
          }
}
