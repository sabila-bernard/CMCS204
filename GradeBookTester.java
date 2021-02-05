import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTester {
	
	private GradeBook gradebook1;

	@Before
	public void setUp() throws Exception {
		gradebook1 = new GradeBook(5);
		gradebook1.addScore(1337);
		gradebook1.addScore(8008);
	}

	@After
	public void tearDown() throws Exception {
		gradebook1 = null;
	}
	
	
	@Test
	public void testAddScoreSize() {
		
		assertEquals("1337.0 8008.0 ", gradebook1.toString());
		assertEquals(2, gradebook1.getScoreSize());
			
	}
	
	@Test
	public void testSum() {
		
		assertEquals(9345.0, gradebook1.sum(), 0.001);
	}
	
	@Test
	public void testMinimum() {
		
		assertEquals(1337.0, gradebook1.minimum(), 0.001);
	}
	
	@Test 
	public void testFinalScore() {
		
		assertEquals(8008.0, gradebook1.finalScore(),0.001);
		
	}
	
	
	

		
		
	
	
	

}
