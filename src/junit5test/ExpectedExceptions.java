package junit5test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExpectedExceptions {

	
	@Test
	public void expectedexceptionstest1()
	{
		Assertions.assertThrows(ArithmeticException.class,()-> divide(2,2));
		System.out.println("test passed as we handles the exception");
	}
	
	
	private int divide(int a,int b)
	{
		return a/b;
	}
	
	
	private void readfile() throws IOException 
	{
		FileInputStream fis = new FileInputStream("./abcd.xls");
		fis.read();
		fis.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}







