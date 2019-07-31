package main;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalcuratorTest {
	
	@Test
	public void testSum() {
		Calcurator c = new Calcurator();
		assertEquals(60,c.add(30, 30),0);
	}
	
	@Test
	public void testSub() {
		Calcurator c = new Calcurator();
		assertEquals(60,c.sub(90, 30),0);
	}
	
	@Test
	public void testMul() {
		Calcurator c = new Calcurator();
		assertEquals(60,c.mul(2, 30),0);
	}
	
	@Test
	public void testDiv() throws Exception {
		Calcurator c = new Calcurator();
		assertEquals(60,c.div(60, 1),0);
	}
}
