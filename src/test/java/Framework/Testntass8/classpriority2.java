package Framework.Testntass8;

import org.testng.annotations.Test;

public class classpriority2 {
	
	@Test(priority=3)
	public void test1()
	{
		System.out.println("Test 1 from classpriority2 with priority 3, printed");
	}
	@Test(priority=2)
	public void test2()
	{
		System.out.println("Test 2 from classpriority2 with priority 3, printed");
	}
	@Test(priority=1)
	public void test3()
	{
		System.out.println("Test 3 from classpriority2 with priority 1, printed");
	}

}
