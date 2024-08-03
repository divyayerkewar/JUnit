package junit5test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class Taggingtest {
    @Test
    @Tag("smoke")
	public void taggingTest1()
	{
		System.out.println("This is smoke test in tagging 1 method");
	}
    @Test
    @Tag("sanity")
	public void taggingTest2()
	{
		System.out.println("This is sanity test in tagging 2  method");
	}
    @Test
    @Tag("smoke")
	public void taggingTest3()
	{
		System.out.println("This is smoke test in tagging 3 method");
	}
    @Test
    @Tag("regression")
	public void taggingTest4()
	{
		System.out.println("This is regression test in tagging 4 method");
	}
    @Test
    @Tag("sanity")
	public void taggingTest5()
	{
		System.out.println("This is sanity test in tagging 5 method");
	}
    @Test
    @Tag("regression")
	public void taggingTest6()
	{
		System.out.println("This is regression test in tagging 6 method");
	}
}

