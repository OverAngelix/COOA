package TBB;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MissioTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test1() {
		Missio m = new Missio(1, 12, 1, 20, 1);
		assertEquals(2,m.nbRepas());
		assertEquals(0,m.nbHeb());
	}
	
	@Test
	public void test2() {
		Missio m = new Missio(1, 12, 1, 16, 1);
		assertEquals(1,m.nbRepas());
		assertEquals(0,m.nbHeb());
	}
	
	@Test
	public void test2bis() {
		Missio m = new Missio(1, 0, 1, 12, 1);
		assertEquals(1,m.nbRepas());
		assertEquals(1,m.nbHeb());
	}
	
	@Test
	public void test3() {
		Missio m = new Missio(1, 6, 1, 7, 1);
		assertEquals(0,m.nbRepas());
		assertEquals(0,m.nbHeb());
	}
	
	@Test
	public void test4() {
		Missio m = new Missio(1, 1, 1, 7, 1);
		assertEquals(0,m.nbRepas());
		assertEquals(1,m.nbHeb());
	}
	
	@Test
	public void test5() {
		Missio m = new Missio(1, 12, 5, 14, 1);
		assertEquals(9,m.nbRepas());
		assertEquals(4,m.nbHeb());
	}
	
	@Test
	public void test6() {
		Missio m = new Missio(1, 18, 5, 14, 1);
		assertEquals(8,m.nbRepas());
		assertEquals(4,m.nbHeb());
	}
	
	@Test
	public void test7() {
		Missio m = new Missio(1, 23, 5, 14, 1);
		assertEquals(7,m.nbRepas());
		assertEquals(4,m.nbHeb());
	}
	
	@Test
	public void test8() {
		Missio m = new Missio(1, 12, 5, 19, 1);
		assertEquals(10,m.nbRepas());
		assertEquals(4,m.nbHeb());
	}
	
	@Test
	public void test9() {
		Missio m = new Missio(1, 18, 5, 23, 1);
		assertEquals(7,m.nbRepas());
		assertEquals(4,m.nbHeb());
	}
	
	@Test
	public void test10() {
		Missio m = new Missio(1, 1, 5, 14, 1);
		assertEquals(7,m.nbRepas());
		assertEquals(5,m.nbHeb());
	}
	
	
	@Test
	public void test11() {
		Missio m = new Missio(1, 1, 5, 19, 1);
		assertEquals(8,m.nbRepas());
		assertEquals(5,m.nbHeb());
	}
	
	@Test
	public void test12() {
		Missio m = new Missio(1, 1, 5, 23, 1);
		assertEquals(6,m.nbRepas());
		assertEquals(5,m.nbHeb());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testIndexOutOfBoundsException() {
		Missio m = new Missio(0, 1, 5, 23, 1);
	    
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testIndexOutOfBoundsException2() {
		Missio m = new Missio(10, 1, 5, 23, 1);
	    
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testIndexOutOfBoundsException3() {
		Missio m = new Missio(10, 154, 5, 23, 1);
	    
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testIndexOutOfBoundsException4() {
		Missio m = new Missio(10, 1, 5, 484, 1);
	    
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testIndexOutOfBoundsException5() {
		Missio m = new Missio(1, 5, 1, 1, 1);
	    
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testIndexOutOfBoundsException6() {
		Missio m = new Missio(1, 5, 1, 24, 1);
	    
	}

	@Test(expected = IllegalArgumentException.class)
	public void testIndexOutOfBoundsException7() {
		Missio m = new Missio(1, 5, 1, 24, -15);
	    
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testIndexOutOfBoundsException8() {
		Missio m = new Missio(1, -5, 1, 24, -15);
	    
	}
	@Test
	public void testConstruc() {
		Missio m = new Missio(1, 5, 11, 23, 1);
		assertEquals(1,m.jDep);   
		assertEquals(11,m.jRet);
		assertEquals(5,m.hDep);  
		assertEquals(23,m.hRet);
		assertEquals(1,m.nbKm); 
	}
}
