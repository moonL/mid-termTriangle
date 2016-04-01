import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class testTriangle {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Triangle tr = new Triangle(1, 2, 3);
		assertEquals("Illegal", tr.getType(tr));
		Triangle tr2 = new Triangle(-1, 2, 3);
		assertEquals("Illegal", tr.getType(tr2));
		Triangle tr3 = new Triangle(Long.MAX_VALUE+1, 2, 3);
		assertEquals("Illegal", tr.getType(tr3));
		
	}
	@Test
	public void test2() {
		Triangle tr = new Triangle(2, 2, 2);
		assertEquals("Regular", tr.getType(tr));
	}
	@Test
	public void test3() {
		Triangle tr = new Triangle(4, 2, 3);
		assertEquals("Scalene", tr.getType(tr));
	}
	@Test
	public void test4() {
		Triangle tr = new Triangle(2, 2, 3);
		assertEquals("Isosceles", tr.getType(tr));
	}
	@Test
	public void test5() {
		Triangle tr = new Triangle(2, 2, 3);
		long[] l = {2, 2, 3};
		
		assertArrayEquals(l, tr.getBorders());
	}
	

}
