package Framework.Testntass8;

import org.testng.annotations.Test;

public class classnew2 {

	@Test(groups="group1")
	public void test1()
	{
		System.out.println("Test 1 from classnew2 with Group 1, printed");
	}
	@Test
	public void test2()
	{
		System.out.println("Test 2 from classnew2 without Group 1, printed");
	}
	@Test
	public void test3()
	{
		System.out.println("Test 3 from classnew2 without Group 1, printed");
	}
}
