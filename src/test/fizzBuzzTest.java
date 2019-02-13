package test;



import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import fizzBuzz.FizzBuzz;

public class fizzBuzzTest {
	private FizzBuzz fb;
	
	@Before
	public void createFizzBuzzObject() {
	fb = new FizzBuzz();
	}
	
	@Test
	public void testIfIndex1prints1() {
		assertEquals("1", fb.getValueAtIndex(1));
	}
	
	@Test
	public void testIfIndex2prints2() {
		assertEquals("2", fb.getValueAtIndex(2));
	}
	
	@Test
	public void testIfDividableBy3AndNot5PrintsFizz() {
		assertEquals("Fizz", fb.getValueAtIndex(3));
		assertEquals("Fizz", fb.getValueAtIndex(6));
		assertEquals("Fizz", fb.getValueAtIndex(9));
	}
	
	@Test
	public void testIfDividableBy5AndNot3PrintsBuzz() {
		assertEquals("Buzz", fb.getValueAtIndex(5));
		assertEquals("Buzz", fb.getValueAtIndex(10));
		assertEquals("Buzz", fb.getValueAtIndex(20));
	}
	
	@Test
	public void testIfDividableBy3And5PrintsFizzBuzz() {
		assertEquals("FizzBuzz", fb.getValueAtIndex(15));
		assertEquals("FizzBuzz", fb.getValueAtIndex(30));
		assertEquals("FizzBuzz", fb.getValueAtIndex(45));
	}
	
	@Test
	public void checkIfResultInTable() {
		fb.resultToTable();
		assertEquals(fb.getValueAtIndex(15), fb.resultTable.get(14));
	}
	
	@Test
	public void testIf100ElementsInArray() {
		fb.resultToTable();
		assertEquals(100, fb.resultTable.size());
	}
}
