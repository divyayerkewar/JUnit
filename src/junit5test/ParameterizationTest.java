package junit5test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runners.Parameterized.Parameter;

public class ParameterizationTest {
     
	/*
	 * @ValueSource
	 * @EnumSource
	 * @MethodSource
	 * @CsvSource
	 * @CsvFileSource
	 * @ArgumentsSource
	 */
	
	//------------------------@ValueSource-----------------------------------------------
	
	@ParameterizedTest(name = "{index}  -run test with args = {0}" )
	@ValueSource(ints = {1,2,3,4} )
	public void valueSourceTest(int args)
	{
		System.out.println(args);
	}
	  @ParameterizedTest
	  @ValueSource(strings = {"Banana","Apple","Orange"})
	
       public void valueSourceTest1( String fruits )
       {
		  System.out.println(fruits);
       }
	 //-----------------------@EnumSource----------------------------------------------------
            enum fruits{ apple, banana,orange,mango}
            
            @ParameterizedTest
      	    @EnumSource(fruits.class)
      	
             public void EnumSource1( Enum fruits )
             {
      		  System.out.println(fruits);
             }   
            
          //--------------------MethodSource------------------------------------------------
            
            private static String [] fruits()
            {
            	return new String[] {"apple", "banana","mango"};
            	
            }
            @ParameterizedTest
            @MethodSource("fruits")
            public void methodsourcetest(String fruit) {
            	System.out.println(fruit);
           
}          
 //--------------------------------@CsvSource-----------------------------------------------           
      @ParameterizedTest
      @CsvSource({
    	  "java,programming language",
    	  "junit5,unit testing,framework",
    	  "github,repositiory"
      })
    public void CSvSourceTest(String technology , String description)
    {
    	System.out.println(technology + "-" + description);
    }
            
            
            
            
            
}            
            
            
            

