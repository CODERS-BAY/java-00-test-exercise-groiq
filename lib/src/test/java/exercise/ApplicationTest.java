package exercise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ApplicationTest {

	@Test
	void testCalculation() {
		assertEquals(3, Application.calculation(2, 1));
	}

	@Test
	void testEvalExpression() {
		assertTrue(Application.evalExpression(true, false));
	}

	@Test
	void testPrintArray() {
		System.out.println("You can also print out the console\nThe array will be printed below:");
		Application.printArray(new int[] { 1, 2, 3, 4 });
	}

}
