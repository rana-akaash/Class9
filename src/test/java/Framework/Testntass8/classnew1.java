package Framework.Testntass8;

import org.testng.annotations.Test;

public class classnew1 {

	@Test
	public void test1()
	{
		System.out.println("Test  from classnew1 without Group 1, printed");
	}
	@Test(groups="group1")
	public void test2()
	{
		System.out.println("Test 2 from classnew1 with Group 1, printed");
	}
	@Test
	public void test3()
	{
		System.out.println("Test 3 from classnew1 without Group 1, printed");
	}
	@Test(groups="group1")
	public void test4()
	{
		System.out.println("Test 4 from classnew1 with Group 1, printed");
	}
}
