import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTester {

	private GradeBook gradebook1;
	private GradeBook gradebook2;

	@Before
	public void setUp() throws Exception {
		gradebook1 = new GradeBook(5);
		gradebook2 = new GradeBook(5);

		gradebook1.addScore(1337);
		gradebook1.addScore(8008);

		gradebook2.addScore(25);
		gradebook2.addScore(100);
		gradebook2.addScore(10);
	}

	@After
	public void tearDown() throws Exception {
		gradebook1 = null;
		gradebook2 = null;
	}


	@Test
	public void testAddScoreSize() {

		assertEquals("1337.0 8008.0 ", gradebook1.toString());
		assertEquals(2, gradebook1.getScoreSize());

		assertEquals("25.0 100.0 10.0 ", gradebook2.toString());
		assertEquals(3, gradebook2.getScoreSize());

	}

	@Test
	public void testSum() {

		assertEquals(9345.0, gradebook1.sum(), 0.001);
		assertEquals(135.0, gradebook2.sum(), 0.001);

	}

	@Test
	public void testMinimum() {

		assertEquals(1337.0, gradebook1.minimum(), 0.001);
		assertEquals(10.0, gradebook2.minimum(), 0.001);
	}

	@Test
	public void testFinalScore() {

		assertEquals(8008.0, gradebook1.finalScore(),0.001);
		assertEquals(125.0, gradebook2.finalScore(),0.001);

	}










}
