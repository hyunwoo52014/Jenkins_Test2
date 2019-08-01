package main;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class CalcuratorTest {
	
	
	private static Calcurator cal = null;
	
	@BeforeClass
	public static void setCalcurator() throws Exception {
		cal = new Calcurator();
	}
	
	@Test
	public void testSum() {
		assertEquals(60,cal.add(30, 30),0);
	}
	
	@Test
	public void testSub() {
		assertEquals(60,cal.sub(90, 30),0);
	}
	
	@Test
	public void testMul() {
		assertEquals(60,cal.mul(2, 30),0);
	}
	
	@Test
	public void testDiv() throws Exception {
		assertEquals(60,cal.div(60, 1),0);
	}
	
	@Test
	public void test4Cal() {
		assertEquals(20,cal.sub(cal.add(10, 40),cal.sub(40,10)),0);
	}
}
